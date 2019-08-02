package com.covalense.emp.controller;

import static com.covalense.emp.common.EmpConstants.PROPERTIES_FILE;
import static com.covalense.emp.common.EmpConstants.DB_INTERACTION_TYPE;
import static com.covalense.emp.common.EmpConstants.VIEW_LOGIN_PAGE;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dto.EmployeeInfoBean;

@Controller
@RequestMapping("/login")
@PropertySource(PROPERTIES_FILE)
public class LoginController {
	
	@Autowired
	@Qualifier(DB_INTERACTION_TYPE)
	EmployeeDAO dao;
	
	@GetMapping("/loginpage")
	public String getIndex() {
 		return VIEW_LOGIN_PAGE;
	}
	
	@PostMapping("/authenticate")
	public String authenticate(int id,String password,ModelMap modelMap, HttpServletRequest req,@Value("${loginfail}") String msg,@Value("${dbInteractionType}") String dbInteractionType) {
		modelMap.addAttribute("eid", id);
		//EmployeeDAO dao=EmployeeDAOFactory.getInstance(dbInteractionType);
		EmployeeInfoBean emp=dao.getEmployeeInfo(id);
		if ((emp!= null) && (emp.getPassword().equals(password))) {
			HttpSession httpSession = req.getSession(true);
			httpSession.setAttribute("empInfo", emp);
			return "homePage";
		} else {
			modelMap.addAttribute("msg", msg);
			return VIEW_LOGIN_PAGE;
		}

	}
	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap modelMap,@Value("${logout}") String msg) {
		
		session.invalidate();
		modelMap.addAttribute("msg", msg);
		return VIEW_LOGIN_PAGE;
	}
	

}
