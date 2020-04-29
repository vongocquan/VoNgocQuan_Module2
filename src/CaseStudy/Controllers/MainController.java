package CaseStudy.Controllers;

import CaseStudy.Task1.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

public class MainController {

    public static void main(String[] args) throws IOException {
        displayMainMenu();
    }
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() throws IOException {
        System.out.println("1. Add New Services");
        System.out.println("2. Show Services");
        System.out.println("3. Add New Customer");
        System.out.println("4. Show Information of Customer");
        System.out.println("5. Add New Booking");
        System.out.println("6. Show Information of Employee");
        System.out.println("7. Exit");

        System.out.print("nhap: ");
        int num = scanner.nextInt();
        switch (num){
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

    public static void addNewServices() throws IOException {

        System.out.println("1. Add New Villa \n2. Add New House \n3. Add New Room \n4. Back to menu \n5. Exit");
        System.out.print("nhập: ");
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
            }
        }
    }

    public static void showServices() throws IOException {
        System.out.println("1. Show all Villa \n2. Show all House \n3. Show all Room \n4. Show All Name Villa Not Duplicate" +
                "\n5. Show All Name House Not Duplicate \n6. Show All Name Room Not Duplicate \n7. Back to menu \n8. Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap: ");
        int num = scanner.nextInt();
        switch (num) {
            case 1: {
                for (Services services : arr) {
                    if (services instanceof Villa) {
                        System.out.println(services.showInfor());
                    }
                }
                showServices();
                break;
            }
            case 2: {
                for (Services services : arr) {
                    if (services instanceof House) {
                        System.out.println(services.showInfor());
                    }
                }
                showServices();
                break;
            }
            case 3: {
                for (Services services : arr) {
                    if (services instanceof Room) {
                        System.out.println(services.showInfor());
                    }
                }
                showServices();
                break;
            }
            case 4: {
                TreeSet<String> treeSet = new TreeSet<>(new HashSet<>());
                for (Services services : arr) {
                    if (services instanceof Villa) {
                        treeSet.add(services.showInfor());

                    }
                }
                System.out.println(treeSet);
                break;
            } case 5:{
                TreeSet<String> treeSet = new TreeSet<>(new HashSet<>());
                for (Services services : arr) {
                    if (services instanceof House) {
                        treeSet.add(services.showInfor());

                    }
                }
                System.out.println(treeSet);
                break;
            } case 6:{
                TreeSet<String> treeSet = new TreeSet<>(new HashSet<>());
                for (Services services : arr) {
                    if (services instanceof Room) {
                        treeSet.add(services.showInfor());

                    }
                }
                System.out.println(treeSet);
                break;
            } case 7:{
                displayMainMenu();
                break;
            }

        }
    }

    static List<Services> arr = new ArrayList<>();
    static String regexServiceName = "^[A-Z][a-z]+$";
    static boolean check = false;
    public static void addNewVilla() throws IOException {
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

        arr.add(villa);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\Module2\\VoNgocQuan_Module2\\src\\CaseStudy\\Data\\Villa.csv"));
        for (Services services : arr){
            if (services instanceof Villa){
                bufferedWriter.write(services.showInfor());
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.close();
        addNewServices();
    }



    public static void addNewHouse() throws IOException {
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
        arr.add(house);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\Module2\\VoNgocQuan_Module2\\src\\CaseStudy\\Data\\House.csv"));
        for (Services services : arr){
            if (services instanceof House){
                bufferedWriter.write(services.showInfor());
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.close();
        addNewServices();

    }
    public static void addNewRoom() throws IOException {
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
        arr.add(room);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\Module2\\VoNgocQuan_Module2\\src\\CaseStudy\\Data\\Room.csv"));
        for (Services services : arr){
            if (services instanceof Room){
                bufferedWriter.write(services.showInfor());
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.close();
        addNewServices();
    }




    private static void inputNameAccompaniedService(AccompaniedService accompaniedService) {
        System.out.print("accompanied services: ");
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

    private static void inputNumberofFloors(House house) {
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

    private static void inputRoomStandard(House house) {
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




    private static void inputNumberOfFloors(Villa villa) {
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

    private static void inputPoolArea(Villa villa) {
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

    private static void inputMaximumPeople(Services services) {
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

    private static void inputNameService(Services services) {
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

    private static void inputServiceCode(Services services) {
        String regexServiceCode;
        if (services instanceof Villa){
            regexServiceCode = "^[S][V][V][L][-][0-9]{4}$";
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
            regexServiceCode = "^[S][V][H][O][-][0-9]{4}$";
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
            regexServiceCode = "^[S][V][R][O][-][0-9]{4}$";
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

}
