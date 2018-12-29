package com.fsoft.spring.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fsoft.spring.model.User;

@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void inserUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}

}
