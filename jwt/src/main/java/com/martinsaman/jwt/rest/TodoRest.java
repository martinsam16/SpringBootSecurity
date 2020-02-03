package com.martinsaman.jwt.rest;

import com.martinsaman.jwt.clients.ITodo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoRest {

    @Autowired
    ITodo todoClient;

    @GetMapping
    List<Object> desdeElOtroMundo() {
        return todoClient.findAll();
    }
}
