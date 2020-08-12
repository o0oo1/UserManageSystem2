package com.term.user.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.term.user.dao.UserMapper;
import com.term.user.entity.User;
import com.term.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> findAll() {
		return userMapper.selectAll();
	}

	@Override
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		//开始分页
		PageHelper.startPage(page, rows);
		//获取数据
		List<User> list = userMapper.selectAll();
		//分页
		PageInfo<User> pageInfo = new PageInfo<User>(list);
		//获取记录数
		Long total = pageInfo.getTotal();
		//将数据放入map并返回
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("rows", list);
		map.put("total", total);
		return map;
	}

}
