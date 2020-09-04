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
  page = 1;
  pageSize = 2;
  pageMax: number;
  constructor(private contractService: ContractService) {
    contractService.findAll().subscribe(
      next => {
        this.dsHopDong = next;
      }, error => {
        this.dsHopDong = new Array();
      }, () => {
        this.pageMax = Math.ceil(this.dsHopDong.length / this.pageSize);
        this.page = 1;
      }
    );
  }

  ngOnInit(): void {
  }
  search(): void{
    this.contractService.findAll().subscribe(
      next => {
        this.dsHopDong = next;
      }, error => {
        this.dsHopDong = new Array();
      }, () => {
        if (this.value !== ''){
          this.dsHopDong = this.dsHopDong.filter(res => {
            return res.maHopDong.toLocaleLowerCase().match(this.value.toLocaleLowerCase())
              || res.khachHang.maKhachHang.toLocaleLowerCase().match(this.value.toLocaleLowerCase())
              || res.nhanVien.maNhanVien.toLocaleLowerCase().match(this.value.toLocaleLowerCase())
              || res.dichVu.maDichVu.toLocaleLowerCase().match(this.value.toLocaleLowerCase());
          });
        }
        this.pageMax = Math.ceil(this.dsHopDong.length / this.pageSize);
        this.page = 1;
      }
    );
  }
  goPer(): void{
    if (this.page !== 1 ){
      this.page--;
    }
  }
  goNext(): void{
    if (this.page !== this.pageMax){
      this.page++;
    }
  }
  goPage(page: number): void{
    this.page = page;
  }
  reset(): void{
    this.value = '';
  }

}
