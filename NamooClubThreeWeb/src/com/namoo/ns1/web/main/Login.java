package com.namoo.ns1.web.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.service.facade.TownerService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;
@WebServlet("/views/login.do")
public class Login extends HttpServlet {

	private static final long serialVersionUID = -8750750235987452832L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		TownerService service = NamooClubServiceFactory.getInstance().getTownerService();
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		service.loginAsTowner(email, password);
		
		if(service.loginAsTowner(email, password) == true){
			req.getSession().setAttribute("email", email);
			resp.sendRedirect("./community/list.do");
			System.out.println("빠밤~!! 로그인>_<");
		}else{
			req.getSession().removeAttribute("email");
			resp.sendRedirect("./error.jsp");
			System.out.println("다시 입력하세요");
		}
	}

}
