package com.example.labsdemo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by misha on 2017/7/5.
 */
public class HelloServiceTest {

    private HelloService helloService = new HelloService();

    @Test
    public void hello() throws Exception {

        Assert.assertTrue(helloService.hello(null) == "hi");
        Assert.assertTrue(helloService.hello("hi") == "hi");
        Assert.assertTrue(helloService.hello("bye！") == "bye！");

    }

}