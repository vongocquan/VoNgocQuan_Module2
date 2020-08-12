import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Employee} from '../employee';
import {Customer} from '../../customer/customer';
import {EmployeeService} from '../employee.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {
  formEmployee: FormGroup;
  dsNhanVien: Employee[];
  employee: Employee;
  result = '';
  constructor(private employeeService: EmployeeService, private router: Router) {
    employeeService.findAll().subscribe(
      next => {
        this.dsNhanVien = next;
      }, error => {
        this.dsNhanVien = new Array();
      }
    );
  }

  ngOnInit(): void {
    this.formEmployee = new FormGroup({
      maNhanVien: new FormControl('', [Validators.required, Validators.pattern('[N][V][-][0-9]{4}')]),
      hoTen: new FormControl('', [Validators.required]),
      viTri: new FormControl('Lễ tân'),
      trinhDo: new FormControl('Trung cấp'),
      boPhan: new FormControl('Sale – Marketing'),
      ngaySinh: new FormControl('', [Validators.required]),
      soCMND: new FormControl('', [Validators.required, Validators.pattern('([0-9]{9})|([0-9]{12})')]),
      luong: new FormControl('', [Validators.required, Validators.min(0)]),
      soDienThoai: new FormControl('', [Validators.required, Validators.pattern('(([0][9][0])|([0][9][1])|([(][8][4][)][+][9][0])|([(][8][4][)][+][9][1]))([0-9]{7})')]),
      email: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z0-9]+[@][a-zA-Z0-9]+[.][a-zA-Z0-9]+')]),
      diaChi: new FormControl('', [Validators.required]),
    });
  }
  addEmployee(): void{
    this.result = '';
    // tslint:disable-next-line:prefer-for-of
    for (let i = 0; i < this.dsNhanVien.length; i++){
      if (this.dsNhanVien[i].maNhanVien === this.formEmployee.value.maNhanVien){
        this.result = 'mã nhân viên đã tồn tại';
      }
    }
    if (this.result === ''){
      this.employee = Object.assign({}, this.formEmployee.value);
      this.employeeService.addEmployee(this.employee).subscribe(
        next => {},
        error => {},
        () => {
          this.router.navigateByUrl('home/list-employee');
          this.employeeService.findAll().subscribe(
            next => {
              this.dsNhanVien = next;
            }, error => {
              this.dsNhanVien = new Array();
            }
          );
        });
    }
  }
}
