package repository.impl;

import models.Customer;
import repository.CustomerRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    public static Map<Integer, Customer> customers = new HashMap<>();
    static {
        customers.put(1, new Customer(1, "Vo Ngoc Quan", "quanv4297@gmail.com", "quan", "quan12345", 23, "Quang Nam"));
        customers.put(2, new Customer(2, "Vo Van Hai", "hai30@gmail.com", "hai", "hai12345", 26, "Quang Ngai"));

    }

    @Override
    public List<Customer> arrayCustomer() {
        return (List<Customer>) customers.values();
    }

    @Override
    public String signUp(String name, String email, String account, String password_1, String password_2, int old, String address) {
        List<Customer> list = (List<Customer>) customers.values();
        if (name.isEmpty() | email.isEmpty() | account.isEmpty() | password_1.isEmpty() | password_2.isEmpty() | old <= 0 |address.isEmpty()){
            return "Enter enough information";
        }else if (!password_1.equals(password_2)){
            return "password duplicate";
        }
        else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getAccount().equals(account)){
                    return "account already exist";
                }
            }
            Customer customer = new Customer( (int)(Math.random() * 1000), name, email, account, password_1, old,address);
            customers.put(customer.getId(), customer);
            return "sign up success";
        }
    }
}
