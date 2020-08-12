import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Employee} from '../employee';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {EmployeeService} from '../employee.service';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit {
  formEmployee: FormGroup;
  dsNhanVien: Employee[];
  employee: Employee;
  id: number;
  constructor(private activatedRoute: ActivatedRoute, private router: Router, private employeeService: EmployeeService) {
    employeeService.findAll().subscribe(
      next => {
        this.dsNhanVien = next;
      }, error => {
        this.dsNhanVien = new Array();
      }
    );
  }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = Number(paramMap.get('id'));
    });
    this.employeeService.findById(this.id).subscribe(
      next => {
        this.employee = next;
        this.formEmployee.patchValue({maNhanVien: this.employee.maNhanVien});
        this.formEmployee.patchValue({hoTen: this.employee.hoTen});
        this.formEmployee.patchValue({viTri: this.employee.viTri});
        this.formEmployee.patchValue({trinhDo: this.employee.trinhDo});
        this.formEmployee.patchValue({boPhan: this.employee.boPhan});
        this.formEmployee.patchValue({ngaySinh: this.employee.ngaySinh});
        this.formEmployee.patchValue({soCMND: this.employee.soCMND});
        this.formEmployee.patchValue({luong: this.employee.luong});
        this.formEmployee.patchValue({soDienThoai: this.employee.soDienThoai});
        this.formEmployee.patchValue({email: this.employee.email});
        this.formEmployee.patchValue({diaChi: this.employee.diaChi});
      }, error => {
        this.employee = new Employee();
      }
    );
    this.formEmployee = new FormGroup({
      maNhanVien: new FormControl('', [Validators.required, Validators.pattern('[N][V][-][0-9]{4}')]),
      hoTen: new FormControl('', [Validators.required]),
      viTri: new FormControl(''),
      trinhDo: new FormControl(''),
      boPhan: new FormControl(''),
      ngaySinh: new FormControl('', [Validators.required]),
      soCMND: new FormControl('', [Validators.required, Validators.pattern('([0-9]{9})|([0-9]{12})')]),
      luong: new FormControl('', [Validators.required, Validators.min(0)]),
      soDienThoai: new FormControl('', [Validators.required, Validators.pattern('(([0][9][0])|([0][9][1])|([(][8][4][)][+][9][0])|([(][8][4][)][+][9][1]))([0-9]{7})')]),
      email: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z0-9]+[@][a-zA-Z0-9]+[.][a-zA-Z0-9]+')]),
      diaChi: new FormControl('', [Validators.required]),
    });
  }
  updateEmployee(): void{
    this.employee = Object.assign({}, this.formEmployee.value);
    this.employee.id = this.id;
    this.employeeService.updateEmployee(this.employee).subscribe(
      next => {},
      error => {},
      () => {
        this.router.navigateByUrl('home/list-employee');
        this.employeeService.findAll().subscribe(
          next => {
            this.dsNhanVien = next;
            }, error => {
            this.dsNhanVien = new Array();
          });
      });
  }
}
