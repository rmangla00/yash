package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) {
		System.out.println("i am here");
		
//		int i = Integer.parseInt(request.getParameter("t1"));
//		int j = Integer.parseInt(request.getParameter("t2"));
		
		
		int sum = i+j;
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("sum", sum);
		
		return mv;
	}

	/*
	 * @RequestMapping("/add") public ModelAndView add(HttpServletRequest
	 * request,HttpServletResponse response) { // System.out.println("i am here");
	 * int i = Integer.parseInt(request.getParameter("t1")); int j =
	 * Integer.parseInt(request.getParameter("t2")); int k=i+j;
	 * 
	 * ModelAndView mv = new ModelAndView(); mv.setViewName("display.jsp");
	 * mv.addObject("result", k); return mv; }
	 */

}
