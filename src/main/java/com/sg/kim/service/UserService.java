// /sbootblog/src/main/java/com/sg/leo/service/UserService.java
package com.sg.kim.service;

import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sg.kim.domain.RoleType;
import com.sg.kim.domain.User;
import com.sg.kim.repository.UserRepository;



@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public void insertUser(User user) {
		user.setRole(RoleType.USER);
		userRepository.save(user);
	}
	
	@Transactional(readOnly = true)
	public User getUser(String username) {
		User findUser = userRepository.findByUsername(username).orElseGet(
				new Supplier<User>() {
					@Override
					public User get() {
						return new User();
					}
				});
		return findUser;
	}
}