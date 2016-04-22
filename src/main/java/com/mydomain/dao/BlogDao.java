package com.mydomain.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.mydomain.model.Blog;
import com.mydomain.service.HibernateUtil;

public class BlogDao {


//	public Blog getBlog(Integer id) {
//		Session ses = HibernateUtil.currentSession();
//		try {
//			Criteria crit =  ses.createCriteria(User.class);
//			crit.add(Restrictions.idEq(id));
//			User u = (User)crit.uniqueResult();
//			return u;
//		} finally {
//			HibernateUtil.closeSession();
//		}
//	}
	

	public List<Blog> getBlogs() {
		Session ses = HibernateUtil.currentSession();
		try {
			return ses.createCriteria(Blog.class).list();
		} finally {
			HibernateUtil.closeSession();
		}
	}
	
}