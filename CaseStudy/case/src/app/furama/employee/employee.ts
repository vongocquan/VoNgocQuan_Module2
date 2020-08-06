export class Employee {
  maNhanVien: string;
  hoTen: string;
  viTri: string;
  trinhDo: string;
  boPhan: string;
  ngaySinh: string;
  soCMND: string;
  luong: string;
  soDienThoai: string;
  email: string;
  diaChi: string;
  // tslint:disable-next-line:max-line-length
  constructor(maNhanVien: string, hoTen: string, viTri: string, trinhDo: string, boPhan: string, ngaySinh: string, soCMND: string, luong: string, soDienThoai: string, email: string, diaChi: string) {
    this.maNhanVien = maNhanVien;
    this.hoTen = hoTen;
    this.viTri = viTri;
    this.trinhDo = trinhDo;
    this.boPhan = boPhan;
    this.ngaySinh = ngaySinh;
    this.soCMND = soCMND;
    this.luong = luong;
    this.soDienThoai = soDienThoai;
    this.email = email;
    this.diaChi = diaChi;
  }
}

