package com.tts.springMVCPart2.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Employee;

@Controller
public class HomeController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView showForm() {
		return new ModelAndView("home", "employee", new Employee());
	}
	
	@RequestMapping(value = "/employees", method = RequestMethod.POST)
	    public String submit (@Validated @ModelAttribute("employee") Employee employee, BindingResult result, ModelMap model) {
		
			if (result.hasErrors()) {
				return "error";
			}
			
			System.out.println(employee.getId());
			model.addAttribute("id", employee.getId());
			model.addAttribute("name", employee.getName());
			model.addAttribute("contactNumber", employee.getContactNumber());
		
	        return "employeeView";
	}
}
