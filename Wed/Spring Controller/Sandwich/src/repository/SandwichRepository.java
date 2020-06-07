package repository;


import org.springframework.stereotype.Repository;

@Repository
public interface SandwichRepository {
    String show(String[] condiment);
}
