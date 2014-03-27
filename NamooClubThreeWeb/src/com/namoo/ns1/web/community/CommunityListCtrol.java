package com.namoo.ns1.web.community;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;
import com.namoo.ns1.web.controller.DefaultController;
import com.namoo.ns1.web.controller.LoginRequired;

import dom.entity.Community;

@WebServlet("/communitylistctrol.do")
@LoginRequired
public class CommunityListCtrol extends DefaultController {
	private static final long serialVersionUID = 6547042998001964975L;

	@Override
	protected void process(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		String email = (String)session.getAttribute("email");
		CommunityService service = NamooClubServiceFactory.getInstance().getCommunityService();
		List<Community> list = service.findAllCommunities();
		List<Community> myList = service.findBelongCommunities(email);
		
		filtering(list, myList);
		
		req.setAttribute("list", list);
		req.setAttribute("myList", myList);
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(CommunityPageConstants.List_Page);
		dispatcher.forward(req, resp);
		
		
	}

	private void filtering(List<Community> list, List<Community> myList) {
		List<Community> remove = new ArrayList<Community>();
		
		for(Community community : list) {
			for(Community mycommunity : myList) {
				if(community.getName().equals(mycommunity.getName())) {
					remove.add(community);
				}
			}
		}
		if(!remove.isEmpty()) {
			list.removeAll(remove);
		}
	}

}
