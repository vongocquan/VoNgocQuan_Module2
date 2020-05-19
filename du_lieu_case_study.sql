
-- vi tri
use case_study;
delete from vi_tri;
alter table vi_tri auto_increment = 1;
INSERT INTO `case_study`.`vi_tri` (`ten_vi_tri`) VALUES ('quan ly');
INSERT INTO `case_study`.`vi_tri` (`ten_vi_tri`) VALUES ('giam sat');
INSERT INTO `case_study`.`vi_tri` (`ten_vi_tri`) VALUES ('le tan');
INSERT INTO `case_study`.`vi_tri` (`ten_vi_tri`) VALUES ('phuc vu');

-- trinh do
INSERT INTO `case_study`.`trinh_do` (`trinh_do`) VALUES ('dai hoc');
INSERT INTO `case_study`.`trinh_do` (`trinh_do`) VALUES ('cao dang');
INSERT INTO `case_study`.`trinh_do` (`trinh_do`) VALUES ('trung cap');

-- bo phan 
INSERT INTO `case_study`.`bo_phan` (`ten_bo_phan`) VALUES ('nhan hang');
INSERT INTO `case_study`.`bo_phan` (`ten_bo_phan`) VALUES ('khach san');

-- nhan vien
INSERT INTO `case_study`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`, `ngay_sinh_nhan_vien`, `chung_minh_thu`, `luong`, `so_dien_thoai`, `email`, `dia_chi`) VALUES ('1', 'Nguyen Duc', '1', '2', '1', '1997-08-12', '1928832737', '6800000', '092873621', 'duc@gmail.com', 'Quang Nam');
INSERT INTO `case_study`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`, `ngay_sinh_nhan_vien`, `chung_minh_thu`, `luong`, `so_dien_thoai`, `email`, `dia_chi`) VALUES ('2', 'Tran Thu Loi', '2', '1', '2', '1996-12-13', '1736026123', '6000000', '019283263', 'loi@gmail.com', 'Vinh');
INSERT INTO `case_study`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`, `ngay_sinh_nhan_vien`, `chung_minh_thu`, `luong`, `so_dien_thoai`, `email`, `dia_chi`) VALUES ('3', 'Nguyen Thanh', '4', '1', '2', '1995-09-23', '1837253012', '6100000', '029273235', 'thanh@gmail.com', 'Hue');
INSERT INTO `case_study`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`, `ngay_sinh_nhan_vien`, `chung_minh_thu`, `luong`, `so_dien_thoai`, `email`, `dia_chi`) VALUES ('4', 'Nguyen Phuc', '3', '3', '1', '1996-02-04', '1921372432', '5900000', '012873234', 'phuc@gmail.com', 'Gia Lai');
INSERT INTO `case_study`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`, `ngay_sinh_nhan_vien`, `chung_minh_thu`, `luong`, `so_dien_thoai`, `email`, `dia_chi`) VALUES ('5', 'Tran Van Manh', '2', '2', '1', '1998-09-13', '1273023843', '5800000', '098361324', 'manh@gmail.com', 'Quang Tri');
INSERT INTO `case_study`.`nhan_vien` (`ma_nhan_vien`, `ten_nhan_vien`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`, `ngay_sinh_nhan_vien`, `chung_minh_thu`, `luong`, `so_dien_thoai`, `email`, `dia_chi`) VALUES ('6', 'Nguyen Thanh Danh', '4', '2', '2', '1994-01-04', '1920326122', '6000000', '012837643', 'danh@gmail.com', 'Quang Ngai');

-- loai_khach
INSERT INTO `case_study`.`loai_khach` (`ten_loai_khach_hang`) VALUES ('Diamond');
INSERT INTO `case_study`.`loai_khach` (`ten_loai_khach_hang`) VALUES ('Platinium');
INSERT INTO `case_study`.`loai_khach` (`ten_loai_khach_hang`) VALUES ('Gold');
INSERT INTO `case_study`.`loai_khach` (`ten_loai_khach_hang`) VALUES ('Silver');
INSERT INTO `case_study`.`loai_khach` (`ten_loai_khach_hang`) VALUES ('Member');

-- khach hang
INSERT INTO `case_study`.`khach_hang` (`ma_loai_khach_hang`, `ten_khach_hang`, `ngay_sinh_khach_hang`, `chung_minh_thu`, `so_dien_thoai`, `email`, `dia_chi`) VALUES ('1', 'Vo Cong Danh', '1980-12-07', '2918723726', '019273264', 'danh@gmail.com', 'Ha Noi');
INSERT INTO `case_study`.`khach_hang` (`ma_loai_khach_hang`, `ten_khach_hang`, `ngay_sinh_khach_hang`, `chung_minh_thu`, `so_dien_thoai`, `email`, `dia_chi`) VALUES ('5', 'Nguyen Thi Thu', '1950-08-21', '2032737432', '012973264', 'thu@gmail.com', 'Hai Phong');
INSERT INTO `case_study`.`khach_hang` (`ma_loai_khach_hang`, `ten_khach_hang`, `ngay_sinh_khach_hang`, `chung_minh_thu`, `so_dien_thoai`, `email`, `dia_chi`) VALUES ('2', 'Nguyen Thi Vi', '1964-09-25', '1203924743', '013624734', 'vi@gmail.com', 'Da Nang');
INSERT INTO `case_study`.`khach_hang` (`ma_loai_khach_hang`, `ten_khach_hang`, `ngay_sinh_khach_hang`, `chung_minh_thu`, `so_dien_thoai`, `email`, `dia_chi`) VALUES ('1', 'Pham Quoc', '1952-11-02', '1293743756', '012937264', 'quoc@gmail.com', 'Quang Tri');
INSERT INTO `case_study`.`khach_hang` (`ma_loai_khach_hang`, `ten_khach_hang`, `ngay_sinh_khach_hang`, `chung_minh_thu`, `so_dien_thoai`, `email`, `dia_chi`) VALUES ('3', 'Vo Van Tu', '1976-07-02', '1283484378', '019272462', 'tu@gmail.com', 'Da Nang');
INSERT INTO `case_study`.`khach_hang` (`ma_loai_khach_hang`, `ten_khach_hang`, `ngay_sinh_khach_hang`, `chung_minh_thu`, `so_dien_thoai`, `email`, `dia_chi`) VALUES ('4', 'Nguyen Thi Them', '1987-09-21', '1293746543', '012734954', 'them@gmail.com', 'Hue');
INSERT INTO `case_study`.`khach_hang` (`ma_loai_khach_hang`, `ten_khach_hang`, `ngay_sinh_khach_hang`, `chung_minh_thu`, `so_dien_thoai`, `email`, `dia_chi`) VALUES ('2', 'Le Van Son', '1965-09-09', '1293827463', '018232474', 'son@gmail.com', 'Quang Binh');
INSERT INTO `case_study`.`khach_hang` (`ma_loai_khach_hang`, `ten_khach_hang`, `ngay_sinh_khach_hang`, `chung_minh_thu`, `so_dien_thoai`, `email`, `dia_chi`) VALUES ('1', 'Vo Quoc Truong', '1954-09-12', '2183623643', '012973465', 'truong@gmail.com', 'Quang Ngai');
INSERT INTO `case_study`.`khach_hang` (`ma_loai_khach_hang`, `ten_khach_hang`, `ngay_sinh_khach_hang`, `chung_minh_thu`, `so_dien_thoai`, `email`, `dia_chi`) VALUES ('2', 'Le Hong Loi', '1986-02-03', '1928323432', '019283247', 'loi@gmail.com', 'Binh Dinh');

-- keiu thue
INSERT INTO `case_study`.`kieu_thue` (`ten_kieu_thue`) VALUES ('thue theo ngay');
INSERT INTO `case_study`.`kieu_thue` (`ten_kieu_thue`) VALUES ('thue theo thang');
INSERT INTO `case_study`.`kieu_thue` (`ten_kieu_thue`) VALUES ('thue theo nam');

-- loai dich vu
INSERT INTO `case_study`.`loai_dich_vu` (`ten_loai_dich_vu`) VALUES ('villa');
INSERT INTO `case_study`.`loai_dich_vu` (`ten_loai_dich_vu`) VALUES ('house');
INSERT INTO `case_study`.`loai_dich_vu` (`ten_loai_dich_vu`) VALUES ('room');

-- dich vu
INSERT INTO `case_study`.`dich_vu` (`ten_dich_vu`, `dien_tich`, `so_tang`, `so_nguoi_toi_da`, `chi_phi_thue`, `ma_kieu_thue`, `ma_loai_dich_vu`) VALUES ('Villa1', '50', '4', '6', '2000000', '1', '1');
INSERT INTO `case_study`.`dich_vu` (`ten_dich_vu`, `dien_tich`, `so_tang`, `so_nguoi_toi_da`, `chi_phi_thue`, `ma_kieu_thue`, `ma_loai_dich_vu`) VALUES ('Villa2', '50', '3', '3', '1500000', '2', '1');
INSERT INTO `case_study`.`dich_vu` (`ten_dich_vu`, `dien_tich`, `so_tang`, `so_nguoi_toi_da`, `chi_phi_thue`, `ma_kieu_thue`, `ma_loai_dich_vu`) VALUES ('Villa3', '40', '3', '3', '1000000', '3', '1');
INSERT INTO `case_study`.`dich_vu` (`ten_dich_vu`, `dien_tich`, `so_tang`, `so_nguoi_toi_da`, `chi_phi_thue`, `ma_kieu_thue`, `ma_loai_dich_vu`) VALUES ('House1', '40', '2', '4', '1000000', '1', '2');
INSERT INTO `case_study`.`dich_vu` (`ten_dich_vu`, `dien_tich`, `so_tang`, `so_nguoi_toi_da`, `chi_phi_thue`, `ma_kieu_thue`, `ma_loai_dich_vu`) VALUES ('House2', '35', '2', '4', '800000', '2', '2');
INSERT INTO `case_study`.`dich_vu` (`ten_dich_vu`, `dien_tich`, `so_tang`, `so_nguoi_toi_da`, `chi_phi_thue`, `ma_kieu_thue`, `ma_loai_dich_vu`) VALUES ('House3', '30', '2', '4', '600000', '3', '2');
INSERT INTO `case_study`.`dich_vu` (`ten_dich_vu`, `dien_tich`, `so_tang`, `so_nguoi_toi_da`, `chi_phi_thue`, `ma_kieu_thue`, `ma_loai_dich_vu`) VALUES ('Room1', '30', '1', '2', '500000', '1', '3');
INSERT INTO `case_study`.`dich_vu` (`ten_dich_vu`, `dien_tich`, `so_tang`, `so_nguoi_toi_da`, `chi_phi_thue`, `ma_kieu_thue`, `ma_loai_dich_vu`) VALUES ('Room2', '30', '1', '2', '500000', '2', '3');
INSERT INTO `case_study`.`dich_vu` (`ten_dich_vu`, `dien_tich`, `so_tang`, `so_nguoi_toi_da`, `chi_phi_thue`, `ma_kieu_thue`, `ma_loai_dich_vu`) VALUES ('Room3', '30', '1', '2', '400000', '3', '3');

-- hop_dong
INSERT INTO `case_study`.`hop_dong` (`ma_nhan_vien`, `ma_khach_hang`, `ma_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`, `tien_dat_coc`) VALUES ('2', '1', '2', '2018-06-02', '2019-06-09', '100000');
INSERT INTO `case_study`.`hop_dong` (`ma_nhan_vien`, `ma_khach_hang`, `ma_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`, `tien_dat_coc`) VALUES ('3', '2', '9', '2018-02-19', '2019-09-12', '100000');
INSERT INTO `case_study`.`hop_dong` (`ma_nhan_vien`, `ma_khach_hang`, `ma_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`, `tien_dat_coc`) VALUES ('1', '2', '3', '2019-08-23', '2020-01-02', '100000');
INSERT INTO `case_study`.`hop_dong` (`ma_nhan_vien`, `ma_khach_hang`, `ma_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`, `tien_dat_coc`) VALUES ('4', '3', '4', '2018-07-09', '2019-08-02', '100000');
INSERT INTO `case_study`.`hop_dong` (`ma_nhan_vien`, `ma_khach_hang`, `ma_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`, `tien_dat_coc`) VALUES ('3', '5', '1', '2018-06-13', '2019-06-18', '100000');
INSERT INTO `case_study`.`hop_dong` (`ma_nhan_vien`, `ma_khach_hang`, `ma_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`, `tien_dat_coc`) VALUES ('4', '6', '2', '2018-09-06', '2019-02-16', '100000');
INSERT INTO `case_study`.`hop_dong` (`ma_nhan_vien`, `ma_khach_hang`, `ma_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`, `tien_dat_coc`) VALUES ('4', '1', '3', '2018-02-07', '2019-08-18', '100000');
INSERT INTO `case_study`.`hop_dong` (`ma_nhan_vien`, `ma_khach_hang`, `ma_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`, `tien_dat_coc`) VALUES ('3', '2', '4', '2019-07-01', '2020-05-09', '100000');
UPDATE `case_study`.`hop_dong` SET `tong_tien` = '5000000' WHERE (`ma_hop_dong` = '1');
UPDATE `case_study`.`hop_dong` SET `tong_tien` = '4000000' WHERE (`ma_hop_dong` = '2');
UPDATE `case_study`.`hop_dong` SET `tong_tien` = '3000000' WHERE (`ma_hop_dong` = '3');
UPDATE `case_study`.`hop_dong` SET `tong_tien` = '6000000' WHERE (`ma_hop_dong` = '4');
UPDATE `case_study`.`hop_dong` SET `tong_tien` = '3000000' WHERE (`ma_hop_dong` = '5');
UPDATE `case_study`.`hop_dong` SET `tong_tien` = '4000000' WHERE (`ma_hop_dong` = '6');
UPDATE `case_study`.`hop_dong` SET `tong_tien` = '4500000' WHERE (`ma_hop_dong` = '7');
UPDATE `case_study`.`hop_dong` SET `tong_tien` = '8000000' WHERE (`ma_hop_dong` = '8');
INSERT INTO `case_study`.`hop_dong` (`ma_nhan_vien`, `ma_khach_hang`, `ma_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`, `tien_dat_coc`, `tong_tien`) VALUES ('2', '9', '4', '2019-02-12', '2020-09-21', '100000', '7000000');
INSERT INTO `case_study`.`hop_dong` (`ma_nhan_vien`, `ma_khach_hang`, `ma_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`, `tien_dat_coc`, `tong_tien`) VALUES ('2', '7', '2', '2016-03-08', '2017-09-12', '100000', '7000000');
INSERT INTO `case_study`.`hop_dong` (`ma_nhan_vien`, `ma_khach_hang`, `ma_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`, `tien_dat_coc`, `tong_tien`) VALUES ('3', '8', '1', '2016-12-21', '2017-09-15', '100000', '6500000');



-- dich vu di kem
INSERT INTO `case_study`.`dich_vu_di_kem` (`ten_dich_vu_di_kem`, `gia`, `don_vi`) VALUES ('massage', '500000', '1');
INSERT INTO `case_study`.`dich_vu_di_kem` (`ten_dich_vu_di_kem`, `gia`, `don_vi`) VALUES ('karaoke', '400000', '6');
INSERT INTO `case_study`.`dich_vu_di_kem` (`ten_dich_vu_di_kem`, `gia`, `don_vi`) VALUES ('thuc an', '200000', '1');
INSERT INTO `case_study`.`dich_vu_di_kem` (`ten_dich_vu_di_kem`, `gia`, `don_vi`) VALUES ('nuoc uong', '50000', '1');
INSERT INTO `case_study`.`dich_vu_di_kem` (`ten_dich_vu_di_kem`, `gia`, `don_vi`) VALUES ('thue xe di chuyen', '500000', '2');

-- hop dong chi tiet
INSERT INTO `case_study`.`hop_dong_chi_tiet` (`ma_hop_dong`, `ma_dich_vu_di_kem`, `so_luong`) VALUES ('2', '1', '1');
INSERT INTO `case_study`.`hop_dong_chi_tiet` (`ma_hop_dong`, `ma_dich_vu_di_kem`, `so_luong`) VALUES ('1', '3', '2');
INSERT INTO `case_study`.`hop_dong_chi_tiet` (`ma_hop_dong`, `ma_dich_vu_di_kem`, `so_luong`) VALUES ('3', '1', '2');
INSERT INTO `case_study`.`hop_dong_chi_tiet` (`ma_hop_dong`, `ma_dich_vu_di_kem`, `so_luong`) VALUES ('5', '2', '1');
INSERT INTO `case_study`.`hop_dong_chi_tiet` (`ma_hop_dong`, `ma_dich_vu_di_kem`, `so_luong`) VALUES ('3', '5', '1');
INSERT INTO `case_study`.`hop_dong_chi_tiet` (`ma_hop_dong`, `ma_dich_vu_di_kem`, `so_luong`) VALUES ('4', '3', '2');
