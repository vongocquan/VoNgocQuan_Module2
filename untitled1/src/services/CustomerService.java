package services;

import models.Customer;

import java.util.List;
import java.util.Map;

public interface CustomerService {
    List<Customer> arrayCustomer();
    String signUp(String name, String email, String account, String password_1, String password_2, int old, String address);
}
