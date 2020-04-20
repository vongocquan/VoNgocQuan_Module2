package CaseStudy.Task2;

import CaseStudy.Task1.House;
import CaseStudy.Task1.Room;
import CaseStudy.Task1.Services;
import CaseStudy.Task1.Villa;

import java.util.Scanner;

public class Task2 {
    public static void displayMainMenu() {
        System.out.println ("1. Add New Services");
        System.out.println("2. Show Services");
        System.out.println("3. Add New Customer");
        System.out.println("4. Show Information of Customer");
        System.out.println("5. Add New Booking");
        System.out.println("6. Show Information of Employee");
        System.out.println("7. Exit");
    }
    public static void addNewServices(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add New Villa \n2. Add New House \n3. Add New Room \n4. Back to menu \n5. Exit" );
        System.out.print("nhập: ");
        int num1 = scanner.nextInt();
        Services[] services = new Services[3];
        Villa villa = new Villa();
        services[0] = villa;
        House house = new House();
        services[1] = house;
        Room room = new Room();
        services[2] = room;
        switch (num1){
            case 1: {
                System.out.print("nhập tên dịch vụ: ");
                services[0].setTenDichVu(scanner.next());
                System.out.print("nhập diện tích sử dụng: ");
                services[0].setDienTichSuDung(scanner.next());
                System.out.print("nhập chi phí thuê: ");
                services[0].setChiPhiThue(scanner.next());
                System.out.print("nhập số lượng người tối đa");
                services[0].setSoLuongNguoiToiDa(scanner.nextInt());
                System.out.print("nhập kiểu thuê: ");
                services[0].setKieuThue(scanner.next());
                System.out.print("nhập tiêu chuẩn phòng: ");
                villa.setTieuChuanPhong(scanner.next());
                System.out.print("nhập mô tả tiện nghi khác: ");
                villa.setMoTaTienNghiKhac(scanner.next());
                System.out.print("nhập diện tích hồ bơi: ");
                villa.setDienTichHoBoi(scanner.next());
                System.out.print("nhập số tầng: ");
                villa.setSoTang(scanner.next());
                addNewServices();
                break;
            } case 2:{
                System.out.print("nhập tên dịch vụ: ");
                services[1].setTenDichVu(scanner.next());
                System.out.print("nhập diện tích sử dụng: ");
                services[1].setDienTichSuDung(scanner.next());
                System.out.print("nhập chi phí thuê: ");
                services[1].setChiPhiThue(scanner.next());
                System.out.print("nhập số lượng người tối đa");
                services[1].setSoLuongNguoiToiDa(scanner.nextInt());
                System.out.print("nhập kiểu thuê: ");
                services[1].setKieuThue(scanner.next());
                System.out.print("nhập tiêu chuẩn phòng: ");
                house.setTieuChuanPhong(scanner.next());
                System.out.print("nhập mô tả tiện nghi khác: ");
                house.setMoTaTienNghiKhac(scanner.next());
                System.out.print("nhập số tầng: ");
                house.setSoTang(scanner.next());
                addNewServices();
                break;
            } case 3:{
                System.out.print("nhập tên dịch vụ: ");
                services[2].setTenDichVu(scanner.next());
                System.out.print("nhập diện tích sử dụng: ");
                services[2].setDienTichSuDung(scanner.next());
                System.out.print("nhập chi phí thuê: ");
                services[2].setChiPhiThue(scanner.next());
                System.out.print("nhập số lượng người tối đa");
                services[2].setSoLuongNguoiToiDa(scanner.nextInt());
                System.out.print("nhập kiểu thuê: ");
                services[2].setKieuThue(scanner.next());
                System.out.print("nhập dịch vụ đi kèm: ");
                room.setDichVuDiKem(scanner.next());
                addNewServices();
            } case 4:{
                displayMainMenu();
            }
        }

    }
    public static void showServices(){
        System.out.println("1. Show all Villa \n2. Show all House \n3. Show all Room \n4. Show All Name Villa Not Duplicate" +
                "\n5. Show All Name House Not Duplicate \n6. Show All Name Room Not Duplicate \n7. Back to menu \n8. Exit");
    }
    public static void main(String[] args) {
        displayMainMenu();
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap: ");
        int x = scanner.nextInt();
        switch (x){
            case 1:{
                addNewServices();
            }case 2:{
                showServices();
            }
        }
    }
}
