package repository.impl;

import models.Customer;
import repository.CustomerRepository;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    public static Map<Integer, Customer> customers = new HashMap<>();
    static {
        customers.put(1, new Customer(1, "Vo Ngoc Quan", "quanv4297@gmail.com", "quan", "quan12345", 23, "Quang Nam"));
        customers.put(2, new Customer(2, "Vo Van Hai", "hai30@gmail.com", "hai", "hai12345", 26, "Quang Ngai"));

    }

    @Override
    public String signUp(String name, String email, String account, String password_1, String password_2, int old, String address) {
        if (name.equals("") | email.equals("") | account.equals("") | password_1.equals("") | password_2.equals("") | old <= 0 |address.equals("")){
            return "Enter enough information";
        }else if (!password_1.equals(password_2)){
            return "password duplicate";
        }
        else {
            for (int i = 1; i <= customers.size(); i++) {
                if (customers.get(i).getAccount().equals(account)){
                    return "account already exist";
                }
            }
            Customer customer = new Customer( (int)(Math.random() * 1000), name, email, account, password_1, old,address);
            customers.put(customer.getId(), customer);
            return "sign up success";
        }
    }
}
