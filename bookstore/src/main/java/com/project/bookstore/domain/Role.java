package com.project.bookstore.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

//เมื่อไรที่เราต้องการใช้  hybernate JPA เพื่อจัดการเกี่ยวกับ database
//การ add @Entity annotation ลงบน class ,class นี้ จะ persist ไปที่ database 
@Entity
public class Role implements Serializable {
	
	@Id
	private int roleId;
	
	private String name;
	
	private Set<UserRole> userRoles = new HashSet<>();

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

}
