package com.example.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String home() {
        return "This is home page";
    }
    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi";
    }
}
