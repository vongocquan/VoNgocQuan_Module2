package controllers;

import com.sun.tracing.dtrace.Attributes;
import models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.model.IModel;
import services.ProductService;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping("/")
    public String index(Model model){
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "index";
    }
    @RequestMapping("/create")
    public String createForm(@ModelAttribute(value = "product") Product product){
        return "create";
    }
    @PostMapping("/create")
    public String save(@ModelAttribute Product product, Model model){
        product.setId((int) (Math.random() * 1000));
        model.addAttribute("message",
                "fill full the information");
        return productService.save(product);
    }
    @RequestMapping("/product/{id}/edit")
    public String editForm(@PathVariable int id, Model model){
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "edit";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute Product product){
        productService.update(product.getId(), product);
        return "redirect:/";
    }
    @RequestMapping("/product/{id}/delete")
    public String deleteForm(@PathVariable int id, Model model){
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "delete";
    }
    @PostMapping("/delete")
    public String delete(@ModelAttribute Product product){
        productService.remove(product.getId());
        return "redirect:/";
    }
    @RequestMapping("/product/{id}/view")
    public String view(@PathVariable int id, Model model){
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "view";
    }
    @RequestMapping("/search")
    public String searchForm(){
        return "search";
    }
    @GetMapping("/product")
    public String  search(@RequestParam String name, Model model){
        Product product =  productService.search(name);
        model.addAttribute("product", product);
        model.addAttribute("name", name);
        productService.searchReturn(product);
        return productService.searchReturn(product);
    }
}
