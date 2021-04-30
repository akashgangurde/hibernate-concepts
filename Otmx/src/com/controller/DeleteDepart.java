package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Depart;
import com.model.BLManager;

/**
 * Servlet implementation class DeleteDepart
 */
@WebServlet("/DeleteDepart")
public class DeleteDepart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BLManager bl = new BLManager();
	Depart d = new Depart();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteDepart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("did");
		int id1 = Integer.parseInt(id);
		d = bl.SearchById1(id1);
		System.out.println(d);
		bl.DeleteDepart(d);
		response.sendRedirect("ViewDepart.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
