import { Component, OnInit } from '@angular/core';
import {Customer} from '../customer';
import {CustomerService} from '../customer.service';
import {ContractService} from '../../contract/contract.service';
import {Contract} from '../../contract/contract';

@Component({
  selector: 'app-list-customer-booking',
  templateUrl: './list-customer-booking.component.html',
  styleUrls: ['./list-customer-booking.component.css']
})
export class ListCustomerBookingComponent implements OnInit {
  dsHopDong: Contract[] = [];
  dsKhachHangChung: Customer[] = [];
  dsKhachHangBooking: Customer[] = [];
  value = '';
  page = 1;
  pageSize = 2;
  pageMax: number;
  constructor(private customerService: CustomerService, private contractService: ContractService) {
    contractService.findAll().subscribe(
      next => {
        this.dsHopDong = next;
        console.log('leg' + this.dsHopDong.length);
      }, error => {
        this.dsHopDong = new Array();
      }, () => {
        this.findCustomerBooking();
        this.page = 1;
        this.pageMax = Math.ceil(this.dsKhachHangBooking.length / this.pageSize);
      }
    );
  }

  ngOnInit(): void {
  }
  search(): void {
    this.dsKhachHangChung = [];
    this.dsKhachHangBooking = [];
    this.findCustomerBooking();
    if (this.value !== '') {
      this.dsKhachHangBooking = this.dsKhachHangBooking.filter(res => {
          return res.maKhachHang.toLocaleLowerCase().match(this.value.toLocaleLowerCase())
            || res.hoTen.toLocaleLowerCase().match(this.value.toLocaleLowerCase());
        }
      );
    }
    this.page = 1;
    this.pageMax = Math.ceil(this.dsKhachHangBooking.length / this.pageSize);
  }

  findCustomerBooking(): void{
    // tslint:disable-next-line:prefer-for-of
    for (let i = 0; i < this.dsHopDong.length; i++){
      this.dsKhachHangChung.push(this.dsHopDong[i].khachHang);
      console.log(this.dsHopDong[i].khachHang);
    }
    for (let i = 0; i < this.dsKhachHangChung.length; i++){
      if (this.dsKhachHangChung.indexOf(this.dsKhachHangChung[i]) === i){
        this.dsKhachHangBooking.push(this.dsKhachHangChung[i]);
      }
    }
  }
  goPer(): void{
    if (this.page !== 1){
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
