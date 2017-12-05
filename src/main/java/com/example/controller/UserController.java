package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.pojo.User;

@Controller
public class UserController {
	@RequestMapping(value="index")
	
	public String index(HttpSession session) {
		User user = new User();
		user.setAge(10);
		user.setName("小黑");
		session.setAttribute("user", user);
		return "index";
	}
	@RequestMapping(value="index2")
	public String index2(Model model) {
		List<User> list = new ArrayList<>();
		User user = new User();
		user.setAge(10);
		user.setName("小黑");
		User user1 = new User();
		user1.setAge(1);
		user1.setName("小白");
		list.add(user);
		list.add(user1);
		model.addAttribute("list", list);
		return "index";
	}
}
