package com.martinsaman.jwt.rest;

import com.martinsaman.jwt.clients.ISearchBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchBookRest {

    @Autowired
    ISearchBook searchBookClient;

    @GetMapping
    List<Object> findAll() {
        return searchBookClient.findAll();
    }
}
