package CaseStudy.Controllers;


import java.io.*;
import java.text.ParseException;
import java.util.*;

import static CaseStudy.Booking.Booking.displayMenuBooking;
import static CaseStudy.BookingMovie4D.Movie4D.menuBooking4D;
import static CaseStudy.Controllers.NewServies.addNewServices;
import static CaseStudy.Controllers.ShowCustomer.showInformationCustomer;
import static CaseStudy.Customer.AddNewCustomer.addNewCustomer;
import static CaseStudy.Employee.Employee.menuEmployee;
import static CaseStudy.FindEmployee.FindEmployee.findEmployee;
import static CaseStudy.ShowServices.Show.showServices;


public class MainController {

    public static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu() throws IOException, ClassNotFoundException {
        System.out.println("1. Add New Services");
        System.out.println("2. Show Services");
        System.out.println("3. Add New Customer");
        System.out.println("4. Show Information of Customer");
        System.out.println("5. Add New Booking");
        System.out.println("6. Show Information of Employee");
        System.out.println("7. Booking Movie Ticker 4D");
        System.out.println("8. Find Employee");
        System.out.println("9. Exit");
        System.out.println("---------------------input-------------- ");
        int inputMenu = scanner.nextInt();
        switch (inputMenu){
            case 1:{
                addNewServices();
                break;
            }case 2:{
                showServices();
                break;
            } case 3:{
                addNewCustomer();
                break;
            } case 4:{
                showInformationCustomer();
                break;
            } case 5:{
                displayMenuBooking();
                break;
            } case 6: {
                menuEmployee();
                break;
            } case 7:{
                menuBooking4D();
                break;
            } case 8:{
                findEmployee();
                break;
            }
        }
    }


    public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {
        displayMainMenu();
    }
}
