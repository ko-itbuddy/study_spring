package com.bank.jackpot.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;


import org.apache.log4j.*;
import org.apache.log4j.lf5.util.DateFormatManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class ExamplePostGetController {

	//private static final Logger logger = LoggerF.getLogger(ExamplePostGetController.class); /** * Simply selects the home view to render by returning its name. */
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model)
	{
		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "home";
	}

	
	@RequestMapping("/useInput") public String goIndex() { return "useInput"; }




	@RequestMapping(method = RequestMethod.GET, value="/student")
	public String goStudent(HttpServletRequest httpServletRequest, Model model) 
	{
		System.out.println("RequestMethod.GET");
		String id = httpServletRequest.getParameter("id"); 
		String pw = httpServletRequest.getParameter("pw");
		String address = httpServletRequest.getParameter("address");
		System.out.println("id :" + id); System.out.println("pw :" + pw);
		System.out.println("address:" + address);
		model.addAttribute("studentId", id);

		model.addAttribute("studentId", pw);
		model.addAttribute("studentId", address);
		return "student/studentInfor";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/student")
	public ModelAndView goStudent(HttpServletRequest httpServletRequest) {
		System.out.println("RequestMethod.POST"); 
		String id= httpServletRequest.getParameter("id");
		String pw= httpServletRequest.getParameter("pw");
		String address= httpServletRequest.getParameter("address");
		System.out.println("id" + id); System.out.println("pw" + pw); 
		System.out.println("address" + address); 
		ModelAndView  mv = new ModelAndView(); 
		mv.setViewName("student/studentInfor"); 
		mv.addObject("id", id); mv.addObject("pw", pw); 
		mv.addObject("address", address); 

		return mv; 
	}
}
