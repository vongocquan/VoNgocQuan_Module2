package com.codegym.models;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
public class NhanVien {
    @Id
    private Integer maNhanVien;
    private String tenNhanVien;
    @ManyToOne
    @JoinColumn(name = "vi_tri_id")
    private ViTri viTri;
    @ManyToOne
    @JoinColumn(name = "trinh_do_id")
    private TrinhDo trinhDo;
    @ManyToOne
    @JoinColumn(name = "bo_phan_id")
    private BoPhan boPhan;
    private String ngaySinh;
    private String chungMinhThu;
    private Integer luong;
//    @Pattern(regexp = "^((090)|(\\(84\\)\\+90)|(091)|(\\(84\\)\\+91))+[0-9]{7}$"
    @Pattern(regexp = "((090)|(091)|(\\(84\\)\\+90)|(\\(84\\)\\+91))\\d{7}")
    private String soDienThoai;
    private String email;
    private String diaChi;
    @OneToMany(mappedBy = "nhanVien")
    private List<HopDong> listHopDong;
    public NhanVien() {
    }

    public Integer getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(Integer maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public ViTri getViTri() {
        return viTri;
    }

    public void setViTri(ViTri viTri) {
        this.viTri = viTri;
    }

    public TrinhDo getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(TrinhDo trinhDo) {
        this.trinhDo = trinhDo;
    }

    public BoPhan getBoPhan() {
        return boPhan;
    }

    public void setBoPhan(BoPhan boPhan) {
        this.boPhan = boPhan;
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

    public Integer getLuong() {
        return luong;
    }

    public void setLuong(Integer luong) {
        this.luong = luong;
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

    public List<HopDong> getListHopDong() {
        return listHopDong;
    }

    public void setListHopDong(List<HopDong> listHopDong) {
        this.listHopDong = listHopDong;
    }
}
