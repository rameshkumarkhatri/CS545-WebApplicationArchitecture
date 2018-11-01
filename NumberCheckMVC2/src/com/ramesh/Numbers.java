package com.ramesh;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Numbers
 */
@WebServlet("/Numbers")
public class Numbers extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Numbers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int controlNumber = (int) (Math.random() * 50);
		int num1 = (int)( Math.random() * 50);
		int num2 = (int) (Math.random() * 50);
		int num3 = (int) (Math.random() * 50);
		request.setAttribute("control", controlNumber);		
		request.setAttribute("num1", num1);
		request.setAttribute("num2", num2);
		request.setAttribute("num3", num3);
		request.getRequestDispatcher("/WEB-INF/control.jsp").forward(request, response);

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
