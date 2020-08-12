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
  constructor(private customerService: CustomerService, private contractService: ContractService) {
    contractService.findAll().subscribe(
      next => {
        this.dsHopDong = next;
        this.findCustomerBooking();
        console.log('leg' + this.dsHopDong.length);
      }, error => {
        this.dsHopDong = new Array();
      }
    );
  }

  ngOnInit(): void {
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
}
