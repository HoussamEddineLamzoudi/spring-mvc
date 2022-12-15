package com.spring.Service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
    public AuthService() {
    }
    public Boolean check_login(String password){
        return password.equals("123");
    }
}
