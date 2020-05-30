package services;

import org.springframework.stereotype.Service;

@Service
public class Converter {
    public Converter() {
    }

    public double currencyConverter(double a){
        return a*23;
    }
}
