package com.arcadian.list;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;


import com.arcadian.model.doctorsignup;

public class RowExtractorlogin  implements ResultSetExtractor<doctorsignup> {

	public doctorsignup extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {
		doctorsignup bean = new doctorsignup();
		
		bean.setUsername(resultSet.getString("username"));
		
		
		return bean;
	}

}

