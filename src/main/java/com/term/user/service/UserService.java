package com.term.user.service;

import java.util.List;
import java.util.Map;

import com.term.user.entity.User;

public interface UserService {
	List<User> findAll();
	
	//分页
	Map<String, Object> findByPage(Integer page, Integer rows);
}
