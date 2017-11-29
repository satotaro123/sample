package com.example.sample;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.sample.User;



@Service
public class UserService  {
	
	@Autowired
	private UserRepository repository;
	
	@Transactional
    public void registerUser(Integer id,String name) {
		User user = new User(id,name);
        repository.save(user);
    }

}



