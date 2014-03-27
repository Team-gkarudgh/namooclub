package com.namoo.ns1.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public abstract class DefaultController extends HttpServlet{

	private static final long serialVersionUID = 4882248444263287396L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		if(this.getClass().getAnnotation(LoginRequired.class) != null){
			//세션에서 이메일파라미터로
			//로그인 햇는지안햇는지판단
			if(session.getAttribute("email")==null) {
				//로그인안됐을때->포워드로 로그인페이지로 가기
				RequestDispatcher dispatcher = req.getRequestDispatcher("/login.do");
				dispatcher.forward(req, resp);
			} 
			//로그인 됐을시 -> process(req, resp);
			process(req,resp);
			
		}
	}
	
	protected abstract void process(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException;

}
