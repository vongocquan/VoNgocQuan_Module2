package controllers;

import javafx.application.Application;
import jdk.nashorn.internal.ir.RuntimeNode;
import models.number;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import services.impl.CaculatorServiceImpl;

@Controller

public class CaculatorController {
        CaculatorServiceImpl caculatorService = new CaculatorServiceImpl();
        @RequestMapping("/home")
        public String home(){
                return "list";
    }
    @RequestMapping ("/caculator")
        public String result(@RequestParam String num1, @RequestParam String num2, @RequestParam ("calculation") String calculation, Model model){
            try {

                String result = caculatorService.calculation(Double.parseDouble(num1), Double.parseDouble(num2), calculation);
                model.addAttribute("result", result);
            }catch (NumberFormatException e){
                String result = "error";
                model.addAttribute("result", result);
            }
                return "list";
    }
}
