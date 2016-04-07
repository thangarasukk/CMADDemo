package com.mydomain.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserService {

	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<User> getUsers(){
		User u = new User();
		List<User> users = new ArrayList<User>();
		users.add(u);
		return users;
	}

	
	public void createUser(User u){
		
	}

	public void updateUser(User u){
		
	}
	
	public boolean deleteUser(@PathParam("param") Integer id){
		return false;
		
	}
}
