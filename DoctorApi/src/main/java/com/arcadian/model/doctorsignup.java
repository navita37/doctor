package com.arcadian.model;

public class doctorsignup {
	String name,email,username,qualification,experience,speciality,location,city,phnno,password,image,user_type;

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
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

	public String getPhnno() {
		return phnno;
	}

	public void setPhnno(String phnno) {
		this.phnno = phnno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public doctorsignup(String name, String email, String username,
			String qualification, String experience, String speciality,
			String location, String city, String phnno, String password,
			String image,String user_type) {
		super();
		this.name = name;
		this.email = email;
		this.username = username;
		this.qualification = qualification;
		this.experience = experience;
		this.speciality = speciality;
		this.location = location;
		this.city = city;
		this.phnno = phnno;
		this.password = password;
		this.image = image;
		this.user_type=user_type;
	}
public doctorsignup() {
	// TODO Auto-generated constructor stub
}
	

}
