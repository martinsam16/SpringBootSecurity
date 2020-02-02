package com.martinsaman.jwt.rest;

import com.martinsaman.jwt.clients.ITodo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
public class ProtegidoRest {

    @Autowired
    ITodo todoClient;

    //Header -> Authorization token

    @GetMapping
    public String hola(Principal principal) {
        return "Hola estoy protegido xdxd " + principal.getName();
    }

    @GetMapping("/todo")
    public List<Object> desdeElOtroMundo() {
        return todoClient.findAll();
    }
}
