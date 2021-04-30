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
 * Servlet implementation class UpdateDepart
 */
@WebServlet("/UpdateDepart")
public class UpdateDepart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Depart d = new Depart();
	BLManager bl = new BLManager();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateDepart() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id1 = request.getParameter("did");
		int id = Integer.parseInt(id1);
		d = bl.SearchById1(id);
		// System.out.println(d);

		HttpSession ses = request.getSession();
		ses.setAttribute("list", d);

		response.sendRedirect("UpdateDepart.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		String did = request.getParameter("did");
		int id = Integer.parseInt(did);
		String dname = request.getParameter("dname");
		d.setDid(id);
		d.setDname(dname);
		System.out.println(dname + " " + did);
		bl.updateDepart(d);
	    response.sendRedirect("ViewDepart.jsp");
	}

}
