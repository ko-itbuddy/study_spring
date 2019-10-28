package com.bank.jackpot.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CTFormController {

	@RequestMapping(value = "/ct_create_form1", method = RequestMethod.GET)
	public String ct_create1(Locale locale, Model model) {
		
		return "ct_create_form1";
	}
	
	@RequestMapping(value = "/ct_create_form2", method = RequestMethod.GET)
	public String ct_create2(Locale locale, Model model) {
		
		return "ct_create_form2";
	}
	
	@RequestMapping(value = "/ct_login_form", method = RequestMethod.GET)
	public String ct_login(Locale locale, Model model) {
		
		return "ct_login_form";
	}
}
