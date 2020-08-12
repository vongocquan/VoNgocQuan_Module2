import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {Customer} from '../customer';
import {CustomerService} from '../customer.service';
import {ListCustomerComponent} from '../list-customer/list-customer.component';

@Component({
  selector: 'app-update-customer',
  templateUrl: './update-customer.component.html',
  styleUrls: ['./update-customer.component.css']
})
export class UpdateCustomerComponent implements OnInit {
  formCustomer: FormGroup;
  customer: Customer = new Customer();
  id: number;
  maKhachHang: string;
  dsKhachHang: Customer[];
  constructor(private activatedRoute: ActivatedRoute, private customerService: CustomerService, private router: Router) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = Number(paramMap.get('id'));
    });
    this.customerService.findById(this.id).subscribe(
      next => {
        this.customer = next;
        this.formCustomer.patchValue({maKhachHang: this.customer.maKhachHang});
        this.formCustomer.patchValue({loaiKhachHang: this.customer.loaiKhachHang});
        this.formCustomer.patchValue({hoTen: this.customer.hoTen});
        this.formCustomer.patchValue({soDienThoai: this.customer.soDienThoai});
        this.formCustomer.patchValue({soCMND: this.customer.soCMND});
        this.formCustomer.patchValue({email: this.customer.email});
        this.formCustomer.patchValue({diaChi: this.customer.diaChi});
        this.formCustomer.patchValue({ngaySinh: this.customer.ngaySinh});
      }, error => {
        this.customer = new Customer();
      }
    );
    this.maKhachHang = this.customer.maKhachHang;
    this.formCustomer = new FormGroup({
      maKhachHang: new FormControl('', [Validators.required, Validators.pattern('[K][H][-][0-9]{4}')]),
      loaiKhachHang: new FormControl('', [Validators.required]),
      hoTen: new FormControl('', [Validators.required]),
      soDienThoai: new FormControl('', [Validators.required, Validators.pattern('(([0][9][0])|([0][9][1])|([(][8][4][)][+][9][0])|([(][8][4][)][+][9][1]))([0-9]{7})')]),
      soCMND: new FormControl('', [Validators.required, Validators.pattern('([0-9]{9})|([0-9]{12})')]),
      email: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z0-9]+[@][a-zA-Z0-9]+[.][a-zA-Z0-9]+')]),
      diaChi: new FormControl('', [Validators.required]),
      ngaySinh: new FormControl('', [Validators.required])
    });
  }
  updateCustomer(): void{
    this.customer = Object.assign({}, this.formCustomer.value);
    this.customer.id = this.id;
    this.customer.maKhachHang = this.maKhachHang;
    this.customerService.updateCustomer(this.customer).subscribe(
      next => {},
      error => {},
      () => {
        this.router.navigateByUrl('home/list-customer')
        this.customerService.findAll().subscribe(
          next => {
            this.dsKhachHang = next;
          }, error => {
            this.dsKhachHang = new Array();
          }
        );
      }
    );
  }
}
