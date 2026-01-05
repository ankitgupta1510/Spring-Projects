//package com.ankit.API;
//
//import java.io.IOException;
//import java.util.List;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import com.ankit.entity.Todo;
//import com.ankit.service.TodoService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//public class TodoServlet extends HttpServlet {
//	
//	private TodoService todoService;
//	
//	ObjectMapper om = new ObjectMapper();
//	
//	
//	@Override
//	public void init() throws ServletException {
//		// TODO Auto-generated method stub
//		super.init();
//		
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		todoService = ac.getBean("todoService",TodoService.class);
//	}
//	
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
////		resp.setContentType("application/json");
//		
//		String uid = req.getParameter("userId");
//		String title = req.getParameter("title");
//		Todo savedTodo = todoService.createTodo(uid, title);
//		
//		
//		String responseJson = om.writeValueAsString(savedTodo);
//		
//		resp.getWriter().write(responseJson);
//	}
//	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
//		//resp.setContentType("application/json");
//		
//		String userId = req.getParameter("userId");
//		List<Todo> todos = todoService.getAllTodos(userId);
//		
//		String jsonResp = om.writeValueAsString(todos);
//		
//		resp.getWriter().write(jsonResp);
//	
//		
//		
//	}
//
//}
