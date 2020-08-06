export class Customer {
  maKhachHang: string;
  loaiKhachHang: string;
  hoTen: string;
  ngaySinh: string;
  soCMND: string;
  soDienThoai: string;
  email: string;
  diaChi: string;

  // tslint:disable-next-line:max-line-length
  constructor(maKhachHang: string, loaiKhachHang: string, hoTen: string, ngaySinh: string, soCMND: string, soDienThoai: string, email: string, diaChi: string) {
    this.maKhachHang = maKhachHang;
    this.loaiKhachHang = loaiKhachHang;
    this.hoTen = hoTen;
    this.ngaySinh = ngaySinh;
    this.soCMND = soCMND;
    this.soDienThoai = soDienThoai;
    this.email = email;
    this.diaChi = diaChi;
  }
}







