package services.impl;


import org.springframework.stereotype.Service;

import services.SandwichService;

import java.nio.file.OpenOption;
import java.util.Optional;

@Service
public class SandwichServiceImpl implements SandwichService {


    @Override
    public String show(Optional<String[]> openOption) {
        String result = "";
        if (openOption.isPresent()) {
            for (String value : openOption.get()){
                result += value;
                result += " ";
            }
            return result;
        }
        return "not ";
    }
}
