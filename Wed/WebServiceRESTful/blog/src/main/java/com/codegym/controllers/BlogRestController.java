package com.codegym.controllers;

import com.codegym.models.Blog;
import com.codegym.models.CategoryBlog;
import com.codegym.services.BlogService;
import com.codegym.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogRestController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    BlogService blogService;
    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public ResponseEntity<List<CategoryBlog>> getListCategoryBlog(){
        List<CategoryBlog> categoryBlogs = categoryService.findAll();
        return new ResponseEntity<>(categoryBlogs, HttpStatus.OK);
    }
    @RequestMapping(value = "/blog", method = RequestMethod.GET)
    public ResponseEntity<List<Blog>> getListBlog(){
        List<Blog>  blogs = blogService.findAll();
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }
    @RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
    public ResponseEntity<Blog> getBlog(@PathVariable("id") int id){
        Blog blog = blogService.findById(id);
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }
    @RequestMapping(value = "/category/{id}",method = RequestMethod.GET)
    public ResponseEntity<List<Blog>> getListBlogCategory(@PathVariable("id") int id){
        List<Blog> blogs = blogService.findAllByCategoryBlog_Id(id);
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }
}
