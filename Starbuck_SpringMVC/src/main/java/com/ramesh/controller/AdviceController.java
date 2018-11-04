package com.ramesh.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ramesh.domain.User;
import com.ramesh.service.AdviceService;
//@RequestMapping("/advice")
@Controller
@SessionAttributes({"user"})
public class AdviceController  {
	
	  @Autowired
	  AdviceService adviceService;

 		@RequestMapping (value="/advice",method = RequestMethod.GET)
		public String adviceForm(Model model) {
 			System.out.println("User "+((User)model.asMap().get("user")).getUserName());
 			Map<Integer,String> roasts = adviceService.getAllRoasts();
 			model.addAttribute("roasts",roasts);
			
			return "advice";
		}

	  @RequestMapping (value="/advice",method = RequestMethod.POST)
	  public String adviceList( Integer roastKey, Model model) throws Exception {
	 		System.out.println(roastKey);

		  String roast = adviceService.getRoast(roastKey);
 		List<String> roastList  = adviceService.getListByType(roast);
 		System.out.println(roastList);
		model.addAttribute("roast",roast);
		model.addAttribute("result",roastList);
 		
		return "display" ;
 
	}
	
 
}
