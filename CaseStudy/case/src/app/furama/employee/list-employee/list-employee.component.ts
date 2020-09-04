import { Component, OnInit } from '@angular/core';
import { Employee} from '../employee';
import {EmployeeService} from '../employee.service';

@Component({
  selector: 'app-list-employee',
  templateUrl: './list-employee.component.html',
  styleUrls: ['./list-employee.component.css']
})
export class ListEmployeeComponent implements OnInit {
  page = 1;
  pageSize = 2;
  pageMax = 1;
  dsNhanVien: Employee[];
  value = '';
  constructor(private employeeService: EmployeeService) {
    employeeService.findAll().subscribe(
      next => {
        this.dsNhanVien = next;
        this.pageMax = Math.ceil(this.dsNhanVien.length / this.pageSize);
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
            }, () => {
              this.pageMax = Math.ceil(this.dsNhanVien.length / this.pageSize);
              this.page = 1;
            }
          );
        }
      );
    }
  }
  search(): void {
    this.employeeService.findAll().subscribe(
      next => {
        this.dsNhanVien = next;
      }, error => {
        this.dsNhanVien = new Array();
      }, () => {
        if (this.value !== '') {
          this.dsNhanVien = this.dsNhanVien.filter(res => {
            return res.hoTen.toLocaleLowerCase().match(this.value.toLocaleLowerCase())
              || res.maNhanVien.toLocaleLowerCase().match(this.value.toLocaleLowerCase())
              || res.viTri.toLocaleLowerCase().match(this.value.toLocaleLowerCase())
              || res.trinhDo.toLocaleLowerCase().match(this.value.toLocaleLowerCase())
              || res.boPhan.toLocaleLowerCase().match(this.value.toLocaleLowerCase());
          });
        }
        this.pageMax = Math.ceil(this.dsNhanVien.length / this.pageSize);
        this.page = 1;
      }
    );
  }
  reset(): void{
    this.value = '';
  }
  goPer(): void {
    if (this.page !== 1) {
      this.page--;
    }
  }
  goNext(): void{
    this.pageMax = Math.ceil(this.dsNhanVien.length / this.pageSize);
    if (this.page !== this.pageMax){
      this.page ++;
    }
  }
  goPage(page: number): void{
    this.page = page;
  }
}
