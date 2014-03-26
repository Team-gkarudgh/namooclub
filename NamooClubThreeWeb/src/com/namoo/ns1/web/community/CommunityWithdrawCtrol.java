package com.namoo.ns1.web.community;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;
@WebServlet("/communitywithdrawctrol.do")
public class CommunityWithdrawCtrol extends HttpServlet{

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
		HttpSession session = req.getSession();
		String communityId = req.getParameter("communityId");
		service.withdrawalCommunity(communityId, (String)session.getAttribute("email"));
		RequestDispatcher dispatcher = req.getRequestDispatcher("/communitylistctrol.do");
		dispatcher.forward(req, resp);
	}
}
