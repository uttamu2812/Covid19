package com.covid19app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid19app.entity.UserEntity;



@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
	UserEntity findByEmail(String email);
	UserEntity findByPhoneNumber(String phoneNumber);
	
//	List<UserEntity> findByInfected_status(Boolean infected_status);
//	UserEntity findByLocation(String location);
//	UserEntity findByInfected_status(Boolean infected_status);

}
