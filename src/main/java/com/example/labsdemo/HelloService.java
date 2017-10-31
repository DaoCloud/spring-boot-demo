package com.example.labsdemo;

import java.util.Objects;

/**
 * Created by misha on 2017/7/5.
 */
public class HelloService {

    public String hello(String input){
        if(Objects.isNull(input)){
            return "hi";
        }

        return input;
    }
}
