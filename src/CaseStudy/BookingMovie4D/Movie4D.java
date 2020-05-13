package CaseStudy.BookingMovie4D;

import CaseStudy.Customer.Customer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import static CaseStudy.Controllers.MainController.displayMainMenu;
import static CaseStudy.Customer.AddNewCustomer.customerList;
import static CaseStudy.Customer.WriteCustomer.saveListCustomer;

public class Movie4D {
    public static Scanner scanner = new Scanner(System.in);
    public static Queue<Customer> bookingTicked = new LinkedList<>();
    public static void menuBooking4D() throws IOException, ClassNotFoundException {
        System.out.println("1. Booking movie ticked");
        System.out.println("2. Show customer booking movie ticked");
        System.out.println("3. Back menu");
        System.out.println("---------------------------------------input---------------------------------- ");
        int input = scanner.nextInt();
        switch (input){
            case 1:{
                customerList = new ArrayList<>();
                saveListCustomer();
                for (int i = 0; i < customerList.size(); i++){
                    System.out.println(i + 1 +". " + customerList.get(i).showInfor());
                }
                System.out.println("input booking movie ticked: ");
                int numBookingMovie = scanner.nextInt();
                bookingTicked.add(customerList.get(numBookingMovie - 1));
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
