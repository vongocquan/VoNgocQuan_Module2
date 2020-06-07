package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import repository.CustomerRepository;
import services.CustomerService;
import services.impl.CustomerServiceImpl;

@Controller
public class CustomerController {
    @Autowired
    CustomerServiceImpl customerService;
    @RequestMapping
    public String home(){
        return "index";
    }
    @PostMapping("/signUp")
    public String registration(){
        return "registration";
    }
    @GetMapping("/signUp")
    public String signUp(@RequestParam String name, @RequestParam String email, @RequestParam String account,
                         @RequestParam String password_1, @RequestParam String password_2, @RequestParam int old,
                         @RequestParam String address, Model model){
        String result = customerService.signUp(name, email, account, password_1, password_2, old, address, customerService.arrayCustomer());
        model.addAttribute("result", result);

        return "registration";
    }

}
