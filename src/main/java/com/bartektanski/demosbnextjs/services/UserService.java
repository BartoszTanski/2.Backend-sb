package com.bartektanski.demosbnextjs.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bartektanski.demosbnextjs.model.User;

@Service
public interface UserService {

	User saveUser(User user);

	List<User> getAllUsers();

	User getUserById(Long id);

	boolean deleteUser(Long id);

	User updateUser(Long id, User user);
	
}
