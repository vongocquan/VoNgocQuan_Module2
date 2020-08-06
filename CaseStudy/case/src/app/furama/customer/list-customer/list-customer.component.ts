import {Component, OnInit} from '@angular/core';
import {Customer} from '../customer';
import {CustomerService} from '../customer.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {
  dsKhachHang: Customer[];
  constructor(private customerService: CustomerService, private router: Router) {
    this.dsKhachHang = customerService.findAll();
  }
  ngOnInit(): void {
  }
  goUpdate(maKhachHang: string): void{
    this.router.navigateByUrl('update-customer/' + maKhachHang);
  }

}
