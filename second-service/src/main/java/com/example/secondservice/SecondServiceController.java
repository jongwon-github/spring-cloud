package com.example.secondservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second-service")
public class SecondServiceController {

    @RequestMapping("/welcome")
    public String welcome() {
        return "Welcome to the Second service.";
    }

}
