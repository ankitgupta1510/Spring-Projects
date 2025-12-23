package com.ankit.service;

import java.util.List;

import com.ankit.entity.Todo;

public interface TodoService {
	
	List<Todo> getAllTodos(String id);
	
	Todo createTodo(String userId, String  taskTitle);

}
	