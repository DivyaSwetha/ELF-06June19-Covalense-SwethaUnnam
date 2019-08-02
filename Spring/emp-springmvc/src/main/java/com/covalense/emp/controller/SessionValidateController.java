package com.covalense.emp.controller;

import static com.covalense.emp.common.EmpConstants.VIEW_LOGIN_PAGE;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/validator")
public class SessionValidateController {

	@GetMapping("/validate/{url1}/{url2}")
	public String validateSession(HttpSession session, ModelMap modelMap, @PathVariable("url1") String url1,@PathVariable("url2") String url2, @Value("${invalidSessionMsg}") String msg) {
		if (session.isNew()) {
			modelMap.addAttribute("msg", msg);
			session.invalidate();
			return VIEW_LOGIN_PAGE;
		}
		return "forward:/"+url1+"/"+url2;
	}// End of validateSession()

	@PostMapping("/validate")
	public String validateSessionPost(HttpSession session, ModelMap modelMap,@PathVariable("url1") String url1,@PathVariable("url2") String url2,@Value("${invalidSessionMsg}") String msg) {
		return validateSession(session, modelMap, url1,url2,msg);
	}// End of validateSessionPost()
	
}
