package com.example.firstservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first-service")
public class FirstServiceController {

    @RequestMapping("/welcome")
    public String welcome() {
        return "Welcome to the First service.";
    }

}
