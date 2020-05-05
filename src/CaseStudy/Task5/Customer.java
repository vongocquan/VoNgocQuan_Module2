package CaseStudy.Task5;

import CaseStudy.Task1.Services;

import java.io.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.regex.Pattern;

import static CaseStudy.Controllers.MainController.displayMainMenu;

public class Customer {
    private String nameCustomer;
    private String birthDay;
    private String sex;
    private String idCard;
    private String phone;
    private String email;
    private String guestType;
    private String address;
    private Services services;



    public String showInfor() {
        return "Customer{" +
                "nameCustomer='" + nameCustomer + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", sex='" + sex + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", guestType='" + guestType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    public Customer() {
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthday() {
        return birthDay;
    }

    public void setBirthday(String birthday) {
        this.birthDay = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public Customer(String nameCustomer, String birthDay, String sex, String idCard, String phone, String email, String guestType, String address, Services services) {
        this.nameCustomer = nameCustomer;
        this.birthDay = birthDay;
        this.sex = sex;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.guestType = guestType;
        this.address = address;

    }

    public static Scanner scanner = new Scanner(System.in);
    public static List<Customer> listCustomer = new ArrayList<>();
    static boolean check = false;
    public static void addNewCustomer() throws ParseException, IOException {
        inputCustomer();
        displayMainMenu();
    }

    public static void inputCustomer() throws IOException {
        Customer customer = new Customer();
        inputNameCustomer(customer);
        inputEmail(customer);
        inputSex(customer);
        inpuIdCard(customer);
        System.out.print("input phone: ");
        customer.setPhone(scanner.next());
        inputBirtDay(customer);
        System.out.print("input guest type: ");
        customer.setGuestType(scanner.next());
        System.out.print("input address: ");
        customer.setAddress(scanner.next());

        listCustomer.add(customer);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("").getAbsoluteFile() + "\\src\\CaseStudy\\Task5\\Customer.csv"));
        for (Customer value : listCustomer) {
            bufferedWriter.write(value.showInfor());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    private static void inputBirtDay(Customer customer) {
        String regexBirthDay = "([0][1-9]|[1][12])[/]([0][1-9]|[12][0-9]|[3][01])[/][0-9]{4}";
        Calendar calendar = Calendar.getInstance();
        do {
            System.out.print("input birthday: ");
            customer.setBirthday(scanner.next());
            if (Pattern.matches(regexBirthDay, customer.getBirthday())) {
                String[] arr = customer.getBirthday().split("/");
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

    private static void inpuIdCard(Customer customer) {
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

    private static void inputSex(Customer customer) {
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

    private static void inputEmail(Customer customer) {
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

    private static void inputNameCustomer(Customer customer) {
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


    public static void showInformationCustomer() throws IOException, ParseException {
        Comparator<Customer> comparator = new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (o1.getNameCustomer().compareTo(o2.getNameCustomer()) == 0) {
                    return compareYear(o1, o2);
                }
                return o1.getNameCustomer().compareTo(o2.getNameCustomer());

            }

            public int compareYear(Customer o1, Customer o2) {
                int yearCustomer1 = Integer.parseInt(o1.getBirthday().substring(6, 10));
                int yearCustomer2 = Integer.parseInt(o2.getBirthday().substring(6, 10));
                return Integer.compare(yearCustomer1, yearCustomer2);
            }
        };
        listCustomer.sort(comparator);
        for (Customer customer : listCustomer){
            System.out.println(customer.showInfor());
        }
        displayMainMenu();

    }
    static void displayMenu() throws IOException, ParseException {
        System.out.println("1. addNewCustomer" +
                "\n2. showInformationCustomer");
        System.out.print("num: ");
        int num = scanner.nextInt();
        switch (num){
            case 1: {
                addNewCustomer();
                break;
            } case 2:{
                showInformationCustomer();
            }
        }
    }

    public static void main(String[] args) throws ParseException, IOException {
        displayMenu();

    }

}
