package com.spring.Controller;

import com.spring.Service.AuthService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthControler {

        AuthService authService = new AuthService();
    @RequestMapping(value = "/login-index", method = RequestMethod.GET)
    public String index(){
        return "login";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(
            @RequestParam String username,
            ModelMap modelMap,
            @RequestParam String password
    ){
        System.out.println(username);
        System.out.println(password);
        modelMap.put("username", username);
        if(!authService.check_login(password)){
            modelMap.put("message", "password and/or username invalid");
            return "login";
        }
        return "home";
    }
}
