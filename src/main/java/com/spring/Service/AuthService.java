package com.spring.Service;

public class AuthService {
    public AuthService() {
    }
    public Boolean check_login(String password){
        return password.equals("123");
    }
}
