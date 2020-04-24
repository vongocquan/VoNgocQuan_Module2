package CaseStudy.Task1;

public class test {
    public static void main(String[] args) {
        Villa villa = new Villa();
        villa.setTenDichVu("thue phong");
        villa.setDienTichSuDung("45");
        villa.setChiPhiThue("30do");
        villa.setSoLuongNguoiToiDa("3");
        villa.setKieuThue("theo ngay");
        villa.setTieuChuanPhong("tot");
        villa.setMoTaTienNghiKhac("may giac, tu lanh, ho boi");
        villa.setDienTichHoBoi("15");
        villa.setSoTang("3");
        System.out.println(villa.showInfor());
        House house =new House();
        house.setTieuChuanPhong("binh thuong");
        house.setMoTaTienNghiKhac("may giat, tu lanh");
        house.setSoTang("2");
        System.out.println(house.showInfor());
        Room room = new Room();
        room.setDichVuDiKem("an toi");
        System.out.println(room.showInfor());


    }
}
