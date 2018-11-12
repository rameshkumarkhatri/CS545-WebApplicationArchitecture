package com.example.demo.validator;


import org.springframework.validation.Errors;

import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.example.demo.domain.Member;



public class MemberValidator implements Validator {
	public boolean supports(Class<?> c) {
		return Member.class.isAssignableFrom(c);
	}


	public void validate(Object command, Errors errors) {
		String[] errorArgs = { "First Name" };
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "NotEmpty", errorArgs);
		errorArgs = new String[] { "Last Name" };
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "NotEmpty", errorArgs);
		Member member = (Member) command;

		if (member.getMemberNumber() == null || member.getMemberNumber() <= 0)
			errors.rejectValue("memberNumber", "Member.Number.lessthan");
		if (member.getAge() < 18)
			errors.rejectValue("age", "Member.age");
		
	}

}
