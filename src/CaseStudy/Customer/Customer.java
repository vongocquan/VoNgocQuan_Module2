package CaseStudy.Customer;

import CaseStudy.Task1.Services;

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
                ", services=" + services +
                '}';
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
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

    public Customer(String nameCustomer, String birthDay, String sex, String idCard, String phone, String email, String guestType, String address) {
        this.nameCustomer = nameCustomer;
        this.birthDay = birthDay;
        this.sex = sex;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.guestType = guestType;
        this.address = address;
    }

    public Customer() {
    }
    public String showFile(){
        return nameCustomer + "," + birthDay + "," + sex + "," +idCard + "," + phone + "," + email + "," +guestType + "," + address;
    }

}
