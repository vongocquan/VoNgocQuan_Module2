package controllers;

import models.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import services.BlogService;
import java.util.List;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;
    @RequestMapping("/")
    public String index(Model mode){
        List<Blog> blogs = blogService.findAll();
        mode.addAttribute("blog", blogs);
        return "index";
    }
    @RequestMapping("/create")
    public String createForm(Model model){
        model.addAttribute("blog", new Blog());
        return "create";
    }
    @PostMapping ("/create")
    public String create(@ModelAttribute(value = "blog") Blog blog){
        blogService.save(blog);
        return "redirect:/";
    }
    @RequestMapping("/blog/{id}/edit")
    public String editForm(@PathVariable int id, Model model){
        Blog blog = blogService.findById(id);
        model.addAttribute("blog", blog);
        return "edit";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute(value = "blog") Blog blog){
        blogService.edit(blog);
        return "redirect:/";
    }
    @RequestMapping("/blog/{id}/delete")
    public String deleteForm(@PathVariable int id, Model model){
        Blog blog = blogService.findById(id);
        model.addAttribute("blog", blog);
        return "delete";
    }
    @PostMapping("/delete")
    public String delete(@RequestParam(value = "id") int id){
        blogService.delete(id);
        return "redirect:/";
    }
    @RequestMapping("/blog/{id}/view")
    public String view(@PathVariable int id, Model model){
        Blog blog = blogService.findById(id);
        model.addAttribute("blog", blog);
        return "view";
    }
}
