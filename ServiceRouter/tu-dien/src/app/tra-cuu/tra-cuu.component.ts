import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, ParamMap, Router, Routes} from '@angular/router';
import {TuDien} from '../tu-dien';
import {TuDienService} from '../tu-dien.service';

@Component({
  selector: 'app-tra-cuu',
  templateUrl: './tra-cuu.component.html',
  styleUrls: ['./tra-cuu.component.css']
})
export class TraCuuComponent implements OnInit {
  tuDien: TuDien;
  constructor(private activatedRoute: ActivatedRoute, router: Router, private tuDienService: TuDienService) {}

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = (paramMap.get('id'));
      console.log(id);
      this.tuDien = this.tuDienService.findById(id);
    });
  }

}
