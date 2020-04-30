package com.covid19app.ui.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/{infectedStatus}")
	public List<UserEntity> getUserByInfectedStatus (@PathVariable String infectedStatus){
		List<UserEntity> list = userService.getUserByInfectedStatus(infectedStatus);
		
		return list;
	}
	
	
	@GetMapping("/{infectedStatus}/{location}")
	public List<UserEntity> getUserByInfectedStatusAndLocation(@PathVariable String infectedStatus ,@PathVariable String location){
		List<UserEntity> patientLocation = userService.getPatientByLocation(infectedStatus,location);
		
		return patientLocation;
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
	
	
}
