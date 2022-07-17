package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.UserInfo;
import com.example.demo.repo.UserInfoRepo;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserInfoRepo userRepo;

	@GetMapping("/saveUser")
	public String saveUser(Model model) {
		model.addAttribute("uf", new UserInfo());
		System.out.println("Controller Reached");
		return "register";
	}

	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("uf") @Valid UserInfo userInfo, Errors errors) {
		if (errors.hasErrors()) {
			System.out.println("error reached");
			return "register";
		}
		userRepo.save(userInfo);
		// model.addAttribute("uf", userInfo);
		return "success";
	}
}
