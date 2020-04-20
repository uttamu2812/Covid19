package com.covid19app.dto;

import java.io.Serializable;
import java.sql.Date;

public class UserDto implements Serializable{
	
	private static final long serialVersionUID = -8447572765849021468L;
	private long id;
	private String userId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String password;
	private String encryptedPassword;
	private int age;
	private String location;
	private Double latitude;
	private Double longitude;
	private String city;
	private String pinCode;
	private Boolean infected_status = false ;
	private Date dateOfInfection;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Boolean getInfected_status() {
		return infected_status;
	}
	public void setInfected_status(Boolean infected_status) {
		this.infected_status = infected_status;
	}
	public Date getDateOfInfection() {
		return dateOfInfection;
	}
	public void setDateOfInfection(Date dateOfInfection) {
		this.dateOfInfection = dateOfInfection;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	

}
