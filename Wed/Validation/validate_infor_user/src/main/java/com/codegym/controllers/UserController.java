package com.codegym.controllers;

import com.codegym.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @RequestMapping("/")
    public String showForm(Model model){
        model.addAttribute("user", new User());
        return "home";
    }
    @PostMapping("validate")
    public String signUp(@Valid @ModelAttribute(value = "user") User user, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return "home";
        }
        else {
            return "sign";
        }
    }
}
