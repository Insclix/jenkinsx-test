package com.insclix.jenkinsxtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionalController {

    @GetMapping("/new")
    public String hello() {
        return "This is a very new controller!";
    }
}
