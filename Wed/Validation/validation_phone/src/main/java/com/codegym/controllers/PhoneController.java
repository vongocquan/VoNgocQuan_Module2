package com.codegym.controllers;

import com.codegym.models.Phone;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class PhoneController {
    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("phone", new Phone());
        return "home";
    }
    @PostMapping("/phone")
    public String phone(@Valid @ModelAttribute(value = "phone") Phone phone, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        new Phone().validate(phone, bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "home";
        }
        else {
            return "result";
        }
    }
}
