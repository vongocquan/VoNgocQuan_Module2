import { Component, OnInit } from '@angular/core';
import {TuDienService} from '../tu-dien.service';
import {TuDien} from '../tu-dien';

@Component({
  selector: 'app-ds-tu',
  templateUrl: './ds-tu.component.html',
  styleUrls: ['./ds-tu.component.css']
})
export class DsTuComponent implements OnInit {
  dsTuDien: TuDien[];
  constructor(private tuDienService: TuDienService) {
    this.dsTuDien = tuDienService.findAll();
  }

  ngOnInit(): void {
  }

}
