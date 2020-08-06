export class Service {
  maDichVu: string;
  tenDichVu: string;
  dienTich: string;
  soTang: string;
  soNguoiToiDa: string;
  chiPhiThue: string;
  kieuThue: string;
  trangThai: string;

  // tslint:disable-next-line:max-line-length
  constructor(maDichVu: string, tenDichVu: string, dienTich: string, soTang: string, soNguoiToiDa: string, chiPhiThue: string, kieuThue: string, trangThai: string) {
    this.maDichVu = maDichVu;
    this.tenDichVu = tenDichVu;
    this.dienTich = dienTich;
    this.soTang = soTang;
    this.soNguoiToiDa = soNguoiToiDa;
    this.chiPhiThue = chiPhiThue;
    this.kieuThue = kieuThue;
    this.trangThai = trangThai;
  }
}
