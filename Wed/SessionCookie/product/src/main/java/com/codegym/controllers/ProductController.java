package com.codegym.controllers;

import com.codegym.models.Product;
import com.codegym.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes("list")
public class ProductController {
    @Autowired
    private ProductService productService;
    @ModelAttribute("list")
    public List<Product> setSession(){
        return new ArrayList<>();
    }
    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("productList", productService.findAll());
        return "home";
    }
    @RequestMapping("/view/{id}")
    public String view(@PathVariable(value = "id") String id, Model model){
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "view";
    }
    @RequestMapping("/shopping")
    public String formCustomerGet(@ModelAttribute("list") List<Product> list, Model model){
        if (list.size() == 0){
            model.addAttribute("message", "Giỏ Hàng Trống");
        }
        model.addAttribute("amount", 1);

        return "shopping";
    }
    @PostMapping("/shopping")
    public String formCustomer(@ModelAttribute("list") List<Product> list, @ModelAttribute("product") Product product, Model model, HttpServletResponse response){
        list.add(productService.findById(product.getCodeProduct()));
        return "redirect:/shopping";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@ModelAttribute("list") List<Product> list, @PathVariable("id") String id){
        productService.delete(list, id);
        return "redirect:/shopping";
    }
//    @GetMapping("/customer/{id}/{amount}")
//    public String price(@ModelAttribute("list") List<Product> list, @PathVariable("id") String codeProduct, @PathVariable("amount") int amount, Model model){
//        model.addAttribute("codeProduct", codeProduct);
//        model.addAttribute("amount", amount);
//        return "homeCustomer";
//    }
}
