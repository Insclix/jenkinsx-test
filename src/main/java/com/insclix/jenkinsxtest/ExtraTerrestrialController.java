package com.insclix.jenkinsxtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExtraTerrestrialController {

    @GetMapping("/et")
    public String hello() {
        return "Hello Extra Terrestrials!";
    }
}
