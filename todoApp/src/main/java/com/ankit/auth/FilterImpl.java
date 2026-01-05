package com.ankit.auth;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class FilterImpl implements Filter{
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		
		String IP = request.getLocalAddr();
		System.out.println("IP ADD- " + IP);
		
		
		HttpServletRequest httpReq = (HttpServletRequest) request;
		String url = httpReq.getRequestURI();
		
		if (url.contains("/todos/status") || url.contains("/status-test.html") || url.endsWith("/todos")) {
            chain.doFilter(request, response);
            return;
        }
		
		String req = request.getParameter("password");
		if("1234".equals(req)) {
			System.out.println("userAuthenticated");
			chain.doFilter(request, response);
			
		}else {
			response.getWriter().write("NOT authorized");
		}
		
		
	}

}
