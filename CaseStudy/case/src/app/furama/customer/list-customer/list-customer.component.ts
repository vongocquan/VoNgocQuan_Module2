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
  page = 1;
  pageSize = 2;
  pageMax = 1;

  constructor(private customerService: CustomerService, private router: Router) {
    customerService.findAll().subscribe(
      next => {
        this.dsKhachHang = next;
        this.pageMax = Math.ceil((this.dsKhachHang.length / this.pageSize));
      }, error => {
        this.dsKhachHang = new Array();
      }
    );
  }

  ngOnInit(): void {
  }

  listCustomer(): void {
    this.customerService.findAll().subscribe(
      next => {
        this.dsKhachHang = next;
      }, error => {
        this.dsKhachHang = new Array();
      }
    );
  }

  clickDelete(id: number): void {
    if (confirm('Bạn chắc chắn muốn xóa khách hàng ' + id)) {
      this.customerService.deleteCustomer(id).subscribe(
        next => {
        },
        error => {
        },
        () => {
          this.listCustomer();
        }
      );
    }
  }

  search(): void {
    this.customerService.findAll().subscribe(
      next => {
        this.dsKhachHang = next;
        this.pageMax = Math.ceil((this.dsKhachHang.length / this.pageSize));
      }, error => {
        this.dsKhachHang = new Array();
        this.pageMax = Math.ceil((this.dsKhachHang.length / this.pageSize));
      }, () => {
        if (this.value !== '') {
          this.dsKhachHang = this.dsKhachHang.filter(res => {
            return res.hoTen.toLocaleLowerCase().match(this.value.toLocaleLowerCase())
              || res.maKhachHang.toLocaleLowerCase().match(this.value.toLocaleLowerCase())
              || (res.id).toString().toLocaleLowerCase().match(this.value.toLocaleLowerCase());
          });
          this.pageMax = Math.ceil((this.dsKhachHang.length / this.pageSize));
          this.page = 1;
        }
      }
    );
  }

  reset(): void {
    this.value = '';
  }

  goPre(): void {
    if (this.page > 1) {
      this.page--;
    }
  }

  goNext(): void {
    this.pageMax = Math.ceil((this.dsKhachHang.length / this.pageSize));
    if (this.page < this.pageMax) {
      this.page++;
    }
  }

  goPage(page: number): void {
    this.page = page;
  }
}
