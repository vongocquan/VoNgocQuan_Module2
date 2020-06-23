package com.codegym.controllers;

import com.codegym.models.User;
import com.codegym.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("user", new User());
        return "home";
    }
    @PostMapping("/sign")
    public String sign(@Valid @ModelAttribute(value = "user") User user, BindingResult bindingResult,
                       Model model){
        new User().validate(user, bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "home";
        }
        else {
            userService.save(user);
            return "sign";
        }
    }
}
