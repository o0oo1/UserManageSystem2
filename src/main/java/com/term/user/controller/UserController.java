package com.term.user.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.term.user.entity.User;
import com.term.user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<User> userList = userService.findAll();
		model.addAttribute("userList", userList);
		return "main";
	}
	
	@RequestMapping("/getUserData")
	@ResponseBody
	public List<User> getUserData(Model model) {
		System.out.println("getUserData...");
		return userService.findAll();
	}
	
	@RequestMapping("/getUserByPage")
	@ResponseBody
	public Map<String, Object> getUserByPage(Integer page, Integer rows) {
		return userService.findByPage(page, rows);
		
	}
}
