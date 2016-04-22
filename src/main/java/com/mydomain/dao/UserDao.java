package com.mydomain.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.mydomain.model.User;
import com.mydomain.service.HibernateUtil;

public class UserDao {


	public User getUser(Integer id) {
		Session ses = HibernateUtil.currentSession();
		System.out.println("UserDao.getUser()");
		try {
			System.out.println("UserDao.getUser() before crit");
			Criteria crit =  ses.createCriteria(User.class);
			crit.add(Restrictions.idEq(id));
			User u = (User)crit.uniqueResult();
			return u;
		} finally {
			HibernateUtil.closeSession();
		}
	}
	

	public List<User> getUsers() {
		Session ses = HibernateUtil.currentSession();
		System.out.println("UserDao.getUsers() ses = " + ses);
		try {
			List<User> list = ses.createCriteria(User.class).list();
			System.out.println("UserDao.getUsers() list = " + list);
			return list;
		} finally {
			HibernateUtil.closeSession();
		}
	}
	
}