import { Component, OnInit } from '@angular/core';
import {Customer} from '../customer';
import {CustomerService} from '../customer.service';

@Component({
  selector: 'app-list-customer-booking',
  templateUrl: './list-customer-booking.component.html',
  styleUrls: ['./list-customer-booking.component.css']
})
export class ListCustomerBookingComponent implements OnInit {
  dsKhachHangBooking: Customer[];
  constructor(private customerService: CustomerService) {
    this.dsKhachHangBooking = customerService.findAllCustomerBooking();
  }

  ngOnInit(): void {
  }

}
