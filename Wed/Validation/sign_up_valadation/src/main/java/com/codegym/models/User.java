package com.codegym.models;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class User implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    @NotNull(message = "Please enter Age")
    @Min(value = 18, message = "Age not less than 18")
    private Integer age;
    private String email;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        if (user.firstName.length() < 5 || user.firstName.length() > 45){
            errors.rejectValue("firstName", "firstName");
        }if (user.lastName.length() < 5 || user.lastName.length() > 45){
            errors.rejectValue("lastName", "lastName");
        }if (user.phoneNumber.length() > 11 || user.phoneNumber.length() < 10){
            errors.rejectValue("phoneNumber", "phoneLength");
        }if (!user.phoneNumber.startsWith("0")){
            errors.rejectValue("phoneNumber", "phoneStart");
        }if (!user.phoneNumber.matches("(^[0-9]+)")){
            errors.rejectValue("phoneNumber", "phone");
        }if (!user.email.matches("[A-Za-z][A-Za-z0-9]*[@][A-Za-z0-9]+[.][A-Za-z0-9]+")){
            errors.rejectValue("email" , "email");
        }
    }
}
