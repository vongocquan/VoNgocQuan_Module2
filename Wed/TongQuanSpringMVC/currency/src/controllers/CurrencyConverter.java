package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import services.Converter;


@Controller
public class CurrencyConverter {
    Converter converter = new Converter();
    @RequestMapping(value ="/currency", method = RequestMethod.GET)
    public String Converter(@RequestParam String USA, Model model){
        Double a = Double.parseDouble(USA);
        model.addAttribute("converter", converter.currencyConverter(a));
        return "result";
    }
}