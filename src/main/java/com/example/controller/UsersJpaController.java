package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.pojo.Users;
import com.example.service.UsersService;

@Controller
public class UsersJpaController {
	
	@Autowired
	UsersService usersService;
	
	//进入userIndex.html
	@RequestMapping("userIndex")
	public String userIndex() {
		return "userIndex";
	}
	
	//返回list到userList.html界面
	@RequestMapping("userList")
	public String userList(Model model) {
		List<Users> list = usersService.findAll();
		model.addAttribute("list", list);
		return "userList";
	}
	//跳转到add页面
	@RequestMapping("add")
	public String add() {
		return "add";
	}
	//新增用户
	@RequestMapping("adduser")
	public String adduser(Users user) {
		usersService.save(user);
		return "userIndex";
	}
	//查询用户
	@RequestMapping("lookUp")
	public String lookup(int id,Model model) {
		Users user = usersService.findById(id);
		model.addAttribute("lookup", user);
		return "lookup";
	}
	
	//合并新增和查询,跳转同一个页面
	@RequestMapping("addAndLookUp")
	public String addAndLookUp(int id,Model model) {
		//如果ID为-1,说明不是查询用户,是增加用户,否则是查询用户
		if(id!=-1) {
			Users user = usersService.findById(id);
			model.addAttribute("lookup", user);
		}else {
			Users user = new Users();
			model.addAttribute("lookup",user);
		}
		return "addAndLookUp";
	}
	
}
