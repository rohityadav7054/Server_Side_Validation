package com.ServerValidation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ServerValidation.entities.loginData;

import jakarta.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;


@Controller
public class Mycontroller {

	@GetMapping("/form")
	public String openForm(Model model) {
		System.out.println("open form");
		model.addAttribute("loginData",new loginData());

		return "form";
	}
	
	//handler for process from
	@PostMapping("/process")
	public String ProcessForm(@Valid @ModelAttribute("loginData") loginData loginData ,BindingResult result) {
	
		if(result.hasErrors()) {
			return"form";
		}
		return"success";
	}
}
