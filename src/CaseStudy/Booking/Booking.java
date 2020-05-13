package CaseStudy.Booking;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static CaseStudy.Controllers.MainController.displayMainMenu;
import static CaseStudy.Controllers.NewServies.*;
import static CaseStudy.Controllers.SaveFile.saveListHouse;
import static CaseStudy.Controllers.SaveFile.saveListVilla;
import static CaseStudy.Customer.AddNewCustomer.check;
import static CaseStudy.Customer.AddNewCustomer.customerList;
import static CaseStudy.Customer.WriteCustomer.saveListCustomer;

public class Booking {
    public static List<String> bookingList;
    public static Scanner scanner = new Scanner(System.in);
    public static void displayMenuBooking() throws IOException, ClassNotFoundException {
        customerList = new ArrayList<>();
        saveListCustomer();
        for (int i = 0; i < customerList.size(); i++){
            System.out.println(i + 1 + ". " + customerList.get(i).showInfor());
        }
        int num;
        do {
            System.out.println("-------------------input----------------------------");
            num = scanner.nextInt();
            if (num < customerList.size() + 1 & num > 0){
                check = true;
            }else {
                System.out.println("Erro");
            }
        }while (!check);
        System.out.println("1. booking Villa " +
                "\n2. booking House" +
                "\n3. booking Room");
        System.out.println("-------------------input----------------------------");
        int chose = scanner.nextInt();
        check = false;
        switch (chose){
            case 1:{
                bookingList = new ArrayList<>();
                int num1;
                villaList = new ArrayList<>();
                saveListVilla();
                for (int i = 0; i < villaList.size(); i++){
                    System.out.println(i + 1 + ". " + villaList.get(i).show());
                }
                do {
                    System.out.println("--------------------------input---------------------");
                    num1 = scanner.nextInt();
                    if (num1 < villaList.size() + 1 & num1 > 0){
                        check = true;
                    }
                    else {
                        System.out.println("erro");
                    }
                }while (!check);
                bookingList.add(customerList.get(num - 1).getNameCustomer() + " booking "+ villaList.get(num1 - 1).show());

                BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("").getAbsoluteFile()+"\\src\\CaseStudy\\Data\\Booking.csv"));
                String string;
                do {
                    string = bufferedReader.readLine();
                    if (string != null){
                        bookingList.add(string);
                    }
                }while (string != null);

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("").getAbsoluteFile()+"\\src\\CaseStudy\\Data\\Booking.csv"));
                for (String str : bookingList){
                    bufferedWriter.write(str);
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
                break;
            } case 2:{
                bookingList = new ArrayList<>();
                int num1;
                houseList = new ArrayList<>();
                saveListHouse();
                for (int i = 0; i < houseList.size(); i++){
                    System.out.println(i + 1 + ". " + houseList.get(i).show());
                }
                do {
                    System.out.println("--------------------------input---------------------");
                    num1 = scanner.nextInt();
                    if (num1 < houseList.size() + 1 & num1 > 0){
                        check = true;
                    }
                    else {
                        System.out.println("erro");
                    }
                }while (!check);
                bookingList.add(customerList.get(num - 1).getNameCustomer() + " booking "+ villaList.get(num1 - 1).show());

                BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("").getAbsoluteFile()+"\\src\\CaseStudy\\Data\\Booking.csv"));
                String string;
                do {
                    string = bufferedReader.readLine();
                    if (string != null){
                        bookingList.add(string);
                    }
                }while (string != null);

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("").getAbsoluteFile()+"\\src\\CaseStudy\\Data\\Booking.csv"));
                for (String str : bookingList){
                    bufferedWriter.write(str);
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
                break;

            } case 3:{
                roomList = new ArrayList<>();
                int num1;
                roomList = new ArrayList<>();
                saveListHouse();
                for (int i = 0; i < roomList.size(); i++){
                    System.out.println(i + 1 + ". " + roomList.get(i).show());
                }
                do {
                    System.out.println("--------------------------input---------------------");
                    num1 = scanner.nextInt();
                    if (num1 < roomList.size() + 1 & num1 > 0){
                        check = true;
                    }
                    else {
                        System.out.println("erro");
                    }
                }while (!check);
                bookingList.add(customerList.get(num - 1).getNameCustomer() + " booking "+ roomList.get(num1 - 1).show());

                BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("").getAbsoluteFile()+"\\src\\CaseStudy\\Data\\Booking.csv"));
                String string;
                do {
                    string = bufferedReader.readLine();
                    if (string != null){
                        bookingList.add(string);
                    }
                }while (string != null);

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("").getAbsoluteFile()+"\\src\\CaseStudy\\Data\\Booking.csv"));
                for (String str : bookingList){
                    bufferedWriter.write(str);
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
                break;
            }
        }
        displayMainMenu();

    }
}
