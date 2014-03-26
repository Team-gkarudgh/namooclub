package com.namoo.ns1.web.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;
@WebServlet("/join.do")
public class Join extends HttpServlet {

	private static final long serialVersionUID = -8750750235987452832L;

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
				
		RequestDispatcher dispatcher = req.getRequestDispatcher(MainPageConstants.Join_Page);
		dispatcher.forward(req, resp);
		
	}

}
