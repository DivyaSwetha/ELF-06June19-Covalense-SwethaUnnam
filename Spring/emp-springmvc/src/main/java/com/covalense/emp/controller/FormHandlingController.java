package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.emp.dto.UserBean;

@Controller
@RequestMapping("/forms")
public class FormHandlingController {
	
	@GetMapping("/getForm")
	public String getForm() {
		return "myForm";
	}//End of getForm()

	@PostMapping("/formsubmit")
	public String submitForm(HttpServletRequest req) {
		int userId=Integer.parseInt(req.getParameter("id"));
		String password=req.getParameter("password");
		
		req.setAttribute("userId", userId);
		req.setAttribute("password", password);
		
		return "FormDataDisplay";
		
	}//End of submitForm()
	
	@PostMapping("/formsubmit2")
	public String submitForm2(int userId,String password,ModelMap modelMap) {
		modelMap.addAttribute("userId", userId);
		modelMap.addAttribute("password", password);
		return "FormDataDisplay";
	}//End of submitForm2()
	
	@PostMapping("/formSubmit3")
	public String submitForm3(UserBean userBean,ModelMap modelMap) {
		modelMap.addAttribute("userBean", userBean);
		return  "FormDataBeanDisplay";
	}//End of submitForm3()
	
	@PostMapping("/formSubmit4")
	public String submitForm4(@RequestParam(name="id") int userId,@RequestParam(name="password") String pswd,ModelMap modelMap) {
		modelMap.addAttribute("userId", userId);
		modelMap.addAttribute("password", pswd);
		return "FormDataDisplayEL";
	}//End of submitForm4()
	
	@PostMapping("/formSubmit5")
	public String submitForm5(@RequestParam(name="id") int userId,@RequestParam(name="password") String pswd,ModelMap modelMap) {
		modelMap.addAttribute("userId", userId);
		modelMap.addAttribute("password", pswd);
		return "FormDataDisplayEL";
	}//End of submitForm5()
	
	@PostMapping("/formSubmit6")
	public String submitForm6(UserBean userBean,ModelMap modelMap) {
		modelMap.addAttribute("userBean", userBean);
		return "FormDataBeanDisplayEL";
	}//End of submitForm6()
}//End of class
