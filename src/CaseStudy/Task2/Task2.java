package CaseStudy.Task2;

import CaseStudy.Task1.House;
import CaseStudy.Task1.Room;
import CaseStudy.Task1.Services;
import CaseStudy.Task1.Villa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.management.BufferPoolMXBean;
import java.util.ArrayList;


import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task2 {


    //task2 - task4
    public static void displayMainMenu() throws IOException {
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

    public static List<Services> arr = new ArrayList<>();






    public static void addNewServices() throws IOException {
        Villa villa = new Villa();
        House house = new House();
        Room room = new Room();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add New Villa \n2. Add New House \n3. Add New Room \n4. Back to menu \n5. Exit");
        System.out.print("nhập: ");

        int num1 = scanner.nextInt();
        String regexMaDichVu = "^[S][V][V][L][-][0-9]{4}$^";
        String regexTenDichVu = "^[A-Z]([a-z]+)$";
        switch (num1) {
            case 1: {
                File fileVilla = new File("D:\\Module2\\VoNgocQuan_Module2\\src\\CaseStudy\\Task2\\Villa.csv");
                fileVilla.delete();
                BufferedWriter bufferedWriterVilla = new BufferedWriter(new FileWriter("D:\\Module2\\VoNgocQuan_Module2\\src\\CaseStudy\\Task2\\Villa.csv"));

                boolean check = false;
                do {
                    System.out.print("nhap ten dich vu: ");
                    villa.setTenDichVu(scanner.next());
                    if (Pattern.matches(regexTenDichVu, villa.getTenDichVu())) {
                        check = true;
                    } else {
                        System.out.print("chu cai dau phai in hoa. Vui long nhap lai! ");
                    }
                } while (!check);
                check = false;
                do {
                    try {
                        System.out.print("nhap dien tich su dung: ");
                        villa.setDienTichSuDung(scanner.next());
                        if (Double.parseDouble(villa.getDienTichSuDung()) > 30) {
                            check = true;
                        } else if (Double.parseDouble(villa.getDienTichSuDung()) <= 30) {
                            System.out.println("dien tich su dung phai la so thuc lon hon 30. Yeu cau nhap lai!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("dien tich su dung phai la so thuc lon hon 30. Yeu cau nhap lai!");
                    }
                } while (!check);
                check = false;
                do {
                    try {
                        System.out.print("nhap chi phi thue: ");
                        villa.setChiPhiThue(scanner.next());
                        if (Double.parseDouble(villa.getChiPhiThue()) > 0) {
                            check = true;
                        } else if (Double.parseDouble(villa.getChiPhiThue()) <= 0) {
                            System.out.println("chi phi thue phai la so duong. yeu cau nhap lai!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("chi phi thue phai la so duong. yeu cau nhap lai!");
                    }
                } while (!check);
                check = false;
                do {
                    try {
                        System.out.print("nhap so luong nguoi toi da: ");
                        villa.setSoLuongNguoiToiDa(scanner.next());
                        if (Integer.parseInt(villa.getSoLuongNguoiToiDa()) < 20 &
                                Integer.parseInt(villa.getSoLuongNguoiToiDa()) > 0) {
                            check = true;
                        } else if (Integer.parseInt(villa.getSoLuongNguoiToiDa()) > 20 |
                                Integer.parseInt(villa.getSoLuongNguoiToiDa()) < 0) {
                            System.out.println("so luong nguoi toi da khong toi 20 nguoi. yeu cau nhap lai!");

                        }
                    } catch (NumberFormatException e) {
                        System.out.println("so luong nguoi toi da khong toi 20 nguoi. yeu cau nhap lai!");
                    }
                } while (!check);
                check = false;
                do {
                    System.out.print("nhap kieu thue: ");
                    villa.setKieuThue(scanner.next());
                    if (Pattern.matches(regexTenDichVu, villa.getKieuThue())) {
                        check = true;
                    } else {
                        System.out.print("chu cai dau phai in hoa. Vui long nhap lai! ");
                    }
                } while (!check);
                check = false;
                do {
                    System.out.print("nhap tieu chuan phong: ");
                    villa.setTieuChuanPhong(scanner.next());
                    if (Pattern.matches(regexTenDichVu, villa.getTieuChuanPhong())) {
                        check = true;
                    } else {
                        System.out.print("chu cai dau phai in hoa. Vui long nhap lai! ");
                    }
                } while (!check);
                check = false;
                System.out.print("nhap mot so tien nghi khac: ");
                villa.setMoTaTienNghiKhac(scanner.next());
                do {
                    try {
                        System.out.print("nhap dien tich ho boi: ");
                        villa.setDienTichHoBoi(scanner.next());
                        if (Double.parseDouble(villa.getDienTichHoBoi()) > 30) {
                            check = true;
                        } else if (Double.parseDouble(villa.getDienTichHoBoi()) <= 30) {
                            System.out.println("dien tich ho boi phai la so thuc lon hon 30. Yeu cau nhap lai!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("dien tich ho boi phai la so thuc lon hon 30. Yeu cau nhap lai!");
                    }
                } while (!check);
                check = false;
                do {
                    try {
                        System.out.print("nhap so tang: ");
                        villa.setSoTang(scanner.next());
                        if (Integer.parseInt(villa.getSoTang()) > 0) {
                            check = true;
                        } else if (Integer.parseInt(villa.getSoTang()) <= 0) {
                            System.out.println("so tang phai la so nguyen duong. Vui long nhap lai!");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("so tang phai la so nguyen duong. Vui long nhap lai!");
                    }
                } while (!check);

                arr.add(villa);
                for (Services services : arr) {
                    if (services instanceof Villa) {
                        bufferedWriterVilla.write(services.showInfor());
                        bufferedWriterVilla.newLine();
                    }
                }
                bufferedWriterVilla.close();

                addNewServices();
                break;
            }
            case 2: {
                File fileHouse = new File("D:\\Module2\\VoNgocQuan_Module2\\src\\CaseStudy\\Task2\\House.csv");
                fileHouse.delete();
                BufferedWriter bufferedWriterHouse = new BufferedWriter(new FileWriter("D:\\Module2\\VoNgocQuan_Module2\\src\\CaseStudy\\Task2\\House.csv"));
                boolean check = false;
                do {
                    System.out.print("nhap ten dich vu: ");
                    house.setTenDichVu(scanner.next());
                    if (Pattern.matches(regexTenDichVu, house.getTenDichVu())) {
                        check = true;
                    } else {
                        System.out.print("khong hop le, vui long nhap lai!");
                    }
                } while (!check);
                check = false;
                do {
                    try {
                        System.out.print("nhap dien tich su dung: ");
                        house.setDienTichSuDung(scanner.next());
                        if (Double.parseDouble(house.getDienTichSuDung()) > 30) {
                            check = true;
                        } else if (Double.parseDouble(house.getDienTichSuDung()) <= 30)
                            System.out.println("dien tich su dung phai la so thuc lon hon 30. Yeu cau nhap lai!");
                    } catch (NumberFormatException e) {
                        System.out.println("dien tich su dung phai la so thuc lon hon 30. Yeu cau nhap lai!");
                    }
                } while (!check);
                check = false;
                do {
                    try {
                        System.out.print("nhap chi phi thue: ");
                        house.setChiPhiThue(scanner.next());
                        if (Double.parseDouble(house.getChiPhiThue()) > 0) {
                            check = true;
                        } else if (Double.parseDouble(house.getChiPhiThue()) <= 0) {
                            System.out.println("chi phi thue phai la so duong. yeu cau nhap lai!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("chi phi thue phai la so duong. yeu cau nhap lai!");
                    }
                } while (!check);
                check = false;
                do {
                    try {
                        System.out.print("nhap so luong nguoi toi da: ");
                        house.setSoLuongNguoiToiDa(scanner.next());
                        if (Integer.parseInt(house.getSoLuongNguoiToiDa()) < 20 &
                                Integer.parseInt(house.getSoLuongNguoiToiDa()) > 0) {
                            check = true;
                        } else if (Integer.parseInt(house.getSoLuongNguoiToiDa()) > 20 |
                                Integer.parseInt(house.getSoLuongNguoiToiDa()) < 0) {
                            System.out.println("so luong nguoi toi da khong toi 20 nguoi. yeu cau nhap lai!");

                        }
                    } catch (NumberFormatException e) {
                        System.out.println("so luong nguoi toi da khong toi 20 nguoi. yeu cau nhap lai!");
                    }
                } while (!check);
                check = false;
                do {
                    System.out.print("nhap kieu thue: ");
                    house.setKieuThue(scanner.next());
                    if (Pattern.matches(regexTenDichVu, house.getKieuThue())) {
                        check = true;
                    } else {
                        System.out.print("chu cai dau phai in hoa. Vui long nhap lai! ");
                    }
                } while (!check);
                check = false;
                do {
                    System.out.print("nhap tieu chuan phong: ");
                    house.setTieuChuanPhong(scanner.next());
                    if (Pattern.matches(regexTenDichVu, house.getTieuChuanPhong())) {
                        check = true;
                    } else {
                        System.out.print("chu cai dau phai in hoa. Vui long nhap lai! ");
                    }
                } while (!check);
                check = false;
                System.out.print("nhập mô tả tiện nghi khác: ");
                house.setMoTaTienNghiKhac(scanner.next());
                do {
                    try {
                        System.out.print("nhap so tang: ");
                        house.setSoTang(scanner.next());
                        if (Integer.parseInt(house.getSoTang()) > 0) {
                            check = true;
                        } else if (Integer.parseInt(house.getSoTang()) <= 0) {
                            System.out.println("so tang phai la so nguyen duong. Vui long nhap lai!");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("so tang phai la so nguyen duong. Vui long nhap lai!");
                    }
                } while (!check);
                arr.add(house);
                for (Services services : arr){
                    if (services instanceof  House){
                        bufferedWriterHouse.write(services.showInfor());
                        bufferedWriterHouse.newLine();
                    }
                }bufferedWriterHouse.close();

                addNewServices();
                break;
            }
            case 3: {
                File fileRoom = new File("D:\\Module2\\VoNgocQuan_Module2\\src\\CaseStudy\\Task2\\Room.csv");
                fileRoom.delete();
                BufferedWriter bufferedWriterRoom = new BufferedWriter(new FileWriter("D:\\Module2\\VoNgocQuan_Module2\\src\\CaseStudy\\Task2\\Room.csv"));

                boolean check = false;
                do {
                    System.out.print("nhap ten dich vu: ");
                    room.setTenDichVu(scanner.next());
                    if (Pattern.matches(regexTenDichVu, room.getTenDichVu())) {
                        check = true;
                    } else {
                        System.out.print("chu cai dau phai in hoa. Vui long nhap lai! ");
                    }
                } while (!check);
                check = false;
                do {
                    try {
                        System.out.print("nhap dien tich su dung: ");
                        room.setDienTichSuDung(scanner.next());
                        if (Double.parseDouble(room.getDienTichSuDung()) > 30) {
                            check = true;
                        } else if (Double.parseDouble(room.getDienTichSuDung()) <= 30) {
                            System.out.println("dien tich su dung phai la so thuc lon hon 30. Yeu cau nhap lai!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("dien tich su dung phai la so thuc lon hon 30. Yeu cau nhap lai!");
                    }
                } while (!check);
                check = false;
                do {
                    try {
                        System.out.print("nhap chi phi thue: ");
                        room.setChiPhiThue(scanner.next());
                        if (Double.parseDouble(room.getChiPhiThue()) > 0) {
                            check = true;
                        } else if (Double.parseDouble(room.getChiPhiThue()) <= 0) {
                            System.out.println("chi phi thue phai la so duong. yeu cau nhap lai!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("chi phi thue phai la so duong. yeu cau nhap lai!");
                    }
                } while (!check);
                check = false;
                do {
                    try {
                        System.out.print("nhap so luong nguoi toi da: ");
                        room.setSoLuongNguoiToiDa(scanner.next());
                        if (Integer.parseInt(room.getSoLuongNguoiToiDa()) < 20 &
                                Integer.parseInt(room.getSoLuongNguoiToiDa()) > 0) {
                            check = true;
                        } else if (Integer.parseInt(room.getSoLuongNguoiToiDa()) > 20 |
                                Integer.parseInt(room.getSoLuongNguoiToiDa()) < 0) {
                            System.out.println("so luong nguoi toi da khong toi 20 nguoi. yeu cau nhap lai!");

                        }
                    } catch (NumberFormatException e) {
                        System.out.println("so luong nguoi toi da khong toi 20 nguoi. yeu cau nhap lai!");
                    }
                } while (!check);
                check = false;
                do {
                    System.out.print("nhap kieu thue: ");
                    room.setKieuThue(scanner.next());
                    if (Pattern.matches(regexTenDichVu, room.getKieuThue())) {
                        check = true;
                    } else {
                        System.out.print("chu cai dau phai in hoa. Vui long nhap lai! ");
                    }
                } while (!check);
                check = false;
                String[] str = {"massage", "karaoke", "food", "drink", "car"};
                do {
                    System.out.print("nhập dịch vụ đi kèm: ");
                    room.setDichVuDiKem(scanner.nextLine());
                    if (room.getDichVuDiKem().equals("massage") | room.getDichVuDiKem().equals("karaoke")
                            | room.getDichVuDiKem().equals("food") | room.getDichVuDiKem().equals("drink") | room.getDichVuDiKem().equals("car")) {
                        check = true;
                    } else {
                        System.out.println(room.getDichVuDiKem());
                        System.out.println("dich vu di kem phai la massage, karaoke, food, drink, car. Yeu cau nhap lai!");
                    }
                } while (!check);

                arr.add(room);
                for (Services services : arr){
                    if (services instanceof Room){
                        bufferedWriterRoom.write(services.showInfor());
                        bufferedWriterRoom.newLine();
                    }
                }
                bufferedWriterRoom.close();

                addNewServices();
                break;

            }
            case 4: {
                displayMainMenu();
                break;
            }
        }


    }
    //task 3
    public static void showServices() throws IOException {
        System.out.println("1. Show all Villa \n2. Show all House \n3. Show all Room \n4. Show All Name Villa Not Duplicate" +
                "\n5. Show All Name House Not Duplicate \n6. Show All Name Room Not Duplicate \n7. Back to menu \n8. Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap: ");
        int num2 = scanner.nextInt();

        switch (num2){
            case 1:{
                for (Services services : arr) {
                    if (services instanceof Villa) {
                        System.out.println(services.showInfor());
                    }
                }
                showServices();
                break;
            } case 2:{
                for (Services services : arr) {
                    if (services instanceof House) {
                        System.out.println(services.showInfor());
                    }
                }
                showServices();
                break;

            } case 3:{
                for (Services services : arr) {
                    if (services instanceof Room) {
                        System.out.println(services.showInfor());
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

    public static void main(String[] args) throws IOException {
        displayMainMenu();


    }
}
