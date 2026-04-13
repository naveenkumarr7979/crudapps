package com.example.crudapps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/test")
    public String home()
    {
        return "hello jyoti baby buggu i lovpuk e ";
    }
    @GetMapping("/contact")
    public String contact()
    {
        return "hi this is contact page";
    }
    @GetMapping("/about")
    public String about()
    {
        return "hi this is about page";
    }

    @GetMapping("/help")
    public String help()
    {
        return "hi this is help page";
    }
}
