import { Component, OnInit } from '@angular/core';
import {ContractService} from '../contract.service';
import {Contract} from '../contract';

@Component({
  selector: 'app-list-contract',
  templateUrl: './list-contract.component.html',
  styleUrls: ['./list-contract.component.css']
})
export class ListContractComponent implements OnInit {
  dsHopDong: Contract[];
  value = '';
  constructor(private contractService: ContractService) {
    contractService.findAll().subscribe(
      next => {
        this.dsHopDong = next;
      }, error => {
        this.dsHopDong = new Array();
      }
    );
  }

  ngOnInit(): void {
  }
  search(): void{
    if (this.value !== '') {
      this.dsHopDong = this.dsHopDong.filter(res => {
        return res.maHopDong.toLocaleLowerCase().match(this.value.toLocaleLowerCase())
          || res.khachHang.maKhachHang.toLocaleLowerCase().match(this.value.toLocaleLowerCase())
          || res.nhanVien.maNhanVien.toLocaleLowerCase().match(this.value.toLocaleLowerCase())
          || res.dichVu.maDichVu.toLocaleLowerCase().match(this.value.toLocaleLowerCase());
      });
    }
    else{
      this.contractService.findAll().subscribe(
        next => {
          this.dsHopDong = next;
        }, error => {
          this.dsHopDong = new Array();
        }
      );
    }
  }
  reset(): void{
    this.value = '';
  }

}
