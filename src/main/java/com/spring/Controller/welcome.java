package com.spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class welcome {

    @RequestMapping(value = "/welcome-index", method = RequestMethod.GET)
    public String index(){
        return "welcome";
    }
}
