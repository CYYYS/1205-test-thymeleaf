package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.pojo.Users;
import com.example.repository.UsersRepository;
import com.example.service.UsersService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	
	@Autowired
	UsersRepository usersRepository;
	
	@Test
	public void contextLoads() {
	}
	/**
	 * 测试添加数据
	 * */
	@Test
	public void addUser() {
		Users u1 = new Users(1,"张山","男",25);
		Users u2 = new Users(2,"王五","男",20);
		Users u3 = new Users(3,"晓明","女",22);
		Users u4 = new Users(4,"小韩","女",26);
		usersRepository.saveAndFlush(u1);
		usersRepository.saveAndFlush(u2);
		usersRepository.saveAndFlush(u3);
		usersRepository.saveAndFlush(u4);
	}
	@Test
	public void findById() {
		Users users = usersRepository.findById(1);
		System.out.println(users);
	}
}
