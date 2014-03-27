package com.namoo.ns1.web.community;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.web.controller.LoginRequired;

@WebServlet("/communitymainctrol.do")
@LoginRequired
public class CommunityMainCtrol extends HttpServlet {

	private static final long serialVersionUID = 6547042998001964975L;
	
	@Override
	protected void process(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException{
		System.out.println("로그인 완료");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(CommunityPageConstants.Main_Page);
		dispatcher.forward(req, resp);
	}

}
