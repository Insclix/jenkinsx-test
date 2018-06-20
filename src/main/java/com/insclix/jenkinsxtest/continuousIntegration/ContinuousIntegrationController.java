package com.insclix.jenkinsxtest.continuousIntegration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class ContinuousIntegrationController {

    @GetMapping("/ci-info")
    public String getCIInfo() {
        try {
            return new String(Files.readAllBytes(Paths.get(ClassLoader.getSystemResource("ci-info.txt").toURI())));
        } catch (Exception e) {
            return e.getMessage();
        }
    }

}
