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
  value: string;
  dsKhachHang: Customer[];
  constructor(private customerService: CustomerService, private router: Router) {
    this.dsKhachHang = customerService.findAll();
  }
  ngOnInit(): void {
  }
  clickDelete(maKhachHang: string): void {
    if (confirm('Bạn chắc chắn muốn xóa khách hàng ' + maKhachHang)) {
      console.log(maKhachHang)
      this.customerService.deleteCustomer(maKhachHang);
      this.customerService.findAll();
    }
  }
  search(): void{
    if (this.value !== '') {
      this.dsKhachHang = this.dsKhachHang.filter(res => {
        return res.hoTen.toLocaleLowerCase().match(this.value.toLocaleLowerCase())
          || res.maKhachHang.toLocaleLowerCase().match(this.value.toLocaleLowerCase());
      });
    }
    else{
      this.dsKhachHang = this.customerService.findAll();
    }
  }
  reset(): void{
    this.value = '';
  }

}
