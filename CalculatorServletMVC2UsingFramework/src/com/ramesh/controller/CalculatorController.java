package com.ramesh.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rameh.domain.Calculator;
import com.ramesh.validator.CalculatorValidator;

import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;

@Controller
public class CalculatorController {

	@AutoWired
	CalculatorValidator validator;
	
	@RequestMapping(value = {"/", "/caclulator"})
	public String getCalculator(HttpServletRequest request, HttpServletResponse response) {
		return "/WEB-INF/calculator.jsp";
		
	}
	
	@RequestMapping(value = "/result")
	public String getResult(Calculator calculator, HttpServletRequest request, HttpServletResponse response){
		 List<String> errors = validator.validate(calculator);
		 if (errors.isEmpty()) {

			 calculator.calculateProduct();
			 calculator.calculateSum();
			 request.setAttribute("calculator", calculator);

			 return "/WEB-INF/result.jsp";
		 }else {

			 request.setAttribute("calculator", calculator);
			 request.setAttribute("errors", errors);
			 return "/WEB-INF/calculator.jsp";
		 }

	}
	
}
