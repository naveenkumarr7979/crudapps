package com.example.crudapps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/test")
    public String home()
    {
        return "this is test.";
    }
    @GetMapping("/index")
    public String index()
    {
        return "this is index.";
    }
    @GetMapping("/admin")
    public String admin()
    {
        return "this is admin.";
    }


}
