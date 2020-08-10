export class Contract {
  maHopDong: string;
  nhanVien: string;
  khachHang: string;
  dichVu: string;
  ngayLamHopDong: string;
  ngayKetThucHopDong: string;
  tienDatCoc: string;
  tongTien: string;

  // tslint:disable-next-line:max-line-length
  constructor(maHopDong: string, nhanVien: string, khachHang: string, dichVu: string, ngayLamHopDong: string, ngayKetThucHopDong: string, tienDatCoc: string, tongTien: string) {
    this.maHopDong = maHopDong;
    this.nhanVien = nhanVien;
    this.khachHang = khachHang;
    this.dichVu = dichVu;
    this.ngayLamHopDong = ngayLamHopDong;
    this.ngayKetThucHopDong = ngayKetThucHopDong;
    this.tienDatCoc = tienDatCoc;
    this.tongTien = tongTien;
  }
}
