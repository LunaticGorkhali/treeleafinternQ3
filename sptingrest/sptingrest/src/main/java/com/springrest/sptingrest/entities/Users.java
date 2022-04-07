package com.springrest.sptingrest.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user", schema = "question")
public class Users {
	@Id
	private long userId ;
	@Column
	private String username;
	@Column
	private String role;
	@Column
	private String permission;
	@Column
	private String password;
	
	public Users(long id, String username, String role, String permission,String password) {
		super();
		this.userId = id;
		this.username = username;
		this.role = role;
		this.permission = permission;
		this.password = password;
	}
	
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	public long getId() {
		return userId;
	}
	
	
	public void setId(long id) {
		this.userId = id;
	}

	@Basic
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Basic
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Basic
	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}
	
	@Basic
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Users [id=" + userId + ", username=" + username + ", role=" + role + ", permission=" + permission
				+ ", password=" + password + ", getId()=" + getId() + ", getUsername()=" + getUsername()
				+ ", getRole()=" + getRole() + ", getPermission()=" + getPermission() + ", getPassword()="
				+ getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
	
	
	
	
	
}
