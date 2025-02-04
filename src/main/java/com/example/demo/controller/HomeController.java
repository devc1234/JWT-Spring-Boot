package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.servises.UserSevises;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private UserSevises userSevises;
	
	@GetMapping("/users")
	public List<User> getUser() {
		
		System.out.println("getting user");
		return userSevises.getUser();
	}
}
