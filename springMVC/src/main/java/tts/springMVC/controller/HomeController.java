package tts.springMVC.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import service.EmployeeManagerImp;

@Controller
public class HomeController {
	
	@Autowired
	EmployeeManagerImp employeeManagerImp;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/employees", method = RequestMethod.GET)
	public ModelAndView getEmployees (Model model) {
		model.addAttribute("employees", employeeManagerImp.getAllEmployees());
		return new ModelAndView("viewAllEmployees");
	}
}
