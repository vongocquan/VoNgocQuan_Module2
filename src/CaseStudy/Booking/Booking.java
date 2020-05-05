package CaseStudy.Booking;




import CaseStudy.Task1.House;
import CaseStudy.Task1.Room;
import CaseStudy.Task1.Services;
import CaseStudy.Task1.Villa;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static CaseStudy.Controllers.MainController.*;
import static CaseStudy.Task5.Customer.listCustomer;
import static CaseStudy.Task5.Customer.scanner;


public class Booking  {

    public static List<String> bookingList = new ArrayList<>();
    public static void displayMenuBooking() throws IOException, ParseException {
        for (int i = 0; i < listCustomer.size(); i++){
            System.out.println(i+1 + ". " + listCustomer.get(i).showInfor());
        }
        System.out.print("input: ");
        int numCustomer = scanner.nextInt();
        System.out.println("1. Booking Villa" +
                "\n2. Booking House" +
                "\n3. Booking Room");
        Scanner scanner = new Scanner(System.in);
        System.out.print("input: ");
        int numBooking = scanner.nextInt();
        List<Villa> listVilla = new ArrayList<>();
        List<House> listHouse = new ArrayList<>();
        List<Room> listRoom = new ArrayList<>();
        switch (numBooking) {
            case 1: {

                for (Services services : listServices){
                    if (services instanceof Villa ){
                        listVilla.add((Villa) services);
                    }
                }
                for (int i = 0; i < listVilla.size(); i++){
                    System.out.println(i + 1 + ". " + listVilla.get(i).showInfor());
                }
                System.out.print("input booking: ");
                int num = scanner.nextInt();
                bookingList.add(listCustomer.get(numCustomer-1).showInfor() + listVilla.get(num-1).showInfor());
                break;
            } case 2:{
                for (Services services : listServices){
                    if (services instanceof House) {
                        listHouse.add((House) services);
                    }
                }
                for (int i = 0; i < listHouse.size(); i++){
                    System.out.println(i + 1 + ". " + listHouse.get(i).showInfor());
                }
                System.out.print("input booking: ");
                int num = scanner.nextInt();
                bookingList.add(listCustomer.get(numCustomer).showInfor() + listHouse.get(num).showInfor());
                break;

            } case 3:{
                for (Services services : listServices) {
                    if (services instanceof Room) {
                        listRoom.add((Room) services);
                    }
                }
                for (int i = 0; i < listRoom.size(); i++){
                    System.out.println(i + 1 + ". " + listRoom.get(i).showInfor());
                }
                System.out.print("input booking: ");
                int num = scanner.nextInt();
                bookingList.add(listCustomer.get(numCustomer).showInfor() + listRoom.get(num).showInfor());
                break;
            }


        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("").getAbsoluteFile() + "\\src\\CaseStudy\\Data\\Booking.csv"));
        for (int i = 0; i < bookingList.size(); i++){
            bufferedWriter.write(i + 1 + ". " + bookingList.get(i));
            bufferedWriter.newLine();
        }bufferedWriter.close();
        displayMainMenu();

    }
    public static void main(String[] args) throws IOException, ParseException {
        displayMenuBooking();
    }


}
