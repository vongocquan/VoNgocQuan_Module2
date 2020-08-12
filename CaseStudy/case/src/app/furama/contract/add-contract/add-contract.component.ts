import { Component, OnInit } from '@angular/core';
import {EmployeeService} from '../../employee/employee.service';
import {CustomerService} from '../../customer/customer.service';
import {ServiceService} from '../../service/service.service';
import {ContractService} from '../contract.service';
import {Customer} from '../../customer/customer';
import {Employee} from '../../employee/employee';
import {Service} from '../../service/service';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Contract} from '../contract';
import {Router} from '@angular/router';

@Component({
  selector: 'app-add-contract',
  templateUrl: './add-contract.component.html',
  styleUrls: ['./add-contract.component.css']
})
export class AddContractComponent implements OnInit {
  formContract: FormGroup;
  dsHopDong: Contract[] = [];
  dsKhachHang: Customer[];
  dsNhanVien: Employee[];
  dsDichVu: Service[];
  result = '';
  hopDong: Contract;
  customer: Customer;
  employee: Employee;
  service: Service;
  constructor(private employeeService: EmployeeService, private customerService: CustomerService, private serviceService: ServiceService,
              private contractService: ContractService, private router: Router) {
    customerService.findAll().subscribe(
      next => {
        this.dsKhachHang = next;
        this.formContract.patchValue({khachHang: this.dsKhachHang[0].maKhachHang});
      }, error => {
        this.dsKhachHang = new Array();
      }
    );
    employeeService.findAll().subscribe(
      next => {
        this.dsNhanVien = next;
        this.formContract.patchValue({nhanVien: this.dsNhanVien[0].maNhanVien});
      }, error => {
        this.dsNhanVien = new Array();
      }
    );
    serviceService.findAll().subscribe(
      next => {
        this.dsDichVu = next;
        this.formContract.patchValue({dichVu: this.dsDichVu[0].maDichVu});
      }, error => {
        this.dsDichVu = new Array();
      }
    );
    contractService.findAll().subscribe(
      next => {
        this.dsHopDong = next;
        console.log('dsadsa');
      }, error => {
        this.dsHopDong = new Array();
      }
    );
  }

  ngOnInit(): void {
    this.formContract = new FormGroup({
      maHopDong: new FormControl('', [Validators.required]),
      nhanVien: new FormControl(''),
      khachHang: new FormControl(''),
      dichVu: new FormControl(''),
      ngayLamHopDong: new FormControl('', [Validators.required]),
      ngayKetThucHopDong: new FormControl('', [Validators.required]),
      tienDatCoc: new FormControl('', [Validators.required, Validators.min(0)]),
      tongTien: new FormControl('', [Validators.required, Validators.min(0)])
    });
  }
  addContract(): void{
    this.result = '';
    // tslint:disable-next-line:prefer-for-of
    for (let i = 0; i < this.dsHopDong.length; i++){
      if (this.dsHopDong[i].maHopDong === this.formContract.value.maHopDong){
        this.result = 'mã hợp đồng đã tồn tại';
      }
    }
    if (this.result === ''){
      this.customer = this.dsKhachHang.find(customer => customer.maKhachHang === this.formContract.value.khachHang);
      this.formContract.value.khachHang = this.customer;
      this.employee = this.dsNhanVien.find(employee => employee.maNhanVien === this.formContract.value.nhanVien);
      this.formContract.value.nhanVien = this.employee;
      this.service = this.dsDichVu.find(service => service.maDichVu === this.formContract.value.dichVu);
      this.formContract.value.dichVu = this.service;
      this.hopDong = Object.assign({}, this.formContract.value);
      this.contractService.addContract(this.hopDong).subscribe(
        next => {},
        error => {},
        () => {
          this.router.navigateByUrl('home/list-contract')
          this.contractService.findAll().subscribe(
            next => {
              this.dsHopDong = next;
              console.log('dsadsa');
            }, error => {
              this.dsHopDong = new Array();
            }
          );
        }
      );
    }
  }

}
