package repository.impl;

import org.springframework.stereotype.Repository;
import repository.CaculatorRepository;
@Repository
public class CaculatorRepositoryImpl implements CaculatorRepository {

    @Override
    public String calculation(double num1, double num2, String calculation) {
        String result = "";

        switch (calculation) {
            case "Addition(+)":
                result = "Result Division: " + String.valueOf(num1 + num2);
                break;
            case "Addition(-)":
                result = "Result Division: " + String.valueOf(num1 - num2);
                break;
            case "Addition(*)":
                result = "Result Division: " + String.valueOf(num1 * num2);
                break;
            case "Addition(/)":
                if (num2 != 0) {
                    result = "Result Division: " + String.valueOf(num1 / num2);
                } else {
                    result = "error";
                }
                break;
            }

       return result;
    }
}
