package com.ramesh.service;

import com.ramesh.domain.Calculator;

public interface CalculatorService {
	public void add(Calculator calculator);
	public void multiply(Calculator calculator);

	public boolean isBothEmpty(Calculator calculator);
}
