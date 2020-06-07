package services.impl;

import org.springframework.stereotype.Service;
import repository.impl.CustomerRepositoryImpl;
import services.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
    CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();
    @Override
    public String signUp(String name, String email, String account, String password_1, String password_2, int old, String address) {
        return customerRepository.signUp(name, email, account, password_1, password_2, old, address);
    }
}
