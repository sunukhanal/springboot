package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.EmployeeDTO;
import com.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/")
	String displayLoginPage() {

		return "login";// login.jsp

	}

	@PostMapping("login")
	String authenticate(@RequestParam String emailId, @RequestParam String password, Model model) { // HttpServletRequest
																									// request

		System.out.println("8888888888888888888888888888888");

		EmployeeDTO employeeDTO = employeeService.authenticate(emailId, password);

		if (employeeDTO!=null){
			model.addAttribute("employeeDTO", employeeDTO);
			
			return "congracha";
		}
		else {
		
		model.addAttribute("msg", "User Not Found! Please TryAgain");
		return "login";//
		
	}
	}
	}

	/*
	 * @GetMapping("showAllEmployee") String showAll(Model model) {
	 * 
	 * List<EmployeeDTO> listOfEmp = employeeService.FetchAllEmployee();
	 * System.out.println(listOfEmp); model.addAttribute("listOfEmp", listOfEmp);
	 * 
	 * return "showAll";// showAll.jsp
	 * 
	 * }
	 * 
	 * 
	 * @GetMapping("deleteEmployee") String delEmployee(@RequestParam int
	 * employeeId,Model model){
	 * 
	 * employeeService.deleteEmp(employeeId);
	 * 
	 * List<EmployeeDTO> listOfEmp=employeeService.giveAllEmp();
	 * model.addAttribute("listOfEmp", listOfEmp); return "showAll";//showAll.jsp
	 * 
	 * return "redirect:showAll";
	 * 
	 * }
	 * 
	 * 
	 * @GetMapping("register") String displayRegistrationPage() {
	 * 
	 * return "registration";
	 * 
	 * }
	 * 
	 * @PostMapping("register") String doRegistration(@RequestBody EmployeeDTO
	 * empDTO) {
	 * 
	 * employeeService.saveEmp(empDTO);
	 * 
	 * return "login";
	 * 
	 * }
	 */


