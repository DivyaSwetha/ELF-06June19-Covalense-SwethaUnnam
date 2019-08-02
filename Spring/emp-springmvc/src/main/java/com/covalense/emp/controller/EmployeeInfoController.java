package com.covalense.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;
import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.util.HibernateUtil;

@Controller
@RequestMapping("/employeeportal")
@PropertySource("classpath:emp.properties")
public class EmployeeInfoController {
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@GetMapping("/loginpage")
	public String getIndex() {
		return "loginPage";
	}

	@PostMapping("/authenticate")
	public String getHome(EmployeeInfoBean empBean, ModelMap modelMap, HttpServletRequest req) {
		int userId = Integer.parseInt(req.getParameter("id"));
		String password = req.getParameter("password");
		modelMap.addAttribute("eid", userId);
		Session session = HibernateUtil.openSession();
		EmployeeInfoBean emp = session.get(EmployeeInfoBean.class, userId);
		modelMap.addAttribute("empInfo", emp);
		if ((emp!= null) && (emp.getPassword().equals(password))) {
			HttpSession httpSession = req.getSession(true);
			return "homePage";
		} else {
			String message = "Invalid Credentials!!! please try again";
			modelMap.addAttribute("msg", message);
			return "loginPage";
		}

	}

	@GetMapping("/register")
	public String getRegisterPage() {

		return "register";
	}

	@PostMapping("/insert")
	public String getRegister(EmployeeInfoBean empInfo, ModelMap modelMap) {
		//EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		boolean status = dao.createEmployeeInfo(empInfo);
		modelMap.addAttribute("empInfo", empInfo);
		if (status == true) {	
			modelMap.addAttribute("msg", "Succesfully Registered, Please login");
			return "registerfail";
		} else {
			modelMap.addAttribute("msg", "Registration failed!!!,Try Again");
			return "registerfail";
		}

	}
	@GetMapping("/search")
	public String search(ModelMap modelMap,@RequestParam int id) {
		modelMap.addAttribute("id", id);
		return "employeeSearch";
	}
	
	@GetMapping("/profile")
	public String profile(ModelMap modelMap,@RequestParam int id) {
		modelMap.addAttribute("id", id);
		return "displayinfo";
	}
	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap modelMap) {
		
		session.invalidate();
		modelMap.addAttribute("msg", "Thanks for visiting!!!Have a nice day");
		return "loginPage";
	}

	@GetMapping("/validate/{url}")
	public String validateSession(HttpSession session, ModelMap modelMap, @PathVariable("url") String url, @Value("${msg}") String msg) {
		if (session.isNew()) {
			modelMap.addAttribute("msg", msg);
			session.invalidate();
			return "loginPage";
		}
		return "forward:/employeeportal/"+url;
	}// End of validateSession()

	@PostMapping("/validate")
	public String validateSessionPost(HttpSession session, ModelMap modelMap, @PathVariable("url") String url,@Value("${msg}") String msg) {
		return validateSession(session, modelMap, url,msg);
	}// End of validateSessionPost()
	
	

	/*
	 * @GetMapping("/validate") public String validateSession(HttpServletRequest
	 * req,ModelMap modelMap,@RequestParam String url) {
	 * if(req.getSession(false)==null) { modelMap.addAttribute("msg",
	 * "Please login First!!!"); return "loginfail"; } return url; }//End of
	 * validateSession()
	 */
	/*
	 * @PostMapping("/validate") public String
	 * validateSessionPost(HttpServletRequest req,ModelMap modelMap,@RequestParam
	 * String url) { return validateSession(req,modelMap,url); }//End of
	 * validateSessionPost()
	 */
	
}
