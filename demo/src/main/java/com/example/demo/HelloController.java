package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * HelloController greets Hello World.
 */
@RestController
public class HelloController {

    @GetMapping(value="hello")
    public String getHelloWorld() {
        return "Hello World";
    }
    
    
}