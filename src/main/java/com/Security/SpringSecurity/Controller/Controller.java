package com.Security.SpringSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

    @GetMapping("/home")
    public String home(){
        return "Home Page";
    }
    @GetMapping("/getBalance")
    public String getBalance(){
        return "10000k";
    }
}
