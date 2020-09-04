import { Component, OnInit } from '@angular/core';
import { Service} from '../service';
import {ServiceService} from '../service.service';

@Component({
  selector: 'app-list-service',
  templateUrl: './list-service.component.html',
  styleUrls: ['./list-service.component.css']
})
export class ListServiceComponent implements OnInit {
  dsDichVu: Service[];
  value = '';
  page = 1;
  pageSize = 2;
  pageMax: number;
  constructor(private serviceService: ServiceService) {
    serviceService.findAll().subscribe(
      next => {
        this.dsDichVu = next;
      }, error => {
        this.dsDichVu = new Array();
      }, () => {
        this.pageMax =  Math.ceil(this.dsDichVu.length / this.pageSize);
      }
    );
  }

  ngOnInit(): void {
  }
  clickDelete(id: number): void{
    if (confirm('Bạn chắc chắn muốn xoa dịch vụ ' + id)) {
      this.serviceService.deleteService(id).subscribe(
        next => {},
        error => {},
        () => {
          this.serviceService.findAll().subscribe(
            next => {
              this.dsDichVu = next;
            }, error => {
              this.dsDichVu = new Array();
            }, () => {
              this.pageMax =  Math.ceil(this.dsDichVu.length / this.pageSize);
              this.page = 1;
            }
          );
        }
      );
    }
  }
  search(): void{
    this.serviceService.findAll().subscribe(
      next => {
        this.dsDichVu = next;
      }, error => {
        this.dsDichVu = new Array();
      }, () => {
        if (this.value !== '') {
          this.dsDichVu = this.dsDichVu.filter(res => {
            return res.maDichVu.toLocaleLowerCase().match(this.value.toLocaleLowerCase())
              || res.tenDichVu.toLocaleLowerCase().match(this.value.toLocaleLowerCase());
          });
        }
        this.pageMax =  Math.ceil(this.dsDichVu.length / this.pageSize);
        this.page = 1;
      }
    );
  }
  reset(): void{
    this.value = '';
  }
  goPer(): void{
    this.pageMax =  Math.ceil(this.dsDichVu.length / this.pageSize);
    if (this.page > 1){
      this.page--;
    }
  }
  goNext(): void{
    this.pageMax =  Math.ceil(this.dsDichVu.length / this.pageSize);
    if (this.page < this.pageMax){
      this.page++;
    }
  }
  goPage(page: number): void{
    this.page = page;
  }
}
