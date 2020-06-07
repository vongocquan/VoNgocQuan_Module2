package repository;


import org.springframework.stereotype.Repository;
@Repository
public interface CustomerRepository {
    String signUp(String name, String email, String account, String password_1, String password_2, int old, String address);
}
