package CaseStudy.Task5;

import CaseStudy.Task1.Services;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.lang.reflect.Parameter;
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
    private Services services;


    @Override
    public String showInfor() {
        return "Customer{" +
                "tenCustomer='" + nameCustomer + '\'' +
                ", ngaySinh='" + birthDay + '\'' +
                ", gioiTinh='" + sex + '\'' +
                ", cmnd='" + idCard + '\'' +
                ", soDienThoai='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", loaiKhach='" + guestType + '\'' +
                ", diaChi='" + address + '\'' +
                ", services=" + services +
                '}' + super.toString();
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

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
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
        this.services = services;
    }
    static Customer customer = new Customer();
    public static void addNewCustomer(){
        String regexName =  "[A-Z]+([ '-][a-zA-Z]+)*";
        System.out.println("nhap thong tin khac hang: ");
        Scanner scanner = new Scanner(System.in);
        boolean check = false;

        do {
            System.out.print("input name Customer: ");
            customer.setNameCustomer(scanner.next());
            for (int i = 0; i < customer.getNameCustomer().length(); i++){

            }
        }while (!check);

    }


    public static void main(String[] args) {
        addNewCustomer();
    }
}
