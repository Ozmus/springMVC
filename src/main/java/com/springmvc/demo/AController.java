package com.springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AController {
    @RequestMapping("/hello")
    public String heyo(){
        return "main-menu.jsp";
    }
}
