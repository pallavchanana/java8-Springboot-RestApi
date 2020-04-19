package com.example.javatrial.javatrial.service;

import org.springframework.stereotype.Service;

@Service
public class fileService implements fileServiceImpl{

    public String showLoginPage() {
        return "get api called";
    }

	public String postLoginPage() {
		return null;
	};
    
}