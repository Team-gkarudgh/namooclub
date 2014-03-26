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
@WebServlet("/communityremovectrol.do")
public class CommunityRemoveCtrol extends HttpServlet{

	private static final long serialVersionUID = -6860106695571437803L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		CommunityService service = NamooClubServiceFactory.getInstance().getCommunityService();
		
		String communityName = req.getParameter("communityName");
		
		service.removeCommunity(communityName);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/communitylistctrol.do");
		dispatcher.forward(req, resp);
	}

}
