package com.ankit.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Todo {
	
	private String id;
	private String title;
	private String userId;
	private Boolean isActive;
	
	
	public Todo() {}
	
	public Todo(String id, String title, String userId, Boolean isActive) {
		
		this.id = id;
		this.title = title;
		this.userId = userId;
		this.isActive = isActive;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}
