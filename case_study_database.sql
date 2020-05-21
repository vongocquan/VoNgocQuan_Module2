
-- task2
use case_study;
select ma_nhan_vien, ten_nhan_vien as ten , trinh_do, ten_vi_tri, ten_bo_phan, ngay_sinh_nhan_vien, email, dia_chi, (select count(ten_nhan_vien) from nhan_vien where ten = ten_nhan_vien) as tong_ten
from nhan_vien
inner join trinh_do on nhan_vien.ma_trinh_do = trinh_do.ma_trinh_do
inner join vi_tri on nhan_vien.ma_vi_tri = vi_tri.ma_vi_tri
inner join bo_phan on bo_phan.ma_bo_phan = bo_phan.ma_bo_phan
where length(ten_nhan_vien) < 15 
and (LEFt(reverse(ten_nhan_vien), INSTR(reverse(ten_nhan_vien), ' ')) like '%H_'
or LEFT(reverse(ten_nhan_vien), INSTR(reverse(ten_nhan_vien), ' ')) like '%T_'
or LEFT(reverse(ten_nhan_vien), INSTR(reverse(ten_nhan_vien), ' ')) like '%K_')
group by ten_nhan_vien;



-- task 3
use case_study;
select ma_khach_hang, ten_loai_khach_hang, ten_khach_hang, ngay_sinh_khach_hang, so_dien_thoai, dia_chi
from khach_hang
inner join loai_khach on khach_hang.ma_loai_khach_hang = loai_khach.ma_loai_khach_hang
where ROUND(DATEDIFF(CURDATE(), ngay_sinh_khach_hang) / 365, 0) > 18
and ROUND(DATEDIFF(CURDATE(), ngay_sinh_khach_hang) / 365, 0) < 50
and (dia_chi = 'Da Nang' or dia_chi = 'Quang Tri');



-- xoa table reset auto_increment khi table có chứa khóa ngoại;
-- delete from  hop_dong;
-- alter table hop_dong auto_increment =1;

-- task 4
use case_study;
select khach_hang.ma_khach_hang, ten_khach_hang, count(hop_dong.ma_khach_hang) as so_hop_dong, ten_loai_khach_hang
from khach_hang
left join hop_dong
on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
inner join loai_khach on khach_hang.ma_loai_khach_hang = loai_khach.ma_loai_khach_hang
group by ma_khach_hang
having ten_loai_khach_hang = 'Diamond'
order by so_hop_dong;


-- task 5
	select  khach_hang.ma_khach_hang, ten_khach_hang, ten_loai_khach_hang, hop_dong.ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc
   , (chi_phi_thue + dich_vu_di_kem.gia * so_luong) as tong_tien
	from khach_hang
	left join hop_dong 
	on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
	left join loai_khach on khach_hang.ma_loai_khach_hang = loai_khach.ma_loai_khach_hang
	left join dich_vu on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
	 join hop_dong_chi_tiet 
--      on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
     join dich_vu_di_kem 
--      on hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
group by ma_hop_dong;


-- task6 
select hd1.ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu
from hop_dong hd1
inner join dich_vu on dich_vu.ma_dich_vu = hd1.ma_dich_vu
inner join loai_dich_vu on dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
where 
-- year(hd1.ngay_lam_hop_dong) != 2019 and
hd1.ma_dich_vu 
not in (select hd2.ma_dich_vu
from hop_dong hd2
where month(hd2.ngay_lam_hop_dong) = 1 or month(hd2.ngay_lam_hop_dong) = 2 or month(hd2.ngay_lam_hop_dong) = 3
and hd1.ma_dich_vu = hd2.ma_dich_vu)
group by ma_dich_vu;

 
 
-- task7
 select hd1.ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu
from hop_dong hd1
inner join dich_vu  on hd1.ma_dich_vu =  dich_vu.ma_dich_vu
inner join loai_dich_vu on dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
where year(hd1.ngay_lam_hop_dong) = 2018 and hd1.ma_dich_vu 
not in (select hd2.ma_dich_vu
from hop_dong hd2
where year(hd2.ngay_lam_hop_dong) = 2019 and hd1.ma_dich_vu = hd2.ma_dich_vu);


-- task 8
-- c1
select ten_khach_hang
from khach_hang
group by ten_khach_hang;

-- c2
select DISTINCT ten_khach_hang
from khach_hang;

-- c3
select ten_khach_hang from khach_hang union select ten_khach_hang from khach_hang;

-- task9
select month(ngay_lam_hop_dong) as thang, count(month(ngay_lam_hop_dong)) as so_nguoi_dat
from hop_dong
group by month(ngay_lam_hop_dong);

-- task10
SELECT 
    hop_dong.ma_hop_dong,
    ngay_lam_hop_dong,
    ngay_ket_thuc,
    tien_dat_coc,
    COUNT(dich_vu_di_kem.ma_dich_vu_di_kem) AS so_luong_dich_vu_di_kem
FROM
    dich_vu_di_kem
        RIGHT JOIN
    hop_dong_chi_tiet ON dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
        RIGHT JOIN
    hop_dong ON hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
GROUP BY hop_dong.ma_hop_dong;


-- task11
select dich_vu_di_kem.ma_dich_vu_di_kem, ten_dich_vu_di_kem, gia
from dich_vu_di_kem
inner join hop_dong_chi_tiet on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
inner join hop_dong on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
inner join khach_hang on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
inner join loai_khach on khach_hang.ma_loai_khach_hang = loai_khach.ma_loai_khach_hang
where ten_loai_khach_hang = 'Diamond' and (dia_chi = 'Vinh' or dia_chi = 'Quang Ngai')
group by ten_dich_vu_di_kem;

-- task12
select hop_dong_chi_tiet.ma_hop_dong, ten_nhan_vien, ten_khach_hang, khach_hang.so_dien_thoai, ten_dich_vu, count(khach_hang.ma_khach_hang) as so_luong_di_kem, tien_dat_coc
from hop_dong hd1
inner join khach_hang on khach_hang.ma_khach_hang = hd1.ma_khach_hang
inner join nhan_vien on hd1.ma_nhan_vien = nhan_vien.ma_nhan_vien
inner join dich_vu on hd1.ma_dich_vu = dich_vu.ma_dich_vu
inner join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hop_dong = hd1.ma_hop_dong
where (month(hd1.ngay_lam_hop_dong) = 10 or month(hd1.ngay_lam_hop_dong) = 11 or month(hd1.ngay_lam_hop_dong) = 12) and year(hd1.ngay_lam_hop_dong) = 2019
and hd1.ma_dich_vu not in (select hd2.ma_dich_vu
from hop_dong hd2
where (month(hd2.ngay_lam_hop_dong) = 1 or
month(hd2.ngay_lam_hop_dong) = 2 or 
month(hd2.ngay_lam_hop_dong) = 3 or
month(hd2.ngay_lam_hop_dong) = 4 or
month(hd2.ngay_lam_hop_dong) = 5 or
month(hd2.ngay_lam_hop_dong) = 6) and
year(hd2.ngay_lam_hop_dong) = 2019 and
hd1.ma_dich_vu = hd2.ma_dich_vu)
group by khach_hang.ma_khach_hang;


-- task13
 select dvdk1.ma_dich_vu_di_kem, ten_dich_vu_di_kem, count(dvdk1.ma_dich_vu_di_kem) as so_lan
from dich_vu_di_kem dvdk1
inner join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_dich_vu_di_kem = dvdk1.ma_dich_vu_di_kem
inner join hop_dong on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
group by dvdk1.ma_dich_vu_di_kem
having  (select count(dvdk2.ma_dich_vu_di_kem) as sl
from dich_vu_di_kem dvdk2 
inner join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_dich_vu_di_kem = dvdk2.ma_dich_vu_di_kem
inner join hop_dong on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
group by dvdk2.ma_dich_vu_di_kem
order by sl desc 
limit 1) = so_lan;

 -- task14
 select hop_dong.ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, count(ten_dich_vu_di_kem) as so_lan_su_dung
 from dich_vu_di_kem dvdk1
 inner join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_dich_vu_di_kem = dvdk1.ma_dich_vu_di_kem
 inner join hop_dong on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
 inner join dich_vu on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
 inner join loai_dich_vu on dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
 group by ten_dich_vu_di_kem
 having so_lan_su_dung = 1;
 
 -- task15
 select hop_dong.ma_nhan_vien, ten_nhan_vien, trinh_do, ten_bo_phan, nhan_vien.so_dien_thoai, dia_chi
 from hop_dong
 inner join nhan_vien on nhan_vien.ma_nhan_vien = hop_dong.ma_nhan_vien
 inner join trinh_do on trinh_do.ma_trinh_do = nhan_vien.ma_trinh_do
 inner join bo_phan on bo_phan.ma_bo_phan = nhan_vien.ma_bo_phan
 where year(ngay_lam_hop_dong) = 2018 or year(ngay_lam_hop_dong) = 2019
 group by hop_dong.ma_nhan_vien
 having count(hop_dong.ma_nhan_vien) <= 3;
 
 -- task 16
 alter table hop_dong drop foreign key hop_dong_ibfk_1;
 alter table hop_dong_chi_tiet drop foreign key hop_dong_chi_tiet_ibfk_1;

 
 delete from nhan_vien nv1
 where nv1.ma_nhan_vien not in (
 select hop_dong.ma_nhan_vien
 from hop_dong
 where year(ngay_lam_hop_dong) in (2017, 2018, 2019)
 group by hop_dong.ma_nhan_vien
 );
 
 delete from hop_dong hd1
 where hd1.ma_nhan_vien not in (
 select nhan_vien.ma_nhan_vien
 from nhan_vien);
 
 delete from hop_dong_chi_tiet hddk
where hddk.ma_hop_dong not in (
select hop_dong.ma_hop_dong
from hop_dong);
 
 
ALTER TABLE hop_dong ADD CONSTRAINT hop_dong_ibfk_1 FOREIGN KEY(ma_nhan_vien) REFERENCES nhan_vien(ma_nhan_vien);
ALTER TABLE hop_dong_chi_tiet ADD CONSTRAINT hop_dong_chi_tiet_ibfk_1 FOREIGN KEY(ma_hop_dong) REFERENCES hop_dong(ma_hop_dong);

-- task 17 

UPDATE khach_hang inner join (SELECT 
            khach_hang.ma_khach_hang
        FROM
            khach_hang
                INNER JOIN
            loai_khach ON khach_hang.ma_loai_khach_hang = loai_khach.ma_loai_khach_hang
            inner join hop_dong on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
        WHERE
            khach_hang.ma_loai_khach_hang = 2 and YEAR(ngay_lam_hop_dong) = 2019
        GROUP BY ma_khach_hang
        HAVING SUM(tong_tien) > 10000000) khach_can_update
SET 
    ma_loai_khach_hang = 1 where  khach_hang.ma_khach_hang = khach_can_update.ma_khach_hang;



-- task18 
alter table hop_dong_chi_tiet drop foreign key hop_dong_chi_tiet_ibfk_1;
delete from hop_dong
where year(ngay_lam_hop_dong) < 2016;
delete from hop_dong_chi_tiet
where ma_hop_dong not in (select hop_dong.ma_hop_dong
from hop_dong);
ALTER TABLE hop_dong_chi_tiet ADD CONSTRAINT hop_dong_chi_tiet_ibfk_1 FOREIGN KEY(ma_hop_dong) REFERENCES hop_dong(ma_hop_dong);

-- task19
update dich_vu_di_kem inner join (select dich_vu_di_kem.ma_dich_vu_di_kem
from dich_vu_di_kem
inner join hop_dong_chi_tiet on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
inner join hop_dong on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
where year(ngay_lam_hop_dong) = 2019
group by ma_dich_vu_di_kem
having count(dich_vu_di_kem.ma_dich_vu_di_kem) > 10) table_update
set gia = gia*2 where dich_vu_di_kem.ma_dich_vu_di_kem = table_update.ma_dich_vu_di_kem;

-- task 20
select ma_nhan_vien id, ten_nhan_vien ten, email, so_dien_thoai, ngay_sinh_nhan_vien ngay_sinh, dia_chi from nhan_vien union
select ma_khach_hang, ten_khach_hang, email, so_dien_thoai, ngay_sinh_khach_hang, dia_chi from khach_hang;

-- task 19
-- ko xu ly duoc cach nay
update dich_vu_di_kem dvdk1
set gia = gia * 2
where dvdk1.ma_dich_vu_di_kem in (select dvdk2.ma_dich_vu_di_kem
from dich_vu_di_kem dvdk2
inner join hop_dong_chi_tiet on dvdk2.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
inner join hop_dong on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
where year(ngay_lam_hop_dong) = 2019
group by ma_dich_vu_di_kem
having count(dvdk2.ma_dich_vu_di_kem)
);
