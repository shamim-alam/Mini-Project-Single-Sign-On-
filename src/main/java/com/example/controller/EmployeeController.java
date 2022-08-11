package com.example.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@GetMapping(value = {"/", "/login"})
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView("login");
		return modelAndView;
	}
	
	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("home");
		return modelAndView;
	}
	
	@GetMapping("/manage-employees")
	@PreAuthorize("hasAuthority('MANAGER')")
	//@PreAuthorize("hasAuthority('MANAGER') or hasAuthority('EMPLOYEE')")
	public ModelAndView manageEmployees() {
		ModelAndView modelAndView = new ModelAndView("manage-employees");
		return modelAndView;
	}
	
	@GetMapping("/access-denied")
	public ModelAndView accessDenied() {
		ModelAndView modelAndView = new ModelAndView("/access-denied");
		return modelAndView;
	}
}
