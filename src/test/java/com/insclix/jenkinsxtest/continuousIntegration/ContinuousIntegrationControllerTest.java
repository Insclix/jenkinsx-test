package com.insclix.jenkinsxtest.continuousIntegration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContinuousIntegrationControllerTest {

    @Autowired
    private ContinuousIntegrationController controller;

    @Test
    public void testGetCIInfo() {
        String actual = controller.getCIInfo();

        String expected = "Build Number: ${BUILD_NUMBER}\n" +
                "Build Timestamp: ${BUILD_TIMESTAMP}\n" +
                "Build Tag: ${BUILD_TAG}\n" +
                "Git Commit: ${GIT_COMMIT}\n" +
                "Git Branch: ${GIT_BRANCH}\n" +
                "Maven Version: ${POM_VERSION}";

        assertEquals(expected, actual);
    }
}