package com.ankit.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankit.entity.Todo;
import com.ankit.service.TodoService;

@Service
public class TodoServiceImplJDBC implements TodoService {
	
	@Autowired
	private DataSource dataSource;
	

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<Todo> getAllTodos(String userId) {
		List<Todo> todos = new ArrayList<Todo>();
		String query = "SELECT * FROM todos WHERE user_id = ?";
		
		Connection con = null;
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, userId);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id");
				String uId = rs.getString("user_id");
				String title = rs.getString("title");
				Boolean status = rs.getBoolean("is_active");
				
				Todo todo = new Todo(id,title,uId,status);
				todos.add(todo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return todos;
	}

	@Override
	public Todo createTodo(String userId, String taskTitle) {
		String randomId = String.valueOf(System.currentTimeMillis());
		
		Todo newTodo = new Todo(randomId,taskTitle,userId,true);
		
		String query = "INSERT INTO todos(id,title,user_id , is_active) VALUES (?,?,?,?)";
		
		Connection conn = null;
		try {
			
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setString(1, newTodo.getId());
			ps.setString(2, newTodo.getTitle());
            ps.setString(3, newTodo.getUserId());
            ps.setBoolean(4, true);
            
            ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return newTodo;
		
	}
	
	public void updateTodoStatus(String todoId,boolean isActive) {
		String query = "UPDATE todos SET is_active = ? WHERE id = ?";
		Connection con = null;
		
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setBoolean(1, isActive);
			ps.setString(2, todoId);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	 
		
	}
	

}
