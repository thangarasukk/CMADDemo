package com.mydomain.model;

public class User {

	private Integer user_id;
	private String username ="";
	@Override
	public String toString() {
		return "\nUser [user_id=" + user_id + ", username=" + username + ", password=" + password + "]\n";
	}
	private String password="";

	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
