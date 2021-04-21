package com.example.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HelloController {
    @RequestMapping(path = "/")
    public String home() {
        return "This is home page";
    }

    @RequestMapping(path = "hello")
    public String sayHi() {
        return "Hi";
    }
}
