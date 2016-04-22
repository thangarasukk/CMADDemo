package com.mydomain.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import com.mydomain.dao.UserDao;
import com.mydomain.model.User;

import junit.framework.Assert;

public class UserServiceTest {

	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testGetUser(){
		//valid id
		UserDao mockUserDao = mock(UserDao.class);
		User mockUser = new User();
		mockUser.setUsername("Thanga");
		Mockito.when(mockUserDao.getUser(1)).thenReturn(mockUser);
		
		UserService userService = new UserService();
		userService.setUserDao(mockUserDao);
		User user = userService.getUser(1);
		Assert.assertEquals("Thanga", user.getUsername());

		//null id
		Mockito.when(mockUserDao.getUser(null)).thenThrow(new IllegalArgumentException("null id"));
		User userNull = userService.getUser(null);
		
	}
	
}