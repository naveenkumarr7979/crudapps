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
}
