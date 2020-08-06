import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DateUtilService {

  constructor() { }
  // tslint:disable-next-line:typedef
  tinhThoiGianSong(time): number {
    const current = new Date().getFullYear();
    time = new Date(time).getFullYear();
    console.log(time);
    return current - time;
  }
}
