package com.covid19app;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid19app.entity.UserEntity;





@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
	UserEntity findByEmail(String email);
	UserEntity findByPhoneNumber(String phoneNumber);
//	List<UserEntity> findByInfectedStatusAndLocation(Boolean infectedStatus, String location);
	List<UserEntity> findByInfectedStatus(String infectedStatus);
	List<UserEntity> findByInfectedStatusAndLocation(String infectedStatus, String location);



}
