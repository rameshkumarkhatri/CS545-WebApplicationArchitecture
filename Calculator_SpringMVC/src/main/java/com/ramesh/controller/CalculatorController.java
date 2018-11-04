package com.ramesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ramesh.domain.Calculator;
import com.ramesh.service.CalculatorService;
import com.ramesh.service.impl.CalculatorServiceImpl;

@Controller
public class CalculatorController {

	@Autowired
	CalculatorService calculatorService;
	
	@RequestMapping(value = {"/", "/Calculator"}, method = RequestMethod.GET)
	public String getCalculator(Calculator calculator) {
		return "calculator";
	}
	

	@RequestMapping(value = {"/result"}, method = RequestMethod.POST)
	public String calculator(Calculator calculator) {
//		if(calculator.getAdd1() != null && calculator.getAdd2() != null) {
//			calculator.calculateSum();
//		}
//		if(calculator.getMult1() != null && calculator.getMult2() != null) {
//			calculator.calculateProduct();
//		}
		if(calculator != null) {
			calculatorService.add(calculator);
			calculatorService.multiply(calculator);
		}
		return "result";
	}
}
