package com.codegym.controllers;


import com.codegym.models.Blog;
import com.codegym.models.CategoryBlog;
import com.codegym.services.BlogService;
import com.codegym.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;


@Controller
public class BlogController {
    @Autowired
    BlogService blogService;
    @Autowired
    CategoryService categoryService;
    @RequestMapping("/")
    public String home(Model model, @PageableDefault(size = 3) Pageable pageable, @RequestParam Optional<String> keyword){
        Page<Blog> blogs;
        if (!keyword.isPresent()){
            blogs = blogService.findAll(pageable);
        }else {
            blogs = blogService.findByTitleContaining(keyword.get(), pageable);
            model.addAttribute("keyword", keyword.get());
        }
        model.addAttribute("blogs", blogs);
        return "home";
    }
    @RequestMapping("/category-blog")
    public String homeCategory(Model model, @PageableDefault(size = 3) Pageable pageable){
        Page<CategoryBlog> categoryBlogs = categoryService.findAll(pageable);
        model.addAttribute("categoryBlogs", categoryBlogs);
        return "category/homeCategory";
    }
    @RequestMapping("/create-category")
    public String createCategoryForm(Model model){
        model.addAttribute("categoryBlog", new CategoryBlog());
        return "category/createCategory";
    }
    @PostMapping("/create-category")
    public String createCategory(@ModelAttribute(value = "categoryBlog") CategoryBlog categoryBlog){
        categoryService.save(categoryBlog);
        return "redirect:/category-blog";
    }
    @RequestMapping("/edit-category/{id}")
    public String editCategoryForm(@PathVariable(value = "id") int id, Model model){
        CategoryBlog categoryBlog = categoryService.findById(id);
        model.addAttribute("categoryBlog", categoryBlog);
        return "category/editCategory";
    }
    @PostMapping("/edit-category")
    public String editCategory(@ModelAttribute(value = "categoryBlog") CategoryBlog categoryBlog){
        categoryService.save(categoryBlog);
        return "redirect:/category-blog";
    }
    @RequestMapping("/delete-category/{id}")
    public String deleteCategoryForm(@PathVariable(value = "id") int id, Model model){
        model.addAttribute("categoryBlog", categoryService.findById(id));
        return "category/deleteCategory";
    }
    @PostMapping("/delete-category")
    public String deleteCategory(@ModelAttribute(value = "categoryBlog") CategoryBlog categoryBlog, Model model){

        try {
            categoryService.delete(categoryBlog.getId());
        }catch (Exception e){
            String string = "not delete category " + categoryService.findById(categoryBlog.getId()).getCategory() + " !";
            model.addAttribute("string", string);
            return "category/deleteCategory";
        }
        return "redirect:/category-blog";
    }
    @RequestMapping("/create")
    public String createForm(Model model, Pageable pageable){
        Blog blog = new Blog();
        blog.setTimeDate(new Date());
        model.addAttribute("blog", blog);
        model.addAttribute("categoryBlog", categoryService.findAll(pageable));
        return "blog/create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute(value = "blog") Blog blog){
        blogService.save(blog);
        return "redirect:/";
    }
    @RequestMapping("/edit/{id}")
    public String editForm(@PathVariable(value = "id") int id, Model model, Pageable pageable){
        Blog blog = blogService.findById(id);
        model.addAttribute("blog", blog );
        model.addAttribute("categoryList", categoryService.findAll(pageable));
        return "blog/edit";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute(value = "blog") Blog blog){
        blogService.save(blog);
        return "redirect:/";
    }
    @RequestMapping("/delete/{id}")
    public String deleteForm(@PathVariable(value = "id") int id, Model model){
        Blog blog = blogService.findById(id);
        model.addAttribute("blog", blog);
        return "blog/delete";
    }
    @PostMapping("/delete")
    public String delete(@ModelAttribute(value = "blog") Blog blog){
        blogService.delete(blog.getId());
        return "redirect:/";
    }
    @RequestMapping("/view/{id}")
    public String viewForm(@PathVariable(value = "id") int id, Model model){
        Blog blog = blogService.findById(id);
        model.addAttribute("blog", blog);
        return "blog/view";
    }
}
