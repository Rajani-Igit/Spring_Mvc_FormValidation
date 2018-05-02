package com.spring.app.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.app.dao.LoginDao;
import com.spring.app.vo.User;

@Service
public class LoginService {
	@Autowired
	LoginDao dao;
	public User loginById(String id){
		
		User user=dao.fetchUserById(id);
		if(user==null){
			
		}
		return user;
	}
public String saveUser(User user){
	return dao.saveUser(user);
}
}
