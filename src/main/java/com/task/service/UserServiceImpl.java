package com.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.entity.User;
import com.task.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public void saveUser(User user) {
		userRepo.save(user);
	}

	@Override
	public User findByLoginId(String loginId) {
		return userRepo.findByLoginId(loginId);
	}

	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}
}
