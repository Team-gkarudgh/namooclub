package com.namoo.ns1.web.community;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.facade.TownerService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;
import com.namoo.ns1.service.logic.CommunityServiceLogic;

import dom.entity.Community;
import dom.entity.CommunityManager;
import dom.entity.CommunityMember;
@WebServlet("/views/community/join.do")
public class Join extends HttpServlet {

	private static final long serialVersionUID = 691935663117063100L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		String communityName = getInitParameter("communityName");
		String name = getInitParameter("name");
		String email = getInitParameter("email");
		String password = getInitParameter("password");

		CommunityService service = NamooClubServiceFactory.getInstance().getCommunityService();
		service.joinAsMember(communityName, name, email, password);
				System.out.println(name);
				
		RequestDispatcher dispatcher = req.getRequestDispatcher("./join.jsp");
		dispatcher.forward(req, resp);

	}

}
