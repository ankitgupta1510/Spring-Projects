package com.example;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class LogFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filter)
			throws IOException, ServletException {
		
		System.out.println("Filter is called");
		
		String password = req.getParameter("password");
		
		if("1234".equals(password)) {
			System.out.println("User authenticated");
			filter.doFilter(req, res);
		}else {
			System.out.println("wrong password");
			res.getWriter().write("Wrong password");
		}
		
		System.out.println("Requst ho gya");
		
	}

}
