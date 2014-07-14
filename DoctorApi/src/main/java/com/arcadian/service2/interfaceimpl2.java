package com.arcadian.service2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.arcadian.model.Status;
import com.arcadian.model.doctorsignup;
import com.arcadian.service.interface1;

@Service
public class interfaceimpl2 implements interface2
{
	@Autowired
	interface1 i;
	public Status doctorSignup(doctorsignup bean)
	{
		return i.doctorSignup(bean);
	}
	public void saveImage(String filename, MultipartFile image)
	{
		 i.saveImage(filename, image);
	}
	public Status login(String username,String password,String user_type)
	{
		return i.login(username, password, user_type);
	}
	public List logincredential(String username)
	{
		return i.logincredential(username);
	}
	
}
