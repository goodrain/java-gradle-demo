package com.rainbond.javagradledemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {

        return "Hello Java Gradle Demo!!!";
    }
}
