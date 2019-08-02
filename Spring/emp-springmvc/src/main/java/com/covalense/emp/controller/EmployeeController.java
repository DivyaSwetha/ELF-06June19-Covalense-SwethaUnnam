package com.covalense.emp.controller;

import static com.covalense.emp.common.EmpConstants.DB_INTERACTION_TYPE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.emp.dao.EmployeeDAO;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	@Qualifier(DB_INTERACTION_TYPE)
	EmployeeDAO dao;
	
	@GetMapping("/search")
	public String employeeSearch(ModelMap modelMap,@RequestParam(name="id") String id) {
	         
        List<Integer> idList = dao.getAllEmployeeIds(id);
		modelMap.addAttribute("id", id);
		modelMap.addAttribute("idList", idList);
		return "employeeSearch";
	}//End of search
}
