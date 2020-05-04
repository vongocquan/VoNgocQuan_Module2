package CaseStudy.Booking;

import CaseStudy.Controllers.MainController;
import CaseStudy.Task1.Villa;
import CaseStudy.Task5.Customer;
import com.sun.org.apache.xpath.internal.functions.FuncGenerateId;
import netscape.security.UserTarget;

import javax.swing.*;
import java.io.*;
import java.sql.ClientInfoStatus;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static CaseStudy.Controllers.MainController.*;
import static CaseStudy.Task5.Customer.addNewCustomer;
import static CaseStudy.Task5.Customer.inputCustomer;

public class Booking extends Customer {

    static List<String> bookingList = new ArrayList<>();
    public static void displayMenuBooking() throws IOException {
        inputCustomer();

        System.out.println("1. Booking Villa" +
                "\n2. Booking House" +
                "\n3. Booking Room");
        Scanner scanner = new Scanner(System.in);
        System.out.print("input: ");
        int num = scanner.nextInt();
        switch (num){

            case 1: {
                int number = 1;
                BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("").getAbsoluteFile() + "\\src\\CaseStudy\\Data\\Villa.csv"));
                String readeVilla = "";
                do {
                    readeVilla = bufferedReader.readLine();
                    if (readeVilla != null){
                        System.out.print(number++ + ". ");
                        System.out.println(readeVilla);
                    }
                }while (readeVilla != null);
                System.out.print("input: ");
                int input = scanner.nextInt();
                BufferedReader bufferedReader1 = new BufferedReader(new FileReader(new File("").getAbsoluteFile() + "\\src\\CaseStudy\\Data\\Villa.csv"));
                String booking ="";
                for (int i = 0; i < input; i++){
                    booking = bufferedReader1.readLine();

                }
                bookingList.add(booking);
                break;

            } case 2:{
                int number = 1;
                BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("").getAbsoluteFile() + "\\src\\CaseStudy\\Data\\House.csv"));
                String readeHouse = "";
                do {
                    readeHouse = bufferedReader.readLine();
                    if (readeHouse != null){
                        System.out.print(number++ + ". ");
                        System.out.println(readeHouse);
                    }
                }while (readeHouse != null);
                System.out.print("input: ");
                int input = scanner.nextInt();
                BufferedReader bufferedReader1 = new BufferedReader(new FileReader(new File("").getAbsoluteFile() + "\\src\\CaseStudy\\Data\\House.csv"));
                String booking ="";
                for (int i = 0; i < input; i++){
                    booking = bufferedReader1.readLine();

                }
                bookingList.add(booking);
            } case 3:{
                int number = 1;
                BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("").getAbsoluteFile() + "\\src\\CaseStudy\\Data\\House.csv"));
                String readeRoom = "";
                do {
                    readeRoom = bufferedReader.readLine();
                    if (readeRoom != null){
                        System.out.print(number++ + ". ");
                        System.out.println(readeRoom);
                    }
                }while (readeRoom != null);
                System.out.print("input: ");
                int input = scanner.nextInt();
                BufferedReader bufferedReader1 = new BufferedReader(new FileReader(new File("").getAbsoluteFile() + "\\src\\CaseStudy\\Data\\Room.csv"));
                String booking ="";
                for (int i = 0; i < input; i++){
                    booking = bufferedReader1.readLine();

                }
                bookingList.add(booking);
                break;
            }

        }
        BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter(new File("").getAbsoluteFile() + "\\src\\CaseStudy\\Booking\\Booking.csv"));
        for (int i = 0; i < list.size(); i++){
            bufferedWriter1.write(i+1 + ". " + list.get(i).showInfor() + bookingList.get(i));
            bufferedWriter1.newLine();
        }
        bufferedWriter1.close();
        displayMenuBooking();

    }







    public static void main(String[] args) throws IOException {
        displayMenuBooking();
    }


}
