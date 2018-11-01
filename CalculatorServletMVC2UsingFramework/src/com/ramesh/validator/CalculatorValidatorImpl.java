package com.ramesh.validator;

import java.util.ArrayList;
import java.util.List;

import com.rameh.domain.Calculator;

public class CalculatorValidatorImpl implements CalculatorValidator {

	@Override
	public List<String> validate(Object obj) {
		List<String> errors = new ArrayList<String>();

		Calculator cal = (Calculator) obj;
		try {
			Integer.parseInt(cal.getAdd1());
		}catch(NullPointerException e) {
			errors.add("First value for Addition should be number");
		}catch(NumberFormatException e) {
			errors.add("First value for Addition should be number");
		}
		try {
			Integer.parseInt(cal.getAdd2());
		}catch(NullPointerException e) {
			errors.add("Second value for Addition should be number");
		}catch(NumberFormatException e) {
			errors.add("Second value for Addition should be number");
		}
		try {
			Integer.parseInt(cal.getMult1());
		}catch(NullPointerException e) {
			errors.add("First value for Multiplication should be number");
		}catch(NumberFormatException e) {
			errors.add("First value for Multiplication should be number");
		}
		try {
			Integer.parseInt(cal.getMult2());
		}catch(NullPointerException e) {
			errors.add("Second value for Multiplication should be number");
		}catch(NumberFormatException e) {
			errors.add("Second value for Multiplication should be number");
		}
		

		return errors;
	}

}
