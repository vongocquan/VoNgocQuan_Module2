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
  constructor(private activatedRoute: ActivatedRoute, private router: Router, private employeeService: EmployeeService) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const maNhanVien = (paramMap.get('maNhanVien'));
      this.employee = this.employeeService.findById(maNhanVien);
    });
    this.formEmployee = new FormGroup({
      maNhanVien: new FormControl(this.employee.maNhanVien, [Validators.required, Validators.pattern('[N][V][-][0-9]{4}')]),
      hoTen: new FormControl(this.employee.hoTen, [Validators.required]),
      viTri: new FormControl(this.employee.viTri),
      trinhDo: new FormControl(this.employee.trinhDo),
      boPhan: new FormControl(this.employee.boPhan),
      ngaySinh: new FormControl('', [Validators.required]),
      chungMinhNhanDan: new FormControl(this.employee.soCMND, [Validators.required, Validators.pattern('([0-9]{9})|([0-9]{12})')]),
      luong: new FormControl(this.employee.luong, [Validators.required, Validators.min(0)]),
      soDienThoai: new FormControl(this.employee.soDienThoai, [Validators.required, Validators.pattern('(([0][9][0])|([0][9][1])|([(][8][4][)][+][9][0])|([(][8][4][)][+][9][1]))([0-9]{7})')]),
      email: new FormControl(this.employee.email, [Validators.required, Validators.pattern('[a-zA-Z0-9]+[@][a-zA-Z0-9]+[.][a-zA-Z0-9]+')]),
      diaChi: new FormControl(this.employee.diaChi, [Validators.required]),
    });
  }
  updateEmployee(): void{
      this.employee = new Employee(this.formEmployee.value.maNhanVien,
      this.formEmployee.value.hoTen,
      this.formEmployee.value.viTri,
      this.formEmployee.value.trinhDo,
      this.formEmployee.value.boPhan,
      this.formEmployee.value.ngaySinh,
      this.formEmployee.value.chungMinhNhanDan,
      this.formEmployee.value.luong,
      this.formEmployee.value.soDienThoai,
      this.formEmployee.value.email,
      this.formEmployee.value.diaChi);
      this.dsNhanVien = this.employeeService.updateEmployee(this.employee);
      this.router.navigateByUrl('/home/list-employee');
  }
}
