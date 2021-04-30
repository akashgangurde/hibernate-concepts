package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLManager;
import com.pojo.Depart;
import com.pojo.Emp;

/**
 * Servlet implementation class UpdateEmp
 */
@WebServlet("/UpdateEmp")
public class UpdateEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Emp e=new Emp();
	BLManager bl=new BLManager();
	//Depart d=new Depart();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String id1 = request.getParameter("eid");
		int id = Integer.parseInt(id1);
		e = bl.SearchById(id);

		
		HttpSession ses = request.getSession();
		ses.setAttribute("list", e);

		response.sendRedirect("UpdateEmp.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String eid = request.getParameter("eid");
		int id = Integer.parseInt(eid);
		String ename = request.getParameter("ename");
		String salary=request.getParameter("sal");
	    String dname=request.getParameter("dname");
		
	    Depart d=new Depart();
		
		d=bl.searchbyDname(dname);
		
		e.setEid(id);
		e.setEname(ename);
	    e.setSal(salary);
	    e.setDepart(d);
	   
	  
	
		System.out.println(ename + " " + eid+ " "+salary+" "+dname);
		bl.updateEmp(e);
	    response.sendRedirect("ViewEmp.jsp");
	}

}
