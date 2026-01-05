package com.ankit.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ankit.entity.Todo;
import com.ankit.service.TodoService;

@RestController
public class TodoRest {

	@Autowired
	private TodoService todoService;

	@GetMapping("/todos")
	public List<Todo> getAllTodos(@RequestParam("userId") String userId) {

		return todoService.getAllTodos(userId);

	}
	
	@PostMapping("/todos")
	public Todo createTodo(@RequestParam("userId") String userId, @RequestParam("title") String title) {
		return todoService.createTodo(userId, title);
	}
	
	@PostMapping("/todos/status")
	public String toggleStatus(@RequestParam("id") String todoId, @RequestParam("isActive") boolean isActive) {

		todoService.updateTodoStatus(todoId, isActive);

		return "Status Updated to " + isActive;
	}

}
