/*package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.pojo.Users;
import com.example.service.UsersService;

@Controller
public class UsersDemoController {
	
	@Autowired
	UsersService usersService;
	
	private static List<Users> list = new ArrayList<>();
	static{ 
		Users u1 = new Users(1,"张山","男",25);
		Users u2 = new Users(2,"王五","男",20);
		Users u3 = new Users(3,"晓明","女",22);
		Users u4 = new Users(4,"小韩","女",26);
		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
	}
	
	//进入userIndex.html
	@RequestMapping("userIndex")
	public String userIndex() {
		return "userIndex";
	}
	
	//返回list到userList.html界面
	@RequestMapping("userList")
	public String userList(Model model) {
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
		list.add(user);
		return "userIndex";
	}
	//查询用户
	@RequestMapping("lookUp")
	public String lookup(int id,Model model) {
		for(Users u:list) {
			if(u.getId()==id) {
				model.addAttribute("lookup", u);
			}
		}
		return "lookup";
	}
	//新增和查询结合在一起
	@RequestMapping("addAndLookup")
	public String addAndLookup(Users u,Model model) {
		if(u.getId()!=-1) {
			list.add(u);
		}else {
			for(Users l:list) {
				if(l.getId()==u.getId()) {
					model.addAttribute("lookup", u);
				}
			}
		}
		return "lookup";
	}
}
*/