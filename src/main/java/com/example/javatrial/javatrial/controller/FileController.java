package com.example.javatrial.javatrial.controller;

import com.example.javatrial.javatrial.service.fileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class FileController {
    @Autowired
	private fileService fileservice;

    @GetMapping("/")
    public String getstring(){
    return fileservice.showLoginPage();
    }

    @PostMapping("/api/post")
    public String postString(){
    return fileservice.postLoginPage();
    }
}
