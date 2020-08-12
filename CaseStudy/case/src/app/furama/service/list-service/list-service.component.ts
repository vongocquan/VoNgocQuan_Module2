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
  constructor(private serviceService: ServiceService) {
    serviceService.findAll().subscribe(
      next => {
        this.dsDichVu = next;
      }, error => {
        this.dsDichVu = new Array();
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
            }
          );
        }
      );
    }
  }
  search(): void{
    if (this.value !== '') {
      this.dsDichVu = this.dsDichVu.filter(res => {
        return res.maDichVu.toLocaleLowerCase().match(this.value.toLocaleLowerCase())
          || res.tenDichVu.toLocaleLowerCase().match(this.value.toLocaleLowerCase());
      });
    }
    else{
      this.serviceService.findAll().subscribe(
        next => {
          this.dsDichVu = next;
        }, error => {
          this.dsDichVu = new Array();
        }
      );
    }
  }
  reset(): void{
    this.value = '';
  }
}
