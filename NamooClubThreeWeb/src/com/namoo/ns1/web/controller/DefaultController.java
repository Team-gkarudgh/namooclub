package com.namoo.ns1.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class DefaultController extends HttpServlet{

	private static final long serialVersionUID = 4882248444263287396L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		if(this.getClass().getAnnotation(LoginRequired.class) != null){
			System.out.println("로그인이 필요합니다.");
		}else{
			process(req, resp);
		}
	}
	
	protected abstract void process(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException;

}
