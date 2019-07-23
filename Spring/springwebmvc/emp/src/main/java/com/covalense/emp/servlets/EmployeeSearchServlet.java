package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;

/*@WebServlet(urlPatterns="/search",
			initParams= {
							@WebInitParam(name="actress",value="basanthi")
						}
			)*/
@WebServlet("/search")
public class EmployeeSearchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		// send the response to the browser
				PrintWriter out = resp.getWriter();
				//validate the session
		HttpSession httpSession=req.getSession(false);
		ServletContext ctx = getServletContext();
		RequestDispatcher dispatcher = null;

		if(httpSession==null) {
			//Invalid session; Generate Login page
			out.println("<center><span style=\"color: red;\"font-size:\"60px\"\">Invalid credentials!!!</span></center>");
			dispatcher=req.getRequestDispatcher("index.html");
			dispatcher.include(req,resp);
		}else {
			//valid session; Generate proper response
			String idValue = req.getParameter("id");
			// Interact with DB
			EmployeeDAO dao = EmployeeDAOFactory.getInstance();
			EmployeeInfoBean bean = dao.getEmployeeInfo(idValue);
			if (bean == null) {
				dispatcher = req.getRequestDispatcher("index.html");
				dispatcher.include(req, resp);
				out.print("<HTML>");
				out.print("<BODY>");
				out.print("<H1><span style=\"color: blue\">Employee not found!!!</H1></span>");
				out.print("</BODY>");
				out.print("</HTML>");
			} else {
				dispatcher = req.getRequestDispatcher("search.html");
				dispatcher.include(req, resp);
				out.print("<HTML>");
				out.print("<BODY>");
				out.print("<H1><span style=\"color: blue\">Employee found...</H1></span>");
				out.print("<BR>");
				out.print("<BR> Id of employee is: " + bean.getId());
				out.print("<BR> Name of employee is: " + bean.getName());
				out.print("<BR> Gender is: " + bean.getGender());
				out.print("<BR> Age is: " + bean.getAge());
				out.print("<BR> Salary is: " + bean.getSalary());
				out.print("<BR> Phone no. is: " + bean.getPhone());
				out.print("<BR> Email id is: " + bean.getEmail());
				out.print("<BR> joining date is: " + bean.getJoiningDate());
				out.print("<BR> accountNumber is: " + bean.getAccountNumber());
				out.print("<BR> Designation is: " + bean.getDesignation());
				out.print("<BR> DOB is: " + bean.getDob());
				out.print("<BR> Department id is: " + bean.getDepartmentId());
				out.print("<BR> Manager id is: " + bean.getManagerId());

				out.print("</BODY>");
				out.print("</HTML>");
			}
			
		}
		
		
		// Get the object from forward servlet
		// EmployeeInfoBean empInfo=(EmployeeInfoBean)req.getAttribute("info");
		/*
		 * EmployeeInfoBean empInfo=(EmployeeInfoBean)ctx.getAttribute("info");
		 * if(empInfo==null) { out.print("<HTML>"); out.print("<BODY>"); out.
		 * print("<H1><span style=\"color: blue\">EmployeeInfoBean object not found!!!</H1></span>"
		 * ); out.print("</BODY>"); out.print("</HTML>"); }else {
		 * 
		 * out.print("<HTML>"); out.print("<BODY>"); out.
		 * print("<H1><span style=\"color: blue\">EmployeeInfoBean object found...</H1></span>"
		 * ); out.print("<BR>"); out.print("<BR> Id of employee is: " +
		 * empInfo.getId()); out.print("<BR> Name of employee is: " +
		 * empInfo.getName()); out.print("<BR> Phone no. is: " + empInfo.getPhone());
		 * out.print("<BR> Email id is: " + empInfo.getEmail()); out.print("</BODY>");
		 * out.print("</HTML>"); }
		 */
	}
}
