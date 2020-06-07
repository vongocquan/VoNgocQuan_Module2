package repository.impl;

import org.springframework.stereotype.Repository;
import repository.SandwichRepository;

public class SandwichRepositoryImpl implements SandwichRepository {

    @Override
    public String show(String[] condiments) {
        String result = "";
        for (String condiment : condiments){
            if (result != ""){
                result += ", ";
            }
            result += condiment;
        }
        return result;
    }
}
