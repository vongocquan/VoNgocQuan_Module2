package CaseStudy.BookingMovie4D;

import CaseStudy.Task5.Customer;

import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import static CaseStudy.Controllers.MainController.displayMainMenu;
import static CaseStudy.Task5.Customer.listCustomer;

public class BookingMovie4D {
    static Queue<Customer> bookingTicked = new LinkedList<>();
    static Scanner scanner =new Scanner(System.in);
    public static void menuBooking4D() throws IOException, ParseException {
        System.out.println("1. Booking movie ticked");
        System.out.println("2. Show customer booking movie ticked");
        System.out.println("3. Back menu");
        System.out.println("input: ");

        int num = scanner.nextInt();
        switch (num){
            case 1:{
                for (int i = 0; i < listCustomer.size(); i++){
                    System.out.println(i + 1 +". " + listCustomer.get(i).showInfor());
                }
                System.out.println("input booking movie ticked: ");
                int numBookingMovie = scanner.nextInt();
                bookingTicked.add(listCustomer.get(numBookingMovie - 1));
                menuBooking4D();
                break;
            } case 2:{
                for (int i = 0; i < bookingTicked.size(); i++){
                    System.out.println(i + 1 + ". " + bookingTicked.poll().showInfor());
                }
                menuBooking4D();
                break;
            } case 3:{
                displayMainMenu();
            }
        }
    }
}
