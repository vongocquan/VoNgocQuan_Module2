package com.codegym.models;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
public class KhachHang {
    @Id
    @Pattern(regexp = "(KH-)\\d{4}", message = "mã khách hàng có dạng KH-XXXX(X là ký tự số)")
    private String maKhachHang;
    @ManyToOne
    @JoinColumn(name = "ma_loai_khach")
    private LoaiKhach loaiKhach;
    @OneToMany(mappedBy = "khachHang")
    private List<HopDong> hopDongList;
    private String tenKhachHang;
    private String ngaySinh;
    @Pattern(regexp = "(\\d{9})|(\\d{12})", message = "chứng minh thư phải có 9 hoặc 12 chữ số")
    private String chungMinhThu;
    @Pattern(regexp = "((090)|(091)|(\\(84\\)\\+90)|(\\(84\\)\\+91))\\d{7}",
            message = "Số điện thoại phải có dạng 090xxxxxxx hoặc 091xxxxxxx hoặc (84)+90xxxxxxx hoặc (84)+91xxxxxxx")
    private String soDienThoai;
    @Pattern(regexp = "(\\w)+[@](\\w)+[.](\\w)+", message = "email có dạng abc@abc.abc")
    private String email;
    private String diaChi;

    public KhachHang() {
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public LoaiKhach getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(LoaiKhach loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public List<HopDong> getHopDongList() {
        return hopDongList;
    }

    public void setHopDongList(List<HopDong> hopDongList) {
        this.hopDongList = hopDongList;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getChungMinhThu() {
        return chungMinhThu;
    }

    public void setChungMinhThu(String chungMinhThu) {
        this.chungMinhThu = chungMinhThu;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
