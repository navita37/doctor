package com.arcadian.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.arcadian.model.Status;
import com.arcadian.model.doctorsignup;

public interface interface1 {
	public Status doctorSignup(doctorsignup bean);
	public Status login(String username,String password,String user_type);
	public void saveImage(String filename, MultipartFile image);
	public List logincredential(String username);

}
