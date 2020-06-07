package repository;


import models.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CustomerRepository {
    List<Customer> arrayCustomer();
    String signUp(String name, String email, String account, String password_1, String password_2, int old, String address);
}
