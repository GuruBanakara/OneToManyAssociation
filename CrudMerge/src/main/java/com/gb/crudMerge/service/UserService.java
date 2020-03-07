package com.gb.crudMerge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.gb.crudMerge.dao.UserDao;
import com.gb.crudMerge.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao dao;

	public User save(@RequestBody User user) {
		return dao.save(user);

	}

	public List<User> findAll() {
		return dao.findAll();
	}

	public void deleteById(int id) {
		dao.deleteById(id);
	}

}
