package com.spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginControler {

    @RequestMapping(value = "/login-index", method = RequestMethod.GET)
    public String index(){
        return "login";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(
            @RequestParam String username,
            @RequestParam String password,
            ModelMap modelMap
    ){
        if(check_login(username, password)){
            return "home";
        }else {
            return "login"
        }
    }
}
