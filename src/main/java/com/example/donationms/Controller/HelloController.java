package com.example.donationms.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller()
public class HelloController {
    @GetMapping("Hello")
    public String Hello(Map<String,Object> model)
    {
        System.out.println("IN HELLO");
        model.put("message","Hello");
        return "Hello";
    }


}
