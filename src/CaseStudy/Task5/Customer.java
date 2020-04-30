package CaseStudy.Task5;

import CaseStudy.Task1.Services;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Customer extends Services {
    private String nameCustomer;
    private String birthDay;
    private String sex;
    private String idCard;
    private String phone;
    private String email;
    private String guestType;
    private String address;


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
                '}' + getServiceCode();
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

        String regexName = "[^0-9a-z][^A-Z0-9]*";
        int cont = 0;
        do{
            System.out.print("input name customer: ");
            customer.setNameCustomer(scanner.nextLine());
            String[] ar = customer.getNameCustomer().split(" ");
            for (String s : ar) {
                if (Pattern.matches(regexName, s)) {
                    cont++;
                }

            }
            if (cont == ar.length){
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

    }


    public static void main(String[] args) {
        addNewCustomer();
    }
}
