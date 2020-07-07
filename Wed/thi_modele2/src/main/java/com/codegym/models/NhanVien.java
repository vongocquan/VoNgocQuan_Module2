package com.codegym.models;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.ConstraintViolation;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;
import java.util.Calendar;


@Entity
public class NhanVien implements Validator {
    @Id
    private String maNhanVien;
    private String NhomNhanVien;
    @NotEmpty(message = "họ và tên không được để trống")
    private String hoVaTen;
    private String ngaySinh;
    private String gioiTinh = "Nam";

    @NotEmpty(message = "số điện thoại không được để trống")
    private String soDienThoai;
    @Pattern(regexp = "\\d{12}", message = "số điện thoại phải chứa 12 chữa số")
    private String chungMinhThu;
    @Pattern(regexp = "\\w+[@]\\w+[.]\\w+", message = "email phải có dạng abc@abc.abc")
    private String email;
    @NotEmpty(message = "địa chỉ không được để trống")
    private String diaChi;

    public NhanVien() {
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getNhomNhanVien() {
        return NhomNhanVien;
    }

    public void setNhomNhanVien(String nhomNhanVien) {
        NhomNhanVien = nhomNhanVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
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

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getChungMinhThu() {
        return chungMinhThu;
    }

    public void setChungMinhThu(String chungMinhThu) {
        this.chungMinhThu = chungMinhThu;
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

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        NhanVien nhanVien = (NhanVien) target;
        Calendar cal = Calendar.getInstance();
        int namHienTai = cal.get(Calendar.YEAR);
        int ngayHienTai = cal.get(Calendar.DAY_OF_MONTH);
        int thangHienTai = cal.get(Calendar.MONTH) + 1;
        String[] arr;
        if (nhanVien.ngaySinh.equals("")){
            errors.rejectValue("ngaySinh", "errorNgaySinh");
        }else {
            arr = nhanVien.ngaySinh.split("-");
            if (Integer.parseInt(arr[0]) + 18 > namHienTai) {
                errors.rejectValue("ngaySinh", "errorNgaySinh");
            } else if (Integer.parseInt(arr[0]) + 18 == namHienTai) {
                if (Integer.parseInt(arr[1]) > thangHienTai) {
                    errors.rejectValue("ngaySinh", "errorNgaySinh");
                } else if (Integer.parseInt(arr[1]) == thangHienTai) {
                    if (Integer.parseInt(arr[2]) > ngayHienTai) {
                        errors.rejectValue("ngaySinh", "errorNgaySinh");
                    }
                }
            }
        }
    }
}
