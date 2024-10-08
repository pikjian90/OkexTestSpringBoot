package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/showId")
    public String showId(@RequestParam(value="id", defaultValue = "12345") String id) {
        return "ID: " + id;
    }
}
