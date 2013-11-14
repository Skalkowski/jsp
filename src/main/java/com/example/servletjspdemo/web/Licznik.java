package com.example.servletjspdemo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.servletjspdemo.domain.Counter;

@WebServlet("/licznik")
public class Licznik extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)	throws ServletException, IOException {
		res.setContentType("text/html");

		HttpSession session = req.getSession();
		
		if (session.getAttribute("lokalny") == null)
			session.setAttribute("lokalny", new Counter());
		
		Counter tempLokalny = (Counter) session.getAttribute("lokalny");
		
		tempLokalny.increment();
		
		Counter tempGlobalny = (Counter) getServletContext().getAttribute("globalny");
		
		tempGlobalny.increment();
		PrintWriter out = res.getWriter();
		
		
		
		out.println("<html><body><p>"+ "Licznik lokalny: " + tempLokalny.getCounter() + "<br>" + " Licznik globalny: " + tempGlobalny.getCounter() + "<br> dziekuje za wspolprace"+"</p></body></html>");
		out.close();

		
	}
	public void init() throws ServletException{
		getServletContext().setAttribute("globalny", new Counter());
	}
}
