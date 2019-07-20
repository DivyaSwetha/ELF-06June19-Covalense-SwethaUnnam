package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;
import com.covalense.emp.util.HibernateUtil;
@WebServlet("/empsearch")
public class SearchServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String idValue=req.getParameter("id");
	int empId=Integer.parseInt(idValue);
	
	PrintWriter out=resp.getWriter();
	EmployeeDAO dao=EmployeeDAOFactory.getInstance();
	List<EmployeeInfoBean> emps=dao.getAllEmployeeInfo();
	Session session=HibernateUtil.openSession();
	Query query=session.createQuery("from EmployeeInfoBean e where str(e.id) LIKE '"+empId+"%'");
	List<EmployeeInfoBean> resBeans=query.list();
	RequestDispatcher dispatcher=req.getRequestDispatcher("search.html");
	dispatcher.include(req, resp);
	out.println("<table style=\"width:100%\"> ");
	out.println("  <tr>                       ");
	out.println("    <th>Employee Id</th>     ");
	out.println("    <th>Employee Name</th>   ");
	out.println("  </tr>                      ");
	for(EmployeeInfoBean ebeans:resBeans) {
		out.println("  <tr>                       ");
		out.println("    <td>"+ebeans.getId()+"</td>            ");
		out.println("    <td>"+ebeans.getName()+" </td>           ");
		out.println("  </tr>                      ");
		out.println("                             ");
		out.println("</table>                     ");
		out.println("<a href=\"./fetch\">"+ebeans.getId()+"</a>");
	}
	
	
	
	}
}
