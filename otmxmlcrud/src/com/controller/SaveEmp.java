package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Depart;
import com.pojo.Emp;


/**
 * Servlet implementation class SaveEmp
 */
@WebServlet("/SaveEmp")
public class SaveEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ename=request.getParameter("ename");
		String sal=request.getParameter("sal");
		String dname=request.getParameter("dname");
		
		Emp e=new Emp();
		BLManager bl=new BLManager();
		Depart d=new Depart();
		
		e.setEname(ename);
        e.setSal(sal);
		
		
		d=bl.searchbyDname(dname);
		
		e.setDepart(d);
		bl.saveEmp(e);
		response.sendRedirect("ViewEmp.jsp");
	}

}
