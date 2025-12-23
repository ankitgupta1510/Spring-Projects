package com.ankit.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ankit.entity.Todo;
import com.ankit.entity.User;
import com.ankit.service.TodoService;

public class TodoServiceImpl implements TodoService {

	Map<String, List<Todo>> todoList = new HashMap<>();

	@Override
	public List<Todo> getAllTodos(String id) {
		// TODO Auto-generated method stub
		
		List<Todo> prev = todoList.get(id);
		
		if(prev == null) {
			return new ArrayList<>();
		}else
		return prev;
	}

	@Override
	public Todo createTodo(String userId, String taskTitle) {

		Todo newTodo = new Todo(String.valueOf(System.currentTimeMillis()), userId, taskTitle);
//		newTodo.setId("1");
//		newTodo.setTitle(taskTitle);
//		newTodo.setUserId(userId);

		List<Todo> myTodo = todoList.get(userId);
		if (myTodo == null) {
			myTodo = new ArrayList<Todo>();
			todoList.put(userId, myTodo);
		}
		
		myTodo.add(newTodo);
		return newTodo;

	}

}
