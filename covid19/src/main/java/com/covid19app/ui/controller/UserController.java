package com.covid19app.ui.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid19app.dto.UserDto;
import com.covid19app.entity.UserEntity;
import com.covid19app.service.UserService;
import com.covid19app.ui.model.request.UserDetailsRequestModel;
import com.covid19app.ui.model.response.UserRest;

@RestController
@RequestMapping("users") 
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public String getUser() {
		return "get user called";
	}
	
	@PostMapping
	public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
		 UserRest returnValue = new UserRest();
		 
		 UserDto userDto= new UserDto();
		 BeanUtils.copyProperties(userDetails, userDto);
		 
		 UserDto createdUser = userService.createUser(userDto);
		 BeanUtils.copyProperties(createdUser, returnValue);
		 
		 return returnValue;
	}
	
	@PutMapping
	public String updateUser() {
		return  null;
	}
	
	@DeleteMapping
	public String deleteUser() {
		return null;
	}
	
	@GetMapping("/location")
	public List<UserEntity> getPatientBylocation() {
		List<UserEntity> patients = userService.getPatientByLocation();
		
		return patients;
	
	}
	
}
