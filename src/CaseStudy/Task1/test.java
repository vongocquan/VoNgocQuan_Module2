package CaseStudy.Task1;

public class test {
    public static void main(String[] args) {
        Villa villa = new Villa();
        villa.setserviceName("thue phong");
        villa.setAreaUsed("45");
        villa.setRentalCosts("30do");
        villa.setMaximumPeople("3");
        villa.setRentalType("theo ngay");
        villa.setRoomStandard("tot");
        villa.setOtherFacilities("may giac, tu lanh, ho boi");
        villa.setPoolArea("15");
        villa.setNumberOfFloors("3");
        System.out.println(villa.showInfor());
        House house =new House();
        house.setRoomStandard("binh thuong");
        house.setMoTaTienNghiKhac("may giat, tu lanh");
        house.setNumberOfFloors("2");
        System.out.println(house.showInfor());
        Room room = new Room();
        room.setAccompaniedService("an toi");
        System.out.println(room.showInfor());


    }
}
