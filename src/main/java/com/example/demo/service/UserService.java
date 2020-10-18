package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.login.domain.model.User;
import com.example.demo.repository.UserDao;

@Service
public class UserService {
	@Autowired
	@Qualifier("UserDaoJdbcImpl2")
	UserDao dao;

	public boolean insert(User user) {
		int rowNumber = dao.insertOne(user);

		boolean result = false;

		if(rowNumber > 0) {
			result = true;
		}

		return result;

	}

	public int count() {
		return dao.count();
	}

	public List<User> selectMany() {
		return dao.selectMany();
	}

	public User slectOne(String userId) {
		return dao.selectOne(userId);
	}

	public boolean updateOne(User user) {
		int rowNumber = dao.updateOne(user);
		boolean result = false;

		if(rowNumber > 0) {
			result = true;
		}

		return result;
	}

	public boolean deleteOne(String userId) {
		int rowNumber = dao.deleteOne(userId);

		boolean result = false;

		if(rowNumber > 0) {
			result = true;
		}

		return true;
	}
}
