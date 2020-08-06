import { Component, OnInit } from '@angular/core';
import {DateUtilService} from '../date-util.service';

@Component({
  selector: 'app-timelines',
  templateUrl: './timelines.component.html',
  styleUrls: ['./timelines.component.css']
})
export class TimelinesComponent implements OnInit {
  output: number;
  time: string;
  onChange(value): void {
    this.time = value;
  }
  constructor(private dateUtilService: DateUtilService) { }
  result(): void {
    this.output = this.dateUtilService.tinhThoiGianSong(this.time);
    console.log(this.output);
  }
  ngOnInit(): void {
  }
}

