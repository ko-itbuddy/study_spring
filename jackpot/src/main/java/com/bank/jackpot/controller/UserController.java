package com.bank.jackpot.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@RequestMapping(value = "/login_form", method = RequestMethod.GET)
	public String loginForm(Locale locale, Model model) {

		return "login_form";
	}
	
	@RequestMapping(value = "/join_form", method = RequestMethod.GET)
	public String joinForm(Locale locale, Model model) {

		return "join_form";
	}
	
	@RequestMapping(value = "/chinfo_form", method = RequestMethod.GET)
	public String chinfoForm(Locale locale, Model model) {

		return "chinfo_form";
	}
	
	@RequestMapping(value = "/join_form_sql", method = RequestMethod.POST)
	public ModelAndView joinFormSql(HttpServletRequest hsr)
	{
		String id = hsr.getParameter("id");
		String pwd = hsr.getParameter("pwd");
		String name = hsr.getParameter("name");
		String tel = hsr.getParameter("tel");
		String birth = hsr.getParameter("birth");
		String qa_code = hsr.getParameter("qa_code");
		String qa_ans = hsr.getParameter("qa_ans");
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("join_form_sql");
		mv.addObject("id", id);
		mv.addObject("pwd", pwd);
		mv.addObject("name", name);
		mv.addObject("tel", tel);
		mv.addObject("birth", birth);
		mv.addObject("qa_code", qa_code);
		mv.addObject("qa_ans", qa_ans);
		
		return mv;
	}
}
