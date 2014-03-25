package com.namoo.ns1.web.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/views/login.do")
public class Login extends HttpServlet {

	private static final long serialVersionUID = -8750750235987452832L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		if(true){
			//로그인성공
			RequestDispatcher dispatcher = req.getRequestDispatcher("./community/list.do");
			dispatcher.forward(req, resp);	
		}else{
			//로그인실패
		RequestDispatcher dispatcher = req.getRequestDispatcher("./error.jsp");
		dispatcher.forward(req, resp);
		}
	}

}
