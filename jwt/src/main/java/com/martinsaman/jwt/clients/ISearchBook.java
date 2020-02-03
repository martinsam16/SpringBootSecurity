package com.martinsaman.jwt.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "SearchBookClient",url = "localhost:8080")
public interface ISearchBook {

    @GetMapping
    List<Object> findAll();

}
