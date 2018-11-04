package com.ramesh.service.impl;

import java.util.List;
import java.util.Map;

import com.ramesh.repository.AdviceRepository;
import com.ramesh.service.AdviceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdviceServiceImpl implements AdviceService  {

	 @Autowired
	AdviceRepository adviceRepository;

 	public List<String> getListByType(String type) {
 		return adviceRepository.getListByType(type);
 	}
 	
	public Map<Integer, String> getAllRoasts() {
 		return 	adviceRepository.getAllRoasts();
 	}

	 public String getRoast(Integer key) {
		 return adviceRepository.getRoast(key);
	 }		   
}
 
