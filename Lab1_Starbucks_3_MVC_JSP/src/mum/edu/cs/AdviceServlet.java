package mum.edu.cs;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mum.edu.data.*;
 
/**
 * Servlet implementation class AdviceServlet
 */
@WebServlet("/AdviceServlet")
public class AdviceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdviceServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//		
//		String roast = request.getParameter("roast");		
//		
//  		DataFacade data = (DataFacade) getServletContext().getAttribute("dataSource");
//		List<String> advice = data.getAdvice(roast);
//		String adviceOutput = prepareAdviceOutput(roast, advice);
//		
//		response.setContentType("text/html");
//		response.setHeader("Cache-Control", "no-cache");
//		PrintWriter writer = response.getWriter();
//		writer.println(adviceOutput);
		List<String> list =  Arrays.asList("light", "medium","dark");
		request.setAttribute("roasts", list);
		request.getRequestDispatcher("/WEB-INF/advice.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String roast = request.getParameter("roast");		
//		
  		DataFacade data = (DataFacade) getServletContext().getAttribute("dataSource");
		List<String> advice = data.getAdvice(roast);
  		request.setAttribute("roast", roast);
  		request.setAttribute("result", advice);
		request.getRequestDispatcher("/WEB-INF/display.jsp").forward(request, response);
		
	}
	
	

}
