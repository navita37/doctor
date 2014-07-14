package com.arcadian.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import com.arcadian.list.RowMapperlogin;
import com.arcadian.model.Status;
import com.arcadian.model.doctorsignup;

@Service
public class interfaceimpl1 implements interface1
{

	@Autowired
	private DataSource dataSource;
	Status status =new Status();
	public Status doctorSignup(doctorsignup bean)
	{
		String sql = "insert into d_signup "
				+ "(email,password,name,username,experience,phnno,location,city,qualification,speciality,image) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
				JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
				try
				{
				int i=jdbcTemplate.update(
				sql,
				new Object[] {bean.getEmail(),bean.getPassword(),bean.getName()
						,bean.getUsername(),bean.getExperience()
						,bean.getPhnno(),bean.getLocation(),bean.getCity(),bean.getQualification()
						,bean.getSpeciality(),bean.getImage()});
				if(i>0)
				{
				status.setId(i);;
			    status.setMessage("registration suucessfully done");
				}
				else
				{
				status.setId(0);
				status.setMessage("Unsuucessful");
				}
				}
				catch(Exception e)
				{
			    status.setId(0);
			    status.setMessage("Exception"+e);
				}
	            return status;
	}
		//save image on folder
		public void saveImage(String filename, MultipartFile image) 
		{
			File file = new File("/var/lib/tomcat7/webapps/thanqueueimages/"+filename);
			try {
			FileUtils.writeByteArrayToFile(file, image.getBytes());
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			System.out.println("Go to the location:  " + file.toString()
        		 + " on your computer and verify that the image has been stored.");
		}
		
		//Credential
		public List logincredential(String username)
		{
			List list = new ArrayList();
			String sql="select username from login where username='"+username+"'";
			JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
			list=jdbcTemplate.query(sql, new RowMapperlogin());
			return list;
		}
		public Status login(String username,String password,String user_type)
		{
			String sql = "insert into signup "
					+ "(username,password,user_type) VALUES (?,?,?)";
					JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
					try
					{
					int i=jdbcTemplate.update(
					sql,
					new Object[] {username,password,user_type});
					if(i>0)
					{
					status.setId(i);;
				    status.setMessage("registration suucessfully done");
					}
					else
					{
					status.setId(0);
					status.setMessage("Unsuucessful");
					}
					}
					catch(Exception e)
					{
				    status.setId(0);
				    status.setMessage("Exception"+e);
					}
		            return status;
		}
}
