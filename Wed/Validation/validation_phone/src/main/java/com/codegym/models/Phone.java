package com.codegym.models;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;




public class Phone implements Validator {
    private int id;
    private String phone;

    public Phone() {
    }

    public Phone(int id, String phone) {
        this.id = id;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Phone phone = (Phone) target;
        if (phone.phone.length() > 11 | phone.phone.length() < 10){
            errors.rejectValue("phone", "phoneLength");
        }if (!phone.phone.startsWith("0")){
            errors.rejectValue("phone", "phoneStart");
        }if (!phone.phone.matches("(^[0-9]+)")){
            errors.rejectValue("phone", "phone");
        }
    }
}
