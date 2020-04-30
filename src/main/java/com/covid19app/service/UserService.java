package com.covid19app.service;

import java.util.List;

import com.covid19app.dto.UserDto;
import com.covid19app.entity.UserEntity;

public interface UserService {
	UserDto createUser(UserDto user);
	List<UserEntity> getPatientByLocation(String infectedStatus, String location);
	List<UserEntity> getLocationByPatient();
	//List<UserEntity> getInfectedPersonByLocation(Boolean infectedStatus, String location);
	List<UserEntity> getUserByInfectedStatus(String infectedStatus);
}
