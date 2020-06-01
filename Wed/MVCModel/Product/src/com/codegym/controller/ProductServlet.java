package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import com.codegym.service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import static com.codegym.service.ProductServiceImpl.products;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet  {


    public ProductServiceImpl productService = new ProductServiceImpl();

    private void listProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Product> products = this.productService.findAll();
        request.setAttribute("products", products);
        request.getRequestDispatcher("Product/list.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                createProduct(request, response);
                break;
            case "edit":
                editProduct(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
            case "search":
                searchProduct(request,response);
                break;
            default:
                break;
        }
    }

    private void searchProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        Product product =  productService.search(productService.findAll(), name);
        request.setAttribute("name", product.getName());
        request.setAttribute("price", product.getPrice());
        request.setAttribute("description", product.getDescription());
        request.setAttribute("producer", product.getProducer());
        request.getRequestDispatcher("Product/search.jsp").forward(request, response);

    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        productService.remove(id);
        request.getRequestDispatcher("Product/delete.jsp").forward(request, response);
    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String description = request.getParameter("description");
        String producer = request.getParameter("producer");
        Product product = new Product(id, name, price, description,producer);
        productService.update(id, product);
        String message = "Register successfully!";
        request.setAttribute("message", message);
        request.getRequestDispatcher("Product/edit.jsp").forward(request, response);
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String description = request.getParameter("description");
        String producer = request.getParameter("producer");
        int id = (int) (Math.random() * 100);
        Product product = new Product(id, name, price, description, producer);
        productService.save(product);
        String message = "Register successfully!";

        request.setAttribute("message", message);
        request.getRequestDispatcher("Product/create.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                createProductForm(request, response);
                break;
            case "edit":
                editProductForm(request, response);
                break;
            case "delete":
                deleteProductForm(request, response);
                break;
            case "view":
                viewProduct(request, response);
                break;
            case "search":
                searchProductForm(request, response);
                break;
            default:
                listProduct(request, response);
                break;
        }
    }

    private void searchProductForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("Product/search.jsp").forward(request, response);
    }

    private void viewProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.findById(id);
        request.setAttribute("product", product);
        request.getRequestDispatcher("Product/delete.jsp").forward(request, response);
    }

    private void deleteProductForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("Product/delete.jsp").forward(request, response);
    }

    private void editProductForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("Product/edit.jsp").forward(request, response);
    }

    private void createProductForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("Product/create.jsp").forward(request, response);
    }


}
