package CaseStudy.Task2;

import CaseStudy.Task1.House;
import CaseStudy.Task1.Room;
import CaseStudy.Task1.Services;
import CaseStudy.Task1.Villa;

import java.util.ArrayList;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task2 {
//    private ArrayList<Services>;
//    private ArrayList<Services> ;

    //task2
    public static void displayMainMenu() {
        System.out.println ("1. Add New Services");
        System.out.println("2. Show Services");
        System.out.println("3. Add New Customer");
        System.out.println("4. Show Information of Customer");
        System.out.println("5. Add New Booking");
        System.out.println("6. Show Information of Employee");
        System.out.println("7. Exit");
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap: ");
        int x = scanner.nextInt();
        switch (x){
            case 1:{
                addNewServices();
                break;
            }case 2:{
                showServices();
                break;
            } case 3:{

            }
        }

    }
    public static Services[] services = new Services[15];
    public static ArrayList<Services> arr = new ArrayList<Services>();

    public static void addNewServices(){
        Villa villa = new Villa();
        House house = new House();
        Room room = new Room();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add New Villa \n2. Add New House \n3. Add New Room \n4. Back to menu \n5. Exit" );
        System.out.print("nhập: ");

        int num1 = scanner.nextInt();
        String regexMaDichVu = "^[S][V][V][L][-][0-9]{4}$^";
        String regexTenDichVu = "^[A-Z]([a-z]+)$";
        switch (num1){
            case 1: {
                boolean check = false;
                do {
                    System.out.print("nhap ten dich vu: ");
                    villa.setTenDichVu(scanner.next());
                    if (Pattern.matches(regexTenDichVu, villa.getTenDichVu())){
                        check = true;
                    }
                    else {
                        System.out.print("khong hop le, vui long nhap lai!");
                    }
                }while (!check);
                check = false;
                do {
                    try {
                        System.out.print("nhap dien tich su dung: ");
                        villa.setDienTichSuDung(scanner.next());
                        if (Double.parseDouble(villa.getDienTichSuDung()) > 30){
                        check = true;
                        }else if (Double.parseDouble(villa.getDienTichSuDung()) <= 30){
                            System.out.println("dien tich su dung phai la so thuc lon hon 30. Yeu cau nhap lai!");
                        }
                    }catch (NumberFormatException e){
                        System.out.println("dien tich su dung phai la so thuc lon hon 30. Yeu cau nhap lai!");
                    }
                }while (!check);
                check = false;
                do {
                    try {
                        System.out.print("nhap chi phi thue: ");
                        villa.setChiPhiThue(scanner.next());
                        if (Double.parseDouble(villa.getChiPhiThue()) >  0){
                            check = true;
                        }else if (Double.parseDouble(villa.getChiPhiThue()) <= 0){
                            System.out.println("chi phi thue phai la so duong. yeu cau nhap lai!");
                        }
                    }catch (NumberFormatException e){
                        System.out.println("chi phi thue phai la so duong. yeu cau nhap lai!");
                    }
                }while (!check);
                check = false;
                do {
                    try {
                        System.out.print("nhap so luong nguoi toi da: ");
                        villa.setSoLuongNguoiToiDa(scanner.next());
                        if (Integer.parseInt(villa.getSoLuongNguoiToiDa()) < 20 &
                                Integer.parseInt(villa.getSoLuongNguoiToiDa()) > 0){
                            check = true;
                        }else if (Integer.parseInt(villa.getSoLuongNguoiToiDa()) > 20 |
                                Integer.parseInt(villa.getSoLuongNguoiToiDa()) < 0){
                            System.out.println("so luong nguoi toi da khong toi 20 nguoi. yeu cau nhap lai!");

                        }
                    }catch (NumberFormatException e){
                        System.out.println("so luong nguoi toi da khong toi 20 nguoi. yeu cau nhap lai!");
                    }
                }while (!check);

                System.out.print("nhap kieu thue: ");
                villa.setKieuThue(scanner.next());
                System.out.print("nhap tieu chuan phong: ");
                villa.setTieuChuanPhong(scanner.next());
                System.out.print("nhap mot so tien nghi khac: ");
                villa.setMoTaTienNghiKhac(scanner.next());
                System.out.print("nhap dien tich ho boi: ");
                villa.setDienTichHoBoi(scanner.next());
                System.out.print("nhap so tang: ");
                villa.setSoTang(scanner.next());
                arr.add(villa);
                addNewServices();
                break;
            } case 2:{
                boolean check = false;
                do {
                    System.out.print("nhap ten dich vu: ");
                    house.setTenDichVu(scanner.next());
                    if (Pattern.matches(regexTenDichVu, house.getTenDichVu())){
                        check = true;
                    }
                    else {
                        System.out.print("khong hop le, vui long nhap lai!");
                    }
                }while (!check);
                check = false;
                do {
                    System.out.print("nhap dien tich su dung: ");
                    house.setDienTichSuDung(scanner.next());
                    if (Double.parseDouble(house.getDienTichSuDung()) > 30){
                        check = true;
                    }else {
                        System.out.print("nhap lai: ");
                    }
                }while (!check);
                System.out.print("nhap chi phi thue: ");
                house.setChiPhiThue(scanner.next());
                System.out.print("nhap so luong nguoi toi da: ");
                house.setSoLuongNguoiToiDa(scanner.next());
                System.out.print("nhap kieu thue: ");
                house.setKieuThue(scanner.next());
                System.out.print("nhập tiêu chuẩn phòng: ");
                house.setTieuChuanPhong(scanner.next());
                System.out.print("nhập mô tả tiện nghi khác: ");
                house.setMoTaTienNghiKhac(scanner.next());
                System.out.print("nhập số tầng: ");
                house.setSoTang(scanner.next());
                arr.add(house);
                addNewServices();
                break;
            } case 3:{
                boolean check = false;
                do {
                    System.out.print("nhap ten dich vu: ");
                    room.setTenDichVu(scanner.next());
                    if (Pattern.matches(regexTenDichVu, room.getTenDichVu())){
                        check = true;
                    }
                    else {
                        System.out.print("khong hop le, vui long nhap lai!");
                    }
                }while (!check);
                check = false;
                do {
                    System.out.print("nhap dien tich su dung: ");
                    room.setDienTichSuDung(scanner.next());
                    if (Double.parseDouble(room.getDienTichSuDung()) > 30){
                        check = true;
                    }else {
                        System.out.print("nhap lai: ");
                    }
                }while (!check);

                System.out.print("nhap chi phi thue: ");
                room.setChiPhiThue(scanner.next());
                System.out.print("nhap so luong nguoi toi da: ");
                room.setSoLuongNguoiToiDa(scanner.next());
                System.out.print("nhap kieu thue: ");
                room.setKieuThue(scanner.next());
                System.out.print("nhập dịch vụ đi kèm: ");
                room.setDichVuDiKem(scanner.next());
                if (services[10] == null ){
                    services[10] = room;
                }
                arr.add(room);
                addNewServices();
                break;


            } case 4:{
                displayMainMenu();
                break;
            }


        }

    }
    //task 3
    public static void showServices(){
        System.out.println("1. Show all Villa \n2. Show all House \n3. Show all Room \n4. Show All Name Villa Not Duplicate" +
                "\n5. Show All Name House Not Duplicate \n6. Show All Name Room Not Duplicate \n7. Back to menu \n8. Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap: ");
        int num2 = scanner.nextInt();
        switch (num2){
            case 1:{
                for (int i = 0; i < arr.size(); i++){
                    if (arr.get(i) instanceof Villa){
                        System.out.println(arr.get(i).getTenDichVu());
                    }
                }
                showServices();
                break;
            } case 2:{
                for (int i = 0; i < arr.size(); i++){
                    if (arr.get(i) instanceof House){
                        System.out.println(arr.get(i).getTenDichVu());
                    }
                }
                showServices();
                break;

            } case 3:{
                for (int i = 0; i < arr.size(); i++){
                    if (arr.get(i) instanceof Room){
                        System.out.println(arr.get(i).getTenDichVu());
                    }
                }
                showServices();
                break;
            }
            case 7:{
                displayMainMenu();
                break;
            }
        }
    }
    //task 8

    public static void main(String[] args) {
        displayMainMenu();

    }
}
