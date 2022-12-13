package com.spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController
//@RequestMapping(value="/api")
//public class FirstController {
//
//    @GetMapping(value="/login")
//    @ResponseBody
//    public String login(){
//        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
//        System.out.println("test");
//        return "hello-spring";
//    }
//}
@Controller
public class FirstController {

    @RequestMapping(value = "/api")
    @ResponseBody
    public String login(){
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("test");
        return "hello-spring";
    }
}