package com.gjk.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chaitu on 9/20/2015.
 */
@RestController
public class ExampleController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}