package CaseStudy.Task5;

import CaseStudy.Task1.Services;

import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Customer extends Services{
    private String nameCustomer;
    private String birthDay;
    private String sex;
    private String idCard;
    private String phone;
    private String email;
    private String guestType;
    private String address;
    private Services services;


    @Override
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
    public static Customer customer = new Customer();
    public static Scanner scanner = new Scanner(System.in);
    static boolean check = false;
    public static void addNewCustomer(){

        String regexName = "[^a-z0-9][a-z]*";
        int cont = 0;
        do{
            System.out.print("input name customer: ");
            customer.setNameCustomer(scanner.nextLine());
            String[] arr = customer.getNameCustomer().split(" ");
            for (String s : arr) {
                if (Pattern.matches(regexName, s)) {
                    cont++;
                }

            }
            if (cont == arr.length){
                check = true;
            }else {
                System.out.print("name customer illegal. input again ");
                cont = 0;
            }
        }while (!check);
        check = false;
        String regexEmail = "[A-Za-z][A-Za-z0-1]*[@][A-Za-z0-9]+[.][A-Za-z0-9]+";
        do {
            System.out.print("input email: ");
            customer.setEmail(scanner.next());
            if (Pattern.matches(regexEmail, customer.getEmail())){
                check = true;
            }else {
                System.out.println("The email must be in the correct format abc@abc.com. input again!");
            }
        }while (!check);
        check = false;
        String regexSex1 = "[Mm][Aa][Ll][Ee]";
        String regexSex2 = "[Ff][Ee][Mm][Aa][Ll][Ee]";
        String regexSex3 = "[Uu][Nn][Kk][Nn][Oo][Ww]";
        do {
            System.out.print("input sex: ");
            String sex = scanner.next();
            if (Pattern.matches(regexSex1, sex)){
                check = true;
                sex = "Male";
            }else if (Pattern.matches(regexSex2, sex)){
                check = true;
                sex = "Female";
            }else if (Pattern.matches(regexSex3, sex)){
                check = true;
                sex = "Unknow";
            }if (check){
                customer.setSex(sex);
            }else {
                System.out.println("sex: Male/ Female, Unknow. input again!");
            }
        }while (!check);
        check = false;
        String regexIdCard = "[0-9]{9}";
        do {
            System.out.print("iput id card: ");
            customer.setIdCard(scanner.next());
            if (Pattern.matches(regexIdCard, customer.getIdCard())){
                check = true;
            }else {
                System.out.println("id card: nine number. input again!");
            }

        }while (!check);
        check = false;
        String regexBirthDay = "([0][1-9]|[12][0-9][3][01])[/]([0][1-9]|[1][12])[0-9]{4}";
        Calendar calendar = Calendar.getInstance();
//        do {
//
//                System.out.print("input birt day");
//                customer.setBirthday(scanner.next());
//                String[] arr = customer.getBirthday().split("/");
//                if (Pattern.matches(regexBirthDay, customer.getBirthday())) {
//                    if (Integer.parseInt(arr[2]) > 1900) {
//
//                        }
//                    }
//                }else {
//                    System.out.print("year > 1900 and old >= 18. input again");
//                }
//        }while (!check);
//
    }

    public static void main(String[] args){
        addNewCustomer();
    }

}
