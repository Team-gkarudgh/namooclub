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
@WebServlet("/communityjoinpagectrol.do")
public class CommunityJoinPageCtrol extends HttpServlet{
	private static final long serialVersionUID = -6619131050370326764L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		CommunityService service = NamooClubServiceFactory.getInstance().getCommunityService();
		
		String communityId = req.getParameter("communityId");
		Community community = service.findCommunity(communityId);
		
		String communityName = community.getName();
		String description = community.getDescription();
		
		req.setAttribute("communityName", communityName);
		req.setAttribute("description", description);
		req.setAttribute("communityId", communityId);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/community/join.jsp");
		dispatcher.forward(req, resp);
	}
	

}
