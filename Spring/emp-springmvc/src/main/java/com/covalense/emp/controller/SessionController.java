package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.dto.UserBean;

@Controller
@RequestMapping("/session")
public class SessionController {
	
	@GetMapping("/loginForm")
	public String getLoginForm() {
		return "myForm";
	}//End of getLoginForm()
	
	@PostMapping("/login")
	public String loginAuthenticate(UserBean userBean,HttpServletRequest req) {
		if(userBean.getId()==101 && userBean.getPassword().equals("123"))
		{
			HttpSession httpSession=req.getSession(true);
			return " ";
		}
		return null;
	}//End of loginAuthenticate()
	
}//End of SessionController
