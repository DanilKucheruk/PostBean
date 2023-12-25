package ru.danil.kucheruk.postbean.controller;

import org.springframework.web.bind.annotation.RestController;

import ru.danil.kucheruk.postbean.api.request.PostRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.Collections;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class PostController {
    @GetMapping("/")
    public Collection<String> getPublicPostsList() {
        return Collections.emptyList();
    }

    @GetMapping("/{hash}")
    public String getByHash(@PathVariable String hash) {
        return hash;
    }

    @PostMapping("/")
    public String add(@RequestBody PostRequest request){        
        return request.getData();
    }
    
    
}