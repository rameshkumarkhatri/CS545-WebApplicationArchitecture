package com.ramesh.service.impl;

import org.springframework.stereotype.Service;

import com.ramesh.domain.Calculator;
import com.ramesh.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService
{

	public void add(Calculator calculator) {
		calculator.calculateSum();
		
	}

	public void multiply(Calculator calculator) {
		calculator.calculateProduct();
		
	}

}
