package com.employee.tasktracker.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.tasktracker.model.User;
import com.employee.tasktracker.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	
	private UserRepository userRepository;
	
	public Optional<User> findByUsername(String username)
	{
		return userRepository.findByUsername(username);
	}

}
