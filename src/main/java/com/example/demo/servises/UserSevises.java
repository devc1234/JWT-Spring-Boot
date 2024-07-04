package com.example.demo.servises;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;


@Service
public class UserSevises {

	
	private List<User> store = new ArrayList<>();
	
	public UserSevises() {
		store.add(new User(UUID.randomUUID().toString(),"dev","dev@1234"));
		store.add(new User(UUID.randomUUID().toString(),"devchavan","chavan@1234"));
	}
	
	public List<User> getUser(){
		return this.store;
	}
}
