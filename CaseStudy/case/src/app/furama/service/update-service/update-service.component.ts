import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Service} from '../service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {ServiceService} from '../service.service';
import {Employee} from '../../employee/employee';

@Component({
  selector: 'app-update-service',
  templateUrl: './update-service.component.html',
  styleUrls: ['./update-service.component.css'],
})
export class UpdateServiceComponent implements OnInit {
  formService: FormGroup;
  dsDichVu: Service[];
  dichVu: Service;
  constructor(private activatedRoute: ActivatedRoute, private serviceService: ServiceService, private router: Router) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const maDichVu = (paramMap.get('maDichVu'));
      this.dichVu = this.serviceService.findById(maDichVu);
      console.log(this.dichVu.maDichVu);
    });
    this.formService = new FormGroup( {
      maDichVu: new FormControl(this.dichVu.maDichVu, [Validators.required, Validators.pattern('[D][V][-][0-9]{4}')]),
      tenDichVu: new FormControl(this.dichVu.tenDichVu, [Validators.required]),
      dienTich: new FormControl(this.dichVu.dienTich, [Validators.required, Validators.min(0)]),
      soTang: new FormControl(this.dichVu.soTang, [Validators.required, Validators.min(0)]),
      soNguoiToiDa: new FormControl(this.dichVu.soNguoiToiDa, [Validators.required, Validators.min(0)]),
      chiPhiThue: new FormControl(this.dichVu.chiPhiThue, [Validators.required, Validators.min(0)]),
      kieuThue: new FormControl(this.dichVu.kieuThue, [Validators.required]),
      trangThai: new FormControl(this.dichVu.trangThai, [Validators.required]),
    });
  }
  updateService(): void{
    this.dichVu = new Service(this.formService.value.maDichVu,
      this.formService.value.tenDichVu,
      this.formService.value.dienTich,
      this.formService.value.soTang,
      this.formService.value.soNguoiToiDa,
      this.formService.value.chiPhiThue,
      this.formService.value.kieuThue,
      this.formService.value.trangThai);
    this.serviceService.updateService(this.dichVu);
    this.router.navigateByUrl('home/list-service');
  }

}
