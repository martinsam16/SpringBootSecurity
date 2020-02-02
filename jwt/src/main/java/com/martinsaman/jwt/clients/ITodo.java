package com.martinsaman.jwt.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "TodoClient", url = "https://jsonplaceholder.typicode.com/")
public interface ITodo {

    @GetMapping("/todos")
    List<Object> findAll();
}
