package com.ankit.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import com.ankit.entity.Todo;
import com.ankit.service.TodoService;

public class TodoServiceImplJDBC implements TodoService {
	
	private DataSource dataSource;
	

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<Todo> getAllTodos(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Todo createTodo(String userId, String taskTitle) {
		String randomId = String.valueOf(System.currentTimeMillis());
		
		Todo newTodo = new Todo(randomId,userId,taskTitle);
		
		String query = "INSERT INTO todos(id,user_id,title) VALUES (?,?,?)";
		
		Connection conn = null;
		try {
			
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setString(1, newTodo.getId());
			ps.setString(2, newTodo.getUserId());
            ps.setString(3, newTodo.getTitle());
            
            ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return newTodo;
		
	}
	

}
