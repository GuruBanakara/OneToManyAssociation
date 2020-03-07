package com.gb.crudMerge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gb.crudMerge.model.Mobile;
import com.gb.crudMerge.model.User;
import com.gb.crudMerge.service.MobileService;
import com.gb.crudMerge.service.UserService;

@RestController
public class MobileController {

	@Autowired
	private MobileService mobileService;
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/mobile")
	public Mobile save(@RequestBody Mobile mobile) {
		return mobileService.save(mobile);
		
	}
	
	@PostMapping("user")
	public User save(@RequestBody User user) {
		return userService.save(user);
		
	}
	@GetMapping("/mobiles")
	public List<Mobile> getAll() {
		return mobileService.findAll();
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.findAll();
		
	}
	
	@DeleteMapping("/user/{id}")
	public String deleteById(@PathVariable int id) {
		userService.deleteById(id);
		return "deleted";
		
	}
	
	@DeleteMapping("/mobile/{id}")
	public String deleteMobileById(@PathVariable int id) {
		mobileService.deleteById(id);
		return "deleted";
		
	}
	
	
}
