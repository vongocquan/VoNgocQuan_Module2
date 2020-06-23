package com.codegym.models;

public class Product {
    private String codeProduct;
    private String name;
    private int price;
    private String detail;
    private Integer amount;
    public String img;
//    private String detail;


    public Product() {
    }

    public Product(String codeProduct, String name, int price, String detail, Integer amount, String img) {
        this.codeProduct = codeProduct;
        this.name = name;
        this.price = price;
        this.detail = detail;
        this.amount = amount;
        this.img = img;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
