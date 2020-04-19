package CaseStudy.Task2;

import java.util.Scanner;

public class MainController {
    public static void displayMainMenu() {
        System.out.println ("1. Add New Services");
        System.out.println("2. Show Services");
        System.out.println("3. Add New Customer");
        System.out.println("4. Show Information of Customer");
        System.out.println("5. Add New Booking");
        System.out.println("6. Show Information of Employee");
        System.out.println("7. Exit");
    }
    public static void main(String[] args) {
        displayMainMenu();
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap");
        int x = scanner.nextInt();
        switch (x){
            case 1:{
                System.out.println();
            }
        }

    }
}