import { Injectable } from '@angular/core';
import {TuDien} from './tu-dien';

@Injectable({
  providedIn: 'root'
})
export class TuDienService {
  dsTuDien: TuDien[];
  constructor() {
    this.dsTuDien = [
      {id: '1', en: 'book', vn: 'quyển sách', img: 'https://topreview.vn/wp-content/uploads/2019/12/cuon-sach-danh-cho-con-gai-4.jpg'},
      {id: '2', en: 'pen', vn: 'cây bút', img: 'https://cf.shopee.vn/file/ff1ae1fcf493484240685e9aa026fa30'},
      {id: '3', en: 'dog', vn: 'con chó', img: 'https://i.ytimg.com/vi/AGV-2RHDeZI/maxresdefault.jpg'}
    ];
  }
  findAll(): TuDien[]{
    return this.dsTuDien;
  }
  findById(id: string): TuDien{
    return this.dsTuDien.find(tuDien => tuDien.id === id);
  }
}
