package services.impl;

import models.Customer;
import org.springframework.stereotype.Service;
import repository.impl.CustomerRepositoryImpl;
import services.CustomerService;

import java.util.List;
import java.util.Map;

@Service
public class CustomerServiceImpl implements CustomerService {
    CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> arrayCustomer() {
        return customerRepository.arrayCustomer();
    }

    @Override
    public String signUp(String name, String email, String account, String password_1, String password_2, int old, String address, List<Customer> arrayCustomer) {
        return customerRepository.signUp(name, email, account, password_1, password_2, old, address, arrayCustomer);
    }
}
