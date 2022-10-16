package com.xworkz.detailsOfShit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.detailsOfShit.dao.ShirtDao;
import com.xworkz.detailsOfShit.dto.ShirtDTO;
import com.xworkz.detailsOfShit.service.ServiceDao;

@Controller
@RequestMapping("/shirt")
public class ShirtController {
	@Autowired
	private ServiceDao dao;
	
	public ShirtController() {
		System.out.println("ShirtController  is created");
	}
	@PostMapping
	public String onSave(ShirtDTO dto) {
		System.out.println("onSave method is calling");
		System.out.println(dto);
		dao.saveAndValidate(dto);
		return "Display";
		
	}
}
