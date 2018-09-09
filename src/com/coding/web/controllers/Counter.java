package com.coding.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/")
public class Counter extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Counter() {
        super();
    }

    protected void doGet(HttpServletRequest request,
    		HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String cnt = session.getAttribute("cnt").toString();
        String str = "You have clicked this button " + cnt +" times";
    	request.setAttribute("str", str);
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/counter.jsp");
    	view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int cnt = (int) session.getAttribute("cnt");
        System.out.println("cnt is currently "+cnt);
        if(session.getAttribute("cnt")!= null) {cnt ++;}        
        session.setAttribute("cnt", cnt);
        doGet(request,response);
	}

}
