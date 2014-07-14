package com.arcadian.service2;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.arcadian.model.Status;
import com.arcadian.model.doctorsignup;

public interface interface2 {
	public Status doctorSignup(doctorsignup bean);
	public void saveImage(String filename, MultipartFile image);
	public Status login(String username,String password,String user_type);
	public List logincredential(String username);
}
