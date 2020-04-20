package com.covid19app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "location")
public class LocationEntity implements Serializable {

	private static final long serialVersionUID = 7818947221365909882L;
	
	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false)
	private String userId;
	
	@Column(nullable = false)
	private String location;
	
	@Column(nullable = false)
	private String city;
	
	@Column(nullable = false)
	private String pinCode;

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

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
	


}
