package com.ramesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	

	@RequestMapping(value = {"/", "/Calculator"}, method = RequestMethod.POST)
	public String calculator(@ModelAttribute("calculator") Calculator calculator, Model model, RedirectAttributes redirectAttribute) {
		String redirectURL = "redirect:/Calculator";
		if(calculator != null) {
			calculatorService.add(calculator);
			calculatorService.multiply(calculator);
			redirectAttribute.addFlashAttribute("calculator",calculator);
			
			if(!calculatorService.isBothEmpty(calculator))
			{
				System.out.println("NOT NULL "+(calculator.getSum() != null)+", "+(calculator.getProduct() != null));
				redirectURL = "redirect:/result";
			}
		} 
			
		
			
		return redirectURL;
	}
	
	
	@RequestMapping(value = "result", method= RequestMethod.GET)
	public String result(Model model ) {
		return "result";
	}
	
}
