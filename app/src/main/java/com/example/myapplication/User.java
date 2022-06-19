package com.example.myapplication;

public class User {
    public String Email;
    public String Password;
    public String ConfirmPassword;

    public User(String email, String password, String confirmPassword) {
        Email = email;
        Password = password;
        ConfirmPassword = confirmPassword;
    }
}
