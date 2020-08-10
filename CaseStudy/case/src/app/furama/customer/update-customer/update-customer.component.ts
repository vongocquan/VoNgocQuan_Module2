import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {Customer} from '../customer';
import {CustomerService} from '../customer.service';

@Component({
  selector: 'app-update-customer',
  templateUrl: './update-customer.component.html',
  styleUrls: ['./update-customer.component.css']
})
export class UpdateCustomerComponent implements OnInit {
  formCustomer: FormGroup;
  customer: Customer;
  dsKhachHang: Customer[];
  constructor(private activatedRoute: ActivatedRoute, private customerService: CustomerService, private router: Router) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const maKhachHang = (paramMap.get('maKhachHang'));
      this.customer = this.customerService.findById(maKhachHang);
    });
    this.formCustomer = new FormGroup({
      maKhachHang: new FormControl(this.customer.maKhachHang, [Validators.required, Validators.pattern('[K][H][-][0-9]{4}')]),
      loaiKhachHang: new FormControl(this.customer.loaiKhachHang, [Validators.required]),
      hoTen: new FormControl(this.customer.hoTen, [Validators.required]),
      soDienThoai: new FormControl(this.customer.soDienThoai, [Validators.required, Validators.pattern('(([0][9][0])|([0][9][1])|([(][8][4][)][+][9][0])|([(][8][4][)][+][9][1]))([0-9]{7})')]),
      chungMinhNhanDan: new FormControl(this.customer.soCMND, [Validators.required, Validators.pattern('([0-9]{9})|([0-9]{12})')]),
      email: new FormControl(this.customer.email, [Validators.required, Validators.pattern('[a-zA-Z0-9]+[@][a-zA-Z0-9]+[.][a-zA-Z0-9]+')]),
      diaChi: new FormControl(this.customer.diaChi, [Validators.required]),
      ngaySinh: new FormControl(this.customer.ngaySinh, [Validators.required])
    });
  }
  updateCustomer(): void{
    this.customer = new Customer(this.formCustomer.value.maKhachHang,
      this.formCustomer.value.loaiKhachHang,
      this.formCustomer.value.hoTen,
      this.formCustomer.value.ngaySinh,
      this.formCustomer.value.chungMinhNhanDan,
      this.formCustomer.value.soDienThoai,
      this.formCustomer.value.email,
      this.formCustomer.value.diaChi);
    console.log(this.customer.hoTen);
    this.dsKhachHang = this.customerService.updateCustomer(this.customer);
    this.router.navigateByUrl('/home/list-customer');
  }
}
