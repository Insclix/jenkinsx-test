package com.insclix.jenkinsxtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdatedController {

    @GetMapping("/updated")
    public String hello() {
        return "This is an updated controller!";
    }
}
