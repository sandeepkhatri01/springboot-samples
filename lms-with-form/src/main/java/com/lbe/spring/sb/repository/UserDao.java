package com.lbe.spring.sb.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	private static Map<String, String> records;

	static {
		records = new HashMap<String, String>();
		records.put("Sandeep", "ADMIN");
		records.put("Rahul", "NONE");
	}

	public boolean isValidUser(String userName) {
		return records.get(userName) != null;
	}
	
	public String getRole(String username){
		return records.get(username);
	}

}
