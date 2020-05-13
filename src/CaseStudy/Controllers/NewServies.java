package CaseStudy.Controllers;

import CaseStudy.Task1.*;

import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

import static CaseStudy.Controllers.MainController.displayMainMenu;
import static CaseStudy.Controllers.SaveFile.*;

public class NewServies {

    public static Scanner scanner = new Scanner(System.in);

    public static void addNewServices() throws IOException, ClassNotFoundException {
        System.out.println("1. Add New Villa \n2. Add New House \n3. Add New Room \n4. Back to menu \n5. Exit");
        System.out.println("----------input---------- ");
        int num = scanner.nextInt();
        switch (num){
            case 1:{
                addNewVilla();
                break;
            } case 2:{
                addNewHouse();
                break;
            } case 3:{
                addNewRoom();
                break;
            } case 4: {
                displayMainMenu();
                break;
            } case 5:{
//                displayMenuBooking();
            }
        }

    }


//    nhap Villa---------------------------------------------------------------------
    public static List<Villa> villaList;
    public static void addNewVilla() throws IOException, ClassNotFoundException {
        villaList = new ArrayList<>();
        Villa villa = new Villa();
        inputServiceCode(villa);
        inputNameService(villa);
        inputAreaUsed(villa);
        inputRentalCosts(villa);
        inputMaximumPeople(villa);
        inputRentalType(villa);
        inputRoomStandard(villa);
        System.out.print("input other facilities: ");
        villa.setOtherFacilities(scanner.next());
        inputPoolArea(villa);
        inputNumberOfFloors(villa);
        inputNameAccompaniedService(villa);
        System.out.print("input unit: ");
        villa.setUnit(scanner.next());
        System.out.print("input price: ");
        villa.setPrice(scanner.next());

        villaList.add(villa);
        writeVila();
    }

//    nhap house ---------------------------------------------
    public static List<House> houseList;
    public static void addNewHouse() throws IOException, ClassNotFoundException {
        houseList = new ArrayList<>();
        House house = new House();
        inputServiceCode(house);
        inputNameService(house);
        inputAreaUsed(house);
        inputRentalCosts(house);
        inputMaximumPeople(house);
        inputRentalType(house);
        inputRoomStandard(house);
        System.out.print("input other facilities: ");
        inputNumberofFloors(house);
        inputNameAccompaniedService(house);
        System.out.print("input unit: ");
        house.setUnit(scanner.next());
        System.out.print("input price: ");
        house.setPrice(scanner.next());
        houseList.add(house);
        writeHouse();
    }

//    nhap Room------------------------------------------------------------------------------
    public static List<Room> roomList;
    public static void addNewRoom() throws IOException, ClassNotFoundException {
        roomList = new ArrayList<>();
        Room room = new Room();
        inputServiceCode(room);
        inputNameService(room);
        inputAreaUsed(room);
        inputRentalCosts(room);
        inputMaximumPeople(room);
        inputRentalType(room);
        inputNameAccompaniedService(room);
        System.out.print("input unit: ");
        room.setUnit(scanner.next());
        System.out.print("input price: ");
        room.setPrice(scanner.next());
        System.out.print("input accompanied Service Frre");
        room.setAccompaniedServiceFrre(scanner.next());
        inputNameAccompaniedService(room);
        System.out.print("input unit: ");
        room.setUnit(scanner.next());
        System.out.print("input price: ");
        room.setPrice(scanner.next());
        roomList.add(room);
        writeRoom();
    }

    public static boolean check = false;

    // nhập code service-------------------------------------------

    public static void inputServiceCode(Services services) {
        String regexServiceCode;
        if (services instanceof Villa){
            regexServiceCode = "[S][V][V][L][-][0-9]{4}";
            do {
                System.out.print("input service code: ");
                services.setServiceCode(scanner.next());
                if (Pattern.matches(regexServiceCode, services.getServiceCode())){
                    check = true;
                }else {
                    System.out.println("error. input again!");
                }
            }while (!check);
        }
        else if (services instanceof House){
            regexServiceCode = "[S][V][H][O][-][0-9]{4}";
            do {
                System.out.print("input service code: ");
                services.setServiceCode(scanner.next());
                if (Pattern.matches(regexServiceCode, services.getServiceCode())){
                    check = true;
                }else {
                    System.out.println("error. input again!");
                }
            }while (!check);

        }else {
            regexServiceCode = "[S][V][R][O][-][0-9]{4}";
            do {
                System.out.print("input service code: ");
                services.setServiceCode(scanner.next());
                if (Pattern.matches(regexServiceCode, services.getServiceCode())){
                    check = true;
                }else {
                    System.out.println("error. input again!");
                }
            }while (!check);
        }
        check = false;
    }

    //nhập name service-------------------------------------------------------

    public static String regexServiceName = "[A-Z][a-z]+";
    public static void inputNameService(Services services) {
        do {
            System.out.print("input name service: ");
            services.setserviceName(scanner.next());
            if (Pattern.matches(regexServiceName, services.getserviceName())){
                check = true;
            }else {
                System.out.println("The first word capitalized. input again!");
            }
        }while (!check);
        check = false;

    }

    // nhập Area Used --------------------------------------------------------------
    private static void inputAreaUsed(Services services) {
        do {
            try {
                System.out.print("input area used: ");
                services.setAreaUsed(scanner.next());
                if (Double.parseDouble(services.getAreaUsed()) > 30) {
                    check = true;
                } else {
                    System.out.println("area used > 30. input again!");
                }
            }
            catch(NumberFormatException e){
                System.out.println("area used > 30. input again!");
            }
        }while (!check);
        check = false;
    }
    // nhập Rental Costs--------------------------------------------------
    private static void inputRentalCosts(Services services) {
        do {
            try {
                System.out.print("input rental costs: ");
                services.setRentalCosts(scanner.next());
                if (Double.parseDouble(services.getRentalCosts()) > 0){
                    check = true;
                }else {
                    System.out.println("rental costs > 0. input again!");
                }
            }catch (NumberFormatException e){
                System.out.println("rental costs > 0. input again!");
            }
        }while (!check);
        check = false;
    }
    //nhập Maximum People ---------------------------------------------------
    public static void inputMaximumPeople(Services services) {
        do {
            try {
                System.out.print("input maximum people");
                services.setMaximumPeople(scanner.next());

                if (Integer.parseInt(services.getMaximumPeople()) < 20 & Integer.parseInt(services.getMaximumPeople()) > 0){
                    check = true;
                }else {
                    System.out.println("0 < maximum people < 20. input again! ");
                }
            }catch (NumberFormatException e){
                System.out.println("0 < maximum people < 20. input again! ");
            }

        }while (!check);

        check = false;
    }
    //nhập Rental Type -----------------------------------------------------------
    private static void inputRentalType(Services services) {
        do {
            System.out.print("input rental type: ");
            services.setRentalType(scanner.next());
            if (Pattern.matches(regexServiceName, services.getRentalType())){
                check = true;
            }else {
                System.out.println("The first word capitalized. input again!");
            }
        }while (!check);


        check = false;
    }
    //nhập Room Standard ------------------------------------------------------
    private static void inputRoomStandard(Villa villa) {
        do {
            System.out.print("input room standard: ");
            villa.setRoomStandard(scanner.next());
            if (Pattern.matches(regexServiceName, villa.getRoomStandard())){
                check = true;
            }else {
                System.out.println("The first word capitalized. input again!");
            }
        }while (!check);
        check = false;
    }
    //nhập Pool Area -------------------------------------------------------
    public static void inputPoolArea(Villa villa) {
        do {
            try {
                System.out.print("input pool area: ");
                villa.setPoolArea(scanner.next());
                if (Double.parseDouble(villa.getPoolArea()) > 30) {
                    check = true;
                } else {
                    System.out.println("pool area > 30. input again!");
                }
            }
            catch(NumberFormatException e){
                System.out.println("pool area > 30. input again!");
            }
        }while (!check);
        check = false;
    }
    // nhập Number Of Floors --------------------------------------------------------
    public static void inputNumberOfFloors(Villa villa) {
        do {
            try {
                System.out.print("input number of floors: ");
                villa.setNumberOfFloors(scanner.next());
                if (Integer.parseInt(villa.getNumberOfFloors()) > 0) {
                    check = true;
                } else {
                    System.out.println("number of floors > 0. input again!");
                }
            }
            catch(NumberFormatException e){
                System.out.println("number of floors > 0. input again!");
            }
        }while (!check);
        check = false;
    }

    // nhập AccompaniedService-------------------------------
    private static void inputNameAccompaniedService(AccompaniedService accompaniedService) {
        System.out.println("-----------------accompanied services------------------------");
        do {
            String[] arr = {"massage", "karaoke",  "food", "drink", "car"};
            int cont = 0;

            System.out.print("input Name Accompanied Service: ");
            accompaniedService.setNameAccompaniedService(scanner.next());
            for (String s : arr) {
                if (accompaniedService.getNameAccompaniedService().equals(s)) {
                    cont++;
                    break;
                }
            }
            if (cont == 1){
                check = true;
            }else {
                System.out.println("Name Accompanied Service: massage, karaoke, food, drink, car. input again!");
            }
        }while (!check);
        check = false;
    }

//    nhap room Standard -------------------------------------
    public static void inputRoomStandard(House house) {
        do {
            System.out.print("input room standard: ");
            house.setRoomStandard(scanner.next());
            if (Pattern.matches(regexServiceName, house.getRoomStandard())){
                check = true;
            }else {
                System.out.println("The first word capitalized. input again!");
            }
        }while (!check);
        check = false;
    }
//    nhap Number of Floors ---------------------------------------------------
    public static void inputNumberofFloors(House house) {
        do {
            try {
                System.out.print("input number of floors: ");
                house.setNumberOfFloors(scanner.next());
                if (Integer.parseInt(house.getNumberOfFloors()) > 0) {
                    check = true;
                } else {
                    System.out.println("number of floors > 0. input again!");
                }
            }
            catch(NumberFormatException e){
                System.out.println("number of floors > 0. input again!");
            }
        }while (!check);
        check = false;
    }



}
