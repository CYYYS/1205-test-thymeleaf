package com.example.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pojo.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Serializable>{
	//查询所有
	public List<Users> findAll();
	//根据用id查询单个用户
	public Users findById(int id);
}
