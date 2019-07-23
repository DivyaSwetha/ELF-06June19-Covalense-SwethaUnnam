package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.util.HibernateUtil;

@Controller
@RequestMapping("/employeeportal")
public class EmployeeInfoController {
	@GetMapping("/index")
	public String getIndex() {
		return "myForm";
	}
	
	@PostMapping("/login1")
	public String getHome(EmployeeInfoBean empBean,ModelMap modelMap,HttpServletRequest req) {
		int userId=Integer.parseInt(req.getParameter("id"));
		String password=req.getParameter("password");
		Session session=HibernateUtil.openSession();
		EmployeeInfoBean emp=session.get(EmployeeInfoBean.class,userId);
		modelMap.addAttribute("empInfo", emp);
		if((emp!=null)&&(emp.getPassword().equals(emp.getPassword()))) {
			return "search";
		}else {
			String message="Invalid Credentials!!! please try again";
			modelMap.addAttribute("msg",message );
			return "loginfail";
		}
		
	}

}
