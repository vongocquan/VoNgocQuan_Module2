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
  constructor(private serviceService: ServiceService) {
    this.dsDichVu = serviceService.findAll();
  }

  ngOnInit(): void {
  }
  clickDelete(maDichVu: string): void{
    if (confirm('Bạn chắc chắn muốn xoa dịch vụ ' + maDichVu)) {
      this.serviceService.deleteService(maDichVu);
    }
  }
}
