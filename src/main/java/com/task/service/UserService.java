package com.task.service;

import java.util.List;
import com.task.entity.User;

public interface UserService {

	void saveUser(User user);

	User findByLoginId(String loginId);

	List<User> getAllUser();
}
