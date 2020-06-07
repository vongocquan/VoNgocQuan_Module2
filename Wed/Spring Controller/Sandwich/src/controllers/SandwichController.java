package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.SandwichService;


@Controller
public class SandwichController {
    @Autowired
    SandwichService sandwichService;
    @RequestMapping
    public String home(){
        return "home";
    }
    @PostMapping ("/save")
    public String save(@RequestParam ("condiment") String[] condiments, Model model){
        String result = sandwichService.show(condiments);
        model.addAttribute("result", result);
        return "save";

    }
}
