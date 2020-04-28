package CaseStudy.Task2;

import CaseStudy.Task1.House;
import CaseStudy.Task1.Room;
import CaseStudy.Task1.Services;
import CaseStudy.Task1.Villa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
;
        switch (num1) {
            case 1: {
                inputVilla(villa, scanner, regexTenDichVu);
                break;
            }
            case 2: {
                inputHouse(house, scanner, regexTenDichVu);
                break;
            }
            case 3: {
                inPutRoom(room, scanner, regexTenDichVu);
                break;

            }
            case 4: {
                displayMainMenu();
                break;
            }
        }


    }
    static boolean check;
    private static void inputVilla(Villa villa, Scanner scanner, String regexTenDichVu) throws IOException {
        BufferedWriter bufferedWriterVilla = new BufferedWriter(new FileWriter("D:\\Module2\\VoNgocQuan_Module2\\src\\CaseStudy\\Task2\\Villa.csv"));
        boolean check = inputServiceName(villa, scanner, regexTenDichVu);
        check = inputAreaUsed(villa, scanner, check);
        check = inputRentalCosts(villa,scanner,  check);
        check = inputMaximumPeople(villa, scanner, check);
        check = inputRentalType(villa, scanner, regexTenDichVu, check);
        check = inputRoomStandard(villa, scanner, regexTenDichVu, check);
        System.out.print("nhap mot so tien nghi khac: ");
        villa.setOtherFacilities(scanner.next());
        check = inputPoolArea(villa, scanner, check);
        inputNumberOfFloors(villa, scanner, check);
        arr.add(villa);
        for (Services services : arr) {
            if (services instanceof Villa) {
                bufferedWriterVilla.write(services.showInfor());
                bufferedWriterVilla.newLine();
            }
        }
        bufferedWriterVilla.close();

        addNewServices();
    }

    private static void inputHouse(House house, Scanner scanner, String regexTenDichVu) throws IOException {
        BufferedWriter bufferedWriterHouse = new BufferedWriter(new FileWriter("D:\\Module2\\VoNgocQuan_Module2\\src\\CaseStudy\\Task2\\House.csv"));

        check = inputServiceName(house, scanner, regexTenDichVu);
        check = inputAreaUsed(house, scanner, check);
        check = inputRentalCosts(house,scanner,  check);
        check = inputMaximumPeople(house, scanner, check);
        check = inputRentalType(house, scanner, regexTenDichVu, check);


        check = inputRoomStandard(house, scanner, regexTenDichVu, check);
        System.out.print("nhập mô tả tiện nghi khác: ");
        house.setMoTaTienNghiKhac(scanner.next());
        inputNumberOfFloors(house, scanner, check);
        arr.add(house);
        for (Services services : arr){
            if (services instanceof  House){
                bufferedWriterHouse.write(services.showInfor());
                bufferedWriterHouse.newLine();
            }
        }
        bufferedWriterHouse.close();

        addNewServices();
    }

    private static void inPutRoom(Room room, Scanner scanner, String regexTenDichVu) throws IOException {
        BufferedWriter bufferedWriterRoom = new BufferedWriter(new FileWriter("D:\\Module2\\VoNgocQuan_Module2\\src\\CaseStudy\\Task2\\Room.csv"));
        boolean check;
        check = inputServiceName(room, scanner, regexTenDichVu);
        check = inputAreaUsed(room, scanner, check);
        check = inputRentalCosts(room,scanner,  check);
        check = inputMaximumPeople(room, scanner, check);
        check = inputRentalType(room, scanner, regexTenDichVu, check);
        inputAccopaniedService(room, scanner, check);

        arr.add(room);
        for (Services services : arr){
            if (services instanceof Room){
                bufferedWriterRoom.write(services.showInfor());
                bufferedWriterRoom.newLine();
            }
        }
        bufferedWriterRoom.close();

        addNewServices();
    }

    private static void inputAccopaniedService(Room room, Scanner scanner, boolean check) {
        String[] str = {"massage", "karaoke", "food", "drink", "car"};
        do {
            System.out.print("nhập dịch vụ đi kèm: ");
            room.setAccompaniedService(scanner.nextLine());
            if (room.getAccompaniedService().equals("massage") | room.getAccompaniedService().equals("karaoke")
                    | room.getAccompaniedService().equals("food") | room.getAccompaniedService().equals("drink") | room.getAccompaniedService().equals("car")) {
                check = true;
            } else {
                System.out.println(room.getAccompaniedService());
                System.out.println("dich vu di kem phai la massage, karaoke, food, drink, car. Yeu cau nhap lai!");
            }
        } while (!check);
    }



    private static void inputNumberOfFloors(House house, Scanner scanner, boolean check) {
        do {
            try {
                System.out.print("nhap so tang: ");
                house.setNumberOfFloors(scanner.next());
                if (Integer.parseInt(house.getNumberOfFloors()) > 0) {
                    check = true;
                } else if (Integer.parseInt(house.getNumberOfFloors()) <= 0) {
                    System.out.println("so tang phai la so nguyen duong. Vui long nhap lai!");
                }

            } catch (NumberFormatException e) {
                System.out.println("so tang phai la so nguyen duong. Vui long nhap lai!");
            }
        } while (!check);
    }

    private static boolean inputRoomStandard(House house, Scanner scanner, String regexTenDichVu, boolean check) {
        do {
            System.out.print("nhap tieu chuan phong: ");
            house.setRoomStandard(scanner.next());
            if (Pattern.matches(regexTenDichVu, house.getRoomStandard())) {
                check = true;
            } else {
                System.out.print("chu cai dau phai in hoa. Vui long nhap lai! ");
            }
        } while (!check);
        check = false;
        return check;
    }



    private static void inputNumberOfFloors(Villa villa, Scanner scanner, boolean check) {
        do {
            try {
                System.out.print("nhap so tang: ");
                villa.setNumberOfFloors(scanner.next());
                if (Integer.parseInt(villa.getNumberOfFloors()) > 0) {
                    check = true;
                } else if (Integer.parseInt(villa.getNumberOfFloors()) <= 0) {
                    System.out.println("so tang phai la so nguyen duong. Vui long nhap lai!");
                }

            } catch (NumberFormatException e) {
                System.out.println("so tang phai la so nguyen duong. Vui long nhap lai!");
            }
        } while (!check);
    }

    private static boolean inputPoolArea(Villa villa, Scanner scanner, boolean check) {
        do {
            try {
                System.out.print("nhap dien tich ho boi: ");
                villa.setPoolArea(scanner.next());
                if (Double.parseDouble(villa.getPoolArea()) > 30) {
                    check = true;
                } else if (Double.parseDouble(villa.getPoolArea()) <= 30) {
                    System.out.println("dien tich ho boi phai la so thuc lon hon 30. Yeu cau nhap lai!");
                }
            } catch (NumberFormatException e) {
                System.out.println("dien tich ho boi phai la so thuc lon hon 30. Yeu cau nhap lai!");
            }
        } while (!check);
        check = false;
        return check;
    }

    private static boolean inputRoomStandard(Villa villa, Scanner scanner, String regexTenDichVu, boolean check) {
        do {
            System.out.print("nhap tieu chuan phong: ");
            villa.setRoomStandard(scanner.next());
            if (Pattern.matches(regexTenDichVu, villa.getRoomStandard())) {
                check = true;
            } else {
                System.out.print("chu cai dau phai in hoa. Vui long nhap lai! ");
            }
        } while (!check);
        check = false;
        return check;
    }

    private static boolean inputRentalType(Services services, Scanner scanner, String regexTenDichVu, boolean check) {
        do {
            System.out.print("nhap kieu thue: ");
            services.setRentalType(scanner.next());
            if (Pattern.matches(regexTenDichVu, services.getRentalType())) {
                check = true;
            } else {
                System.out.print("chu cai dau phai in hoa. Vui long nhap lai! ");
            }
        } while (!check);
        check = false;
        return check;
    }

    private static boolean inputMaximumPeople(Services services, Scanner scanner, boolean check) {
        do {
            try {
                System.out.print("nhap so luong nguoi toi da: ");
                services.setMaximumPeople(scanner.next());
                if (Integer.parseInt(services.getMaximumPeople()) < 20 &
                        Integer.parseInt(services.getMaximumPeople()) > 0) {
                    check = true;
                } else if (Integer.parseInt(services.getMaximumPeople()) > 20 |
                        Integer.parseInt(services.getMaximumPeople()) < 0) {
                    System.out.println("so luong nguoi toi da khong toi 20 nguoi. yeu cau nhap lai!");

                }
            } catch (NumberFormatException e) {
                System.out.println("so luong nguoi toi da khong toi 20 nguoi. yeu cau nhap lai!");
            }
        } while (!check);
        check = false;
        return check;
    }

    private static boolean inputRentalCosts(Services services, Scanner scanner, boolean check) {
        do {
            try {
                System.out.print("nhap chi phi thue: ");
                services.setRentalCosts(scanner.next());
                if (Double.parseDouble(services.getRentalCosts()) > 0) {
                    check = true;
                } else if (Double.parseDouble(services.getRentalCosts()) <= 0) {
                    System.out.println("chi phi thue phai la so duong. yeu cau nhap lai!");
                }
            } catch (NumberFormatException e) {
                System.out.println("chi phi thue phai la so duong. yeu cau nhap lai!");
            }
        } while (!check);
        check = false;
        return check;
    }

    private static boolean inputAreaUsed(Services services, Scanner scanner, boolean check) {
        do {
            try {
                System.out.print("nhap dien tich su dung: ");
                services.setAreaUsed(scanner.next());
                if (Double.parseDouble(services.getAreaUsed()) > 30) {
                    check = true;
                } else if (Double.parseDouble(services.getAreaUsed()) <= 30) {
                    System.out.println("dien tich su dung phai la so thuc lon hon 30. Yeu cau nhap lai!");
                }
            } catch (NumberFormatException e) {
                System.out.println("dien tich su dung phai la so thuc lon hon 30. Yeu cau nhap lai!");
            }
        } while (!check);
        check = false;
        return check;
    }

    private static boolean inputServiceName(Services services, Scanner scanner, String regexTenDichVu) {
        boolean check = false;
        do {
            System.out.print("nhap ten dich vu: ");
            services.setserviceName(scanner.next());
            if (Pattern.matches(regexTenDichVu, services.getserviceName())) {
                check = true;
            } else {
                System.out.print("chu cai dau phai in hoa. Vui long nhap lai! ");
            }
        } while (!check);
        check = false;
        return check;
    }



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
