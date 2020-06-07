package models;

public class Customer {
    private int id;
    private String name;
    private String email;
    private String account;
    private String password;
    private int old;
    private String address;

    public Customer() {
    }

    public Customer(int id, String name, String email, String account, String password, int old, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.account = account;
        this.password = password;
        this.old = old;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
