package com.spring.app.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.app.vo.User;

@Repository
public class LoginDao {
	@Autowired
	SessionFactory sessionfactory;
	public User fetchUserById(String id){
		User user=(User) sessionfactory.getCurrentSession().get(User.class,id);
		return null;
	}

	public String saveUser(User user){
		return (String) sessionfactory.getCurrentSession().save(user);
		
	}
}
