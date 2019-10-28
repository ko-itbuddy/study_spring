package com.bank.jackpot.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class FindFormController {
	
	@RequestMapping(value = "/findid_form", method = RequestMethod.GET)
	public String ct_create2(Locale locale, Model model) {
		
		return "findid_form";
	}
	
	@RequestMapping(value = "/findpw_form", method = RequestMethod.GET)
	public String ct_login(Locale locale, Model model) {
		
		return "findpw_form";
	}
}
