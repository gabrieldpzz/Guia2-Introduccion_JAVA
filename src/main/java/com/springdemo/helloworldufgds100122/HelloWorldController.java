package com.springdemo.helloworldufgds100122;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping
    public String helloWorld() {
        return "Hola Mundo UFG";
    }
    @RequestMapping("/goodbye")
    public String goodbye() {
        return "Adios un gusto conocerlos Estudiantes UFG";
    }
}

