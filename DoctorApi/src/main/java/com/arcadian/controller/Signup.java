package com.arcadian.controller;

import java.util.Calendar;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.arcadian.model.Status;
import com.arcadian.model.doctorsignup;
import com.arcadian.service2.interface2;

@Controller
public class Signup {
	
	@Autowired
	interface2 doctor;
	Status status=new Status();
	
	Calendar cal=Calendar.getInstance();	
	String time1=cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND);
	String date1=cal.get(Calendar.DATE)+""+cal.get(Calendar.MONTH)+""+cal.get(Calendar.YEAR);
	String image_name="";
	JSONObject signup=new JSONObject();
	
	
	
	//Doctor Signup
	
	@RequestMapping(value="/doctorSignup",method=RequestMethod.POST)
	@ResponseBody
	public JSONObject save(@RequestParam("username") String username,@RequestParam("name") String name,@RequestParam("email") String email,
							@RequestParam(required = false) MultipartFile image
							,@RequestParam("qualification") String qualification,@RequestParam("experience") String experience
							,@RequestParam("speciality") String speciality,@RequestParam("location") String location
							,@RequestParam("city") String city,@RequestParam("phnno") String phnno,@RequestParam("password") String password,@RequestParam("user_type") String user_type)
	
	{	
		System.out.println("doen");
		
		image_name=date1+"-"+time1+"-"+image.getOriginalFilename();
		List list=doctor.logincredential(username);
		if(list.isEmpty())
		{
			doctor.saveImage(image_name, image);
			doctorsignup bean=new doctorsignup(name, email, username, qualification, experience, speciality, location, city, phnno, password, image_name,user_type);
			doctor.login(username, password, user_type);
			status=doctor.doctorSignup(bean);
			signup.put("result",status);
			return signup;
		}
		else
		{
			status.setId(0);
			status.setMessage("user already exists");
			signup.put("result",status);
			return signup;
		}
		
		
	}
	
	
	
	//Patient signup
	
	

}
