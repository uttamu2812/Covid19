package com.covid19app.service;

import java.util.List;

import com.covid19app.dto.UserDto;
import com.covid19app.entity.UserEntity;

public interface UserService {
	UserDto createUser(UserDto user);
	List<UserEntity> getPatientByLocation();
	List<UserEntity> getLocationByPatient();
}
