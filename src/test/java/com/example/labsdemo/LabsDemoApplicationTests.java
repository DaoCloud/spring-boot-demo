package com.example.labsdemo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LabsDemoApplicationTests {

    @Autowired
    public LabsDemoApplication labsDemoApplication;

    @Test
    public void contextLoads() {
        String n = labsDemoApplication.hello();
        Assert.assertTrue(n.equals("Hello! Docker!"));
    }

}
