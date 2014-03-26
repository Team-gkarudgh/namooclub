package com.namoo.ns1.web.community;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;

import dom.entity.Community;

@WebServlet("/communitylistctrol.do")
public class CommunityListCtrol extends HttpServlet {

	private static final long serialVersionUID = 6547042998001964975L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		CommunityService service = NamooClubServiceFactory.getInstance().getCommunityService();
		
		java.util.List<Community> list = service.findAllCommunities();
		
		req.setAttribute("list", list);
		
		System.out.println(list);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(CommunityPageConstants.List_Page);
		dispatcher.forward(req, resp);
		
	}

}
