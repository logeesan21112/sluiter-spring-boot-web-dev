package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.LoginModel;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/login")
public class LoginController {
	@GetMapping("/")
	public String displayLoginform(Model model)
	{
		model.addAttribute("loginModel", new LoginModel());
		return "loginForm.html";
	}

	@PostMapping("/processLogin")
	public String processLoginform(@Valid LoginModel loginModel, BindingResult bindingResult, Model model)
	{
		if(bindingResult.hasErrors())
		{
			model.addAttribute("loginModel", loginModel);
			return "loginForm.html";
		}
		model.addAttribute("loginModel", loginModel);
		return "loginResults.html";
	}
}