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
  constructor(private employeeService: EmployeeService) {
    this.dsNhanVien = employeeService.findAll();
  }

  ngOnInit(): void {
  }

}
