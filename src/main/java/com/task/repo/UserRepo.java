package com.task.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.entity.User;

public interface UserRepo extends JpaRepository<User, Serializable> {
	User findByLoginId(String loginId);

}
