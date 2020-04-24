package CaseStudy.Task5;

import CaseStudy.Task1.Services;

public abstract class Customer {
    String tenCustomer;
    String ngaySinh;
    String gioiTinh;
    String cmnd;
    String soDienThoai;
    String email;
    String loaiKhach;
    String diaChi;
    Services services;

    abstract String showInfor();
}
