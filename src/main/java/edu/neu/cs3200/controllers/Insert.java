package edu.neu.cs3200.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Insert {

    @RequestMapping("/api/insert/animal")
    public void insertAnimal() {
    }
}
