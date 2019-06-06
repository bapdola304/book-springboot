package com.example.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.User;

@Controller
public class RegisterController {
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("user",new User());
		return "register";
	}
	
//	@PostMapping("/register")
//	public String save(@ModelAttribute(name="User") User user) {	
//		System.out.print(user.getUsername());
//		return "register";
//	}
}
