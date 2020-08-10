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

@Component({
  selector: 'app-add-contract',
  templateUrl: './add-contract.component.html',
  styleUrls: ['./add-contract.component.css']
})
export class AddContractComponent implements OnInit {
  formContract: FormGroup;
  dsHopDong: Contract[];
  dsKhachHang: Customer[];
  dsNhanVien: Employee[];
  dsDichVu: Service[];
  result = '';
  hopDong: Contract;
  constructor(private employeeService: EmployeeService, private customerService: CustomerService, private serviceService: ServiceService,
              private contractService: ContractService) {
    this.dsKhachHang = customerService.findAll();
    this.dsNhanVien = employeeService.findAll();
    this.dsDichVu = serviceService.findAll();
  }

  ngOnInit(): void {
    this.formContract = new FormGroup({
      maHopDong: new FormControl('', [Validators.required]),
      maNhanVien: new FormControl(),
      maKhachHang: new FormControl(),
      maDichVu: new FormControl(),
      ngayLamHopDong: new FormControl('', [Validators.required]),
      ngayKetThucHopDong: new FormControl('', [Validators.required]),
      tienDatCoc: new FormControl('', [Validators.required, Validators.min(0)]),
      tongTien: new FormControl('', [Validators.required, Validators.min(0)])
    });
  }
  addContract(): void{
    this.result = '';
    this.dsHopDong = this.contractService.findAll();
    // tslint:disable-next-line:prefer-for-of
    for (let i = 0; i < this.dsHopDong.length; i++){
      if (this.dsHopDong[i].maHopDong === this.formContract.value.maHopDong){
        this.result = 'mã hợp đồng đã tồn tại';
      }
    }
    if (this.result === ''){
      this.hopDong = new Contract(
        this.formContract.value.maHopDong,
        this.formContract.value.maNhanVien,
        this.formContract.value.maKhachHang,
        this.formContract.value.maDichVu,
        this.formContract.value.ngayLamHopDong,
        this.formContract.value.ngayKetThucHopDong,
        this.formContract.value.tienDatCoc,
        this.formContract.value.tongTien,
      );
      this.contractService.addContract(this.hopDong);
      this.result = 'thêm hợp hồng thành công';
    }
  }

}
