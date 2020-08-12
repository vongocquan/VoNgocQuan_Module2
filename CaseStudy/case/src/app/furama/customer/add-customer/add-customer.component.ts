import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Customer} from '../customer';
import {CustomerService} from '../customer.service';
import { Router} from '@angular/router';

@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent implements OnInit {
  formCustomer: FormGroup;
  dsKhachHang: Customer[];
  customer: Customer;
  result = '';
  constructor(private customerService: CustomerService, private router: Router) {
    this.customerService.findAll().subscribe(
      next => {
        this.dsKhachHang = next;
      }, error => {
        this.dsKhachHang = new Array();
      }
    );
  }

  ngOnInit(): void {
    this.formCustomer = new FormGroup({
      maKhachHang: new FormControl('', [Validators.required, Validators.pattern('[K][H][-][0-9]{4}')]),
      loaiKhachHang: new FormControl('Diamond'),
      hoTen: new FormControl('', [Validators.required]),
      soDienThoai: new FormControl('', [Validators.required, Validators.pattern('(([0][9][0])|([0][9][1])|([(][8][4][)][+][9][0])|([(][8][4][)][+][9][1]))([0-9]{7})')]),
      soCMND: new FormControl('', [Validators.required, Validators.pattern('([0-9]{9})|([0-9]{12})')]),
      email: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z0-9]+[@][a-zA-Z0-9]+[.][a-zA-Z0-9]+')]),
      diaChi: new FormControl('', [Validators.required]),
      ngaySinh: new FormControl('', [Validators.required])
    });
  }
  addCustomer(): void{
    this.result = '';
    // tslint:disable-next-line:prefer-for-of
    for (let i = 0; i < this.dsKhachHang.length; i++){
      console.log('form' + this.formCustomer.value.maKhachHang);
      if (this.dsKhachHang[i].maKhachHang === this.formCustomer.value.maKhachHang){
        this.result = 'mã khách hàng đã tồn tại';
      }
    }
    if (this.result === ''){
      this.customer = Object.assign({}, this.formCustomer.value);
      console.log(this.customer.hoTen);
      this.customerService.addCustomer(this.customer).subscribe(
        next => {},
        error => {},
        () => {
          this.router.navigateByUrl('home/list-customer');
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
}
