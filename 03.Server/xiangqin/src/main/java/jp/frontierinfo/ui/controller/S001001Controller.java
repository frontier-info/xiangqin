package jp.frontierinfo.ui.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.frontierinfo.ui.form.S001001Form;
import jp.frontierinfo.ui.input.S001001E000Input;

@Controller
@RequestMapping("/ui")  
public class S001001Controller {
	

//	@GetMapping("/s001001")
	@RequestMapping(value="/s001001", method=RequestMethod.GET)
	public String e000(HttpServletRequest request, HttpServletResponse response, 
			S001001Form form, S001001E000Input input, Model model) {
		request.getSession();
		request.getParameter("username");
		System.out.println("/s001001");
		return "s001001";
	}
	@RequestMapping(value="/s001001", params="login", method=RequestMethod.POST)
	public String e001(HttpServletRequest request, HttpServletResponse response, 
			S001001Form form, S001001E000Input input) {
		
		return "view/s001001";
	}
	@RequestMapping(value="/s001001", params="register", method=RequestMethod.POST)
	public String e002(HttpServletRequest request, HttpServletResponse response, 
			S001001Form form, S001001E000Input input) {
		
		return "view/s001001";
	}
	@RequestMapping(value="/s001001", params="repassword", method=RequestMethod.POST)
	public String e003(HttpServletRequest request, HttpServletResponse response, 
			S001001Form form, S001001E000Input input) {
		
		return "view/s001001";
	}
}
