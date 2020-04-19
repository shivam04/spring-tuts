package com.shivam.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
//	@RequestMapping("home")
//	public String home(/*HttpServletRequest req, HttpServletResponse res*/@RequestParam("name") String myName, HttpSession session) {
//		
////		HttpSession session = req.getSession();
////		String name = req.getParameter("name");
//		System.out.println("hi "+ myName);
//		session.setAttribute("name", myName);
//		
//		return "home";
//	}
	
	@RequestMapping("home")
	public ModelAndView home(/*@RequestParam("name") String myName*/ Alien alien) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("home");
		
		return mv;
	}
	
}
