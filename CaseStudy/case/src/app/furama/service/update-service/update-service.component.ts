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
  id: number;
  constructor(private activatedRoute: ActivatedRoute, private serviceService: ServiceService, private router: Router) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = Number(paramMap.get('id'));
    });
    this.serviceService.findById(this.id).subscribe(
      next => {
        this.dichVu = next;
        this.formService.patchValue({maDichVu: this.dichVu.maDichVu});
        this.formService.patchValue({tenDichVu: this.dichVu.tenDichVu});
        this.formService.patchValue({dienTich: this.dichVu.dienTich});
        this.formService.patchValue({soTang: this.dichVu.soTang});
        this.formService.patchValue({soNguoiToiDa: this.dichVu.soNguoiToiDa});
        this.formService.patchValue({chiPhiThue: this.dichVu.chiPhiThue});
        this.formService.patchValue({kieuThue: this.dichVu.kieuThue});
        this.formService.patchValue({trangThai: this.dichVu.trangThai});
      }, error => {
        this.dsDichVu = new Array();
      }
    );
    this.formService = new FormGroup( {
      maDichVu: new FormControl('', [Validators.required, Validators.pattern('[D][V][-][0-9]{4}')]),
      tenDichVu: new FormControl('', [Validators.required]),
      dienTich: new FormControl('', [Validators.required, Validators.min(0)]),
      soTang: new FormControl('', [Validators.required, Validators.min(0)]),
      soNguoiToiDa: new FormControl('', [Validators.required, Validators.min(0)]),
      chiPhiThue: new FormControl('', [Validators.required, Validators.min(0)]),
      kieuThue: new FormControl('', [Validators.required]),
      trangThai: new FormControl('', [Validators.required]),
    });
  }
  updateService(): void{
    this.dichVu = Object.assign({}, this.formService.value);
    this.dichVu.id = this.id;
    this.serviceService.updateService(this.dichVu).subscribe(
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
