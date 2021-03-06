package com.namoo.ns1.web.club;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;
@WebServlet("/clubjoinctrol.do")
public class ClubJoinCtrol extends	HttpServlet{

	private static final long serialVersionUID = -1390693297338441671L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		CommunityService service = NamooClubServiceFactory.getInstance().getCommunityService();
		
		String communityName = getInitParameter("communityName");
		String email = (String) req.getSession().getAttribute("email");
		
		service.joinAsMember(communityName, email);
		
		System.out.println(communityName);

		RequestDispatcher dispatcher = req.getRequestDispatcher(ClubPageConstants.Join_Page);
		dispatcher.forward(req, resp);
	}

}
