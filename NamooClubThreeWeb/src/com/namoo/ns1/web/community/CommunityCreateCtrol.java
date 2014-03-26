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
@WebServlet("/communitycreatectrol.do")
public class CommunityCreateCtrol extends HttpServlet {

	private static final long serialVersionUID = -1894070412146334568L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String communityId = req.getParameter("communityName");
		String description = req.getParameter("description");
		String email = (String) req.getSession().getAttribute("email");
				
		CommunityService service = NamooClubServiceFactory.getInstance().getCommunityService();
		service.registCommunity(communityId, description, email);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(CommunityPageConstants.Create_Page);
		dispatcher.forward(req, resp);
	
	}

}
