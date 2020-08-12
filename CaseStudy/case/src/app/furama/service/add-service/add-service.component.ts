import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Service} from '../service';
import {ServiceService} from '../service.service';
import {Employee} from '../../employee/employee';
import {Router} from '@angular/router';

@Component({
  selector: 'app-add-service',
  templateUrl: './add-service.component.html',
  styleUrls: ['./add-service.component.css']
})
export class AddServiceComponent implements OnInit {
  formService: FormGroup;
  dsDichVu: Service[];
  service: Service;
  result = '';
  constructor(private serviceService: ServiceService, private router: Router) {
    this.serviceService.findAll().subscribe(
      next => {
        this.dsDichVu = next;
      }, error => {
        this.dsDichVu = new Array();
      }
    );
  }

  ngOnInit(): void {
    this.formService = new FormGroup( {
      maDichVu: new FormControl('', [Validators.required, Validators.pattern('[D][V][-][0-9]{4}')]),
      tenDichVu: new FormControl('', [Validators.required]),
      dienTich: new FormControl('', [Validators.required, Validators.min(0)]),
      soTang: new FormControl('', [Validators.required, Validators.min(0)]),
      soNguoiToiDa: new FormControl('', [Validators.required, Validators.min(0)]),
      chiPhiThue: new FormControl('', [Validators.required, Validators.min(0)]),
      kieuThue: new FormControl('Thuê theo ngày', [Validators.required]),
      trangThai: new FormControl('', [Validators.required]),
    });
  }
  addService(): void{
    this.result = '';
    // tslint:disable-next-line:prefer-for-of
    for (let i = 0; i < this.dsDichVu.length; i++){
      if (this.dsDichVu[i].maDichVu === this.formService.value.maDichVu){
        this.result = 'Mã dịch vụ đã tồn tại';
      }
    }
    if (this.result === ''){
      this.service = Object.assign({}, this.formService.value);
      this.serviceService.addService(this.service).subscribe(
        next => {},
        error => {},
        () => {
          this.router.navigateByUrl('home/list-service');
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
}
