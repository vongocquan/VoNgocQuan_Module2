package com.codegym.controllers;

import com.codegym.models.User;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes("user")
public class LoginController {
    @RequestMapping("/")
    public String loginForm(@CookieValue(value = "emailCookie", defaultValue = "") String emailCookie,
                            @CookieValue(value = "password", defaultValue = "") String passwordCookie, Model model) {
        model.addAttribute("user", new User(emailCookie, passwordCookie));
        return "home";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute("user") User user, HttpServletResponse response, Model model){
        if (user.getEmail().equals("admin@gmail.com") & user.getPassword().equals("12345")){
            Cookie cookieEmail = new Cookie("emailCookie", user.getEmail());
            cookieEmail.setMaxAge(10);
            response.addCookie(cookieEmail);
            return "login";
        }
        else {
            model.addAttribute("message", "Login failed!");
            return "home";
        }
    }
}
