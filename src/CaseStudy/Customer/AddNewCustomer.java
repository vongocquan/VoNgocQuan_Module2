package CaseStudy.Customer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;


import static CaseStudy.Customer.WriteCustomer.writeCustomer;

public class AddNewCustomer {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean check = false;
    public static List<Customer> customerList;
    public static void addNewCustomer() throws IOException, ClassNotFoundException {
        Customer customer = new Customer();
        customerList = new ArrayList<>();
        inputNameCustomer(customer);
        inputEmail(customer);
        inputSex(customer);
        inputIdCard(customer);
        System.out.print("input phone: ");
        customer.setPhone(scanner.next());
        inputBirtDay(customer);
        System.out.print("input guest type: ");
        customer.setGuestType(scanner.next());
        System.out.print("input address: ");
        customer.setAddress(scanner.next());
        customerList.add(customer);
        writeCustomer();
    }

//    input name customer -----------------------------------------------------------------
    public static void inputNameCustomer(Customer customer) {
        String regexName = "[^a-z0-9][a-z]*";
        int cont = 0;
        do {
            System.out.print("input name customer: ");
            customer.setNameCustomer(scanner.next());
            String[] arr = customer.getNameCustomer().split(" ");
            for (String s : arr) {
                if (Pattern.matches(regexName, s)) {
                    cont++;
                }

            }
            if (cont == arr.length) {
                check = true;
            } else {
                System.out.print("name customer illegal. input again ");
                cont = 0;
            }
        } while (!check);
        check = false;
    }


    //    input Email---------------------------------------------------------------------------------
    public static void inputEmail(Customer customer) {
        String regexEmail = "[A-Za-z][A-Za-z0-1]*[@][A-Za-z0-9]+[.][A-Za-z0-9]+";
        do {
            System.out.print("input email: ");
            customer.setEmail(scanner.next());
            if (Pattern.matches(regexEmail, customer.getEmail())) {
                check = true;
            } else {
                System.out.println("The email must be in the correct format abc@abc.com. input again!");
            }
        } while (!check);
        check = false;
    }

//    input sex---------------------------------------------------------------------
    public static void inputSex(Customer customer) {
        String regexSex1 = "[Mm][Aa][Ll][Ee]";
        String regexSex2 = "[Ff][Ee][Mm][Aa][Ll][Ee]";
        String regexSex3 = "[Uu][Nn][Kk][Nn][Oo][Ww]";
        do {
            System.out.print("input sex: ");
            String sex = scanner.next();
            if (Pattern.matches(regexSex1, sex)) {
                check = true;
                sex = "Male";
            } else if (Pattern.matches(regexSex2, sex)) {
                check = true;
                sex = "Female";
            } else if (Pattern.matches(regexSex3, sex)) {
                check = true;
                sex = "Unknow";
            }
            if (check) {
                customer.setSex(sex);
            } else {
                System.out.println("sex: Male/ Female, Unknow. input again!");
            }
        } while (!check);
        check = false;
    }

//    input id card---------------------------------------------------------
    public static void inputIdCard(Customer customer) {
        String regexIdCard = "[0-9]{9}";
        do {
            System.out.print("iput id card: ");
            customer.setIdCard(scanner.next());
            if (Pattern.matches(regexIdCard, customer.getIdCard())) {
                check = true;
            } else {
                System.out.println("id card: nine number. input again!");
            }

        } while (!check);
        check = false;
    }

//    input birthDay ---------------------------------------------------------------
    public static void inputBirtDay(Customer customer) {
        String regexBirthDay = "([0][1-9]|[1][12])[/]([0][1-9]|[12][0-9]|[3][01])[/][0-9]{4}";
        Calendar calendar = Calendar.getInstance();
        do {
            System.out.print("input birthday: ");
            customer.setBirthDay(scanner.next());
            if (Pattern.matches(regexBirthDay, customer.getBirthDay())) {
                String[] arr = customer.getBirthDay().split("/");
                LocalDate birthDay = LocalDate.of(Integer.parseInt(arr[2]), Integer.parseInt(arr[1]), Integer.parseInt(arr[0]));
                LocalDate currentDate = LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH));
                int old = (int) ChronoUnit.YEARS.between(birthDay, currentDate);
                if (old > 18 & Integer.parseInt(arr[2]) > 1900) {
                    check = true;
                } else {
                    System.out.println("erro! again iput: ");
                }


            } else {
                System.out.println("erro! again iput: ");
            }
        } while (!check);
        check = false;
    }

}
