package com.arcadian.list;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import com.arcadian.model.doctorsignup;

public class RowMapperlogin implements RowMapper<doctorsignup> {

	public doctorsignup mapRow(ResultSet resultSet, int arg1) throws SQLException {
		
		RowExtractorlogin userExtractor = new RowExtractorlogin();
		
		return userExtractor.extractData(resultSet);
	}

}

