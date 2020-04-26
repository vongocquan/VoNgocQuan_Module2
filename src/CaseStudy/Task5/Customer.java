package CaseStudy.Task5;

import CaseStudy.Task1.Services;
import CaseStudy.Task1.Villa;
import CauTrucDuLieuVaGiaiThuatToan.CacPhuongThucCuaArrList.MyList;
import com.sun.deploy.cache.BaseLocalApplicationProperties;

import java.util.Arrays;

public class Customer {
    private String tenCustomer;
    String ngaySinh;
    String gioiTinh;
    String cmnd;
    String soDienThoai;
    String email;
    String loaiKhach;
    String diaChi;
    Services services;



    @Override
    public String toString() {
        return "Customer{" +
                "tenCustomer='" + tenCustomer + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", cmnd='" + cmnd + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", email='" + email + '\'' +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", services=" + services +
                '}';
    }

    public Customer() {
    }

    public String getTenCustomer() {
        return tenCustomer;
    }

    public void setTenCustomer(String tenCustomer) {
        this.tenCustomer = tenCustomer;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
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

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Customer(String tenCustomer, String ngaySinh, String gioiTinh, String cmnd, String soDienThoai, String email, String loaiKhach, String diaChi, Services services) {
        this.tenCustomer = tenCustomer;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
        this.services = services;
    }

    public static void main(String[] args) {

//        Customer customer = new Customer("quan", "4/1/23", "nam", "1232", "sdt", "sadsa", "asda", "asde",);

//        System.out.println(customer.getCmnd());
    }
}
