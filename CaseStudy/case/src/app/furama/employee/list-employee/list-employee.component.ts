import { Component, OnInit } from '@angular/core';
import { Employee} from '../employee';
import {EmployeeService} from '../employee.service';

@Component({
  selector: 'app-list-employee',
  templateUrl: './list-employee.component.html',
  styleUrls: ['./list-employee.component.css']
})
export class ListEmployeeComponent implements OnInit {
  dsNhanVien: Employee[];
  value = '';
  constructor(private employeeService: EmployeeService) {
    employeeService.findAll().subscribe(
      next => {
        this.dsNhanVien = next;
      }, error => {
        this.dsNhanVien = new Array();
      }
    );
  }
  ngOnInit(): void {
  }
  // tslint:disable-next-line:typedef
  clickDelete(id: number) {
    if (confirm('Bạn chắc chắn muốn xoa nhân viên ' + id)) {
      this.employeeService.deleteEmployee(id).subscribe(
        next => {},
        error => {},
        () => {
          this.employeeService.findAll().subscribe(
            next => {
              this.dsNhanVien = next;
            }, error => {
              this.dsNhanVien = new Array();
            }
          );
        }
      );
    }
  }
  search(): void{
    if (this.value !== '') {
      this.dsNhanVien = this.dsNhanVien.filter(res => {
        return res.hoTen.toLocaleLowerCase().match(this.value.toLocaleLowerCase())
          || res.maNhanVien.toLocaleLowerCase().match(this.value.toLocaleLowerCase())
          || res.viTri.toLocaleLowerCase().match(this.value.toLocaleLowerCase())
          || res.trinhDo.toLocaleLowerCase().match(this.value.toLocaleLowerCase())
          || res.boPhan.toLocaleLowerCase().match(this.value.toLocaleLowerCase());
      });
    }
    else{
      this.employeeService.findAll().subscribe(
        next => {
          this.dsNhanVien = next;
        }, error => {
          this.dsNhanVien = new Array();
        }
      );
    }
  }
  reset(): void{
    this.value = '';
  }
}
