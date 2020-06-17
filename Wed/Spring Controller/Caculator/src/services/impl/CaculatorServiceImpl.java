package services.impl;

import org.springframework.stereotype.Service;
import services.CaculatorService;
@Service
public class CaculatorServiceImpl implements CaculatorService {

    @Override
    public String calculation(double num1, double num2, String calculation) {
        String result = "";

        switch (calculation) {
            case "Addition(+)":
                result = "Result Division: " + String.valueOf(num1 + num2);
                break;
            case "Subtraction(-)":
                result = "Result Division: " + String.valueOf(num1 - num2);
                break;
            case "Multiplication(*)":
                result = "Result Division: " + String.valueOf(num1 * num2);
                break;
            case "Division(/)":
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
