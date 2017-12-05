package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pojo.Users;
import com.example.repository.UsersRepository;
@Service
public class UsersService {
	/**
	 * 查询所有的用户
	 * */
	@Autowired
	UsersRepository usersRepository;
	public List<Users> findAll(){
		List<Users> list = usersRepository.findAll();
		return list;
	}
	/**
	 * 根据id查询单个用户
	 * */
	public Users findById(int id) {
		Users user = usersRepository.findById(id);
		return user;
	}
	/**
	 *增加用户 
	 **/
	public Users save(Users users) {
		Users u = usersRepository.saveAndFlush(users);
		return u;
	}
}
