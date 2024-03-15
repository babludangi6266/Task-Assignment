package com.task.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Correct import
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.task.entity.User;
import com.task.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/register")
	public String showRegistrationPage(Model model) {
		model.addAttribute("user", new User());
		return "userRegistration";
	}
	@PostMapping("/register")
	public String registerUser(@ModelAttribute("user") User user) {
		userService.saveUser(user);
		return "redirect:/login";
	}
	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}
	@GetMapping("/welcome")
	public String showWelcomePage(Model model, Principal principal) {
		String loggedInUserName = principal.getName();
		User loggedInUser = userService.findByLoginId(loggedInUserName);

		model.addAttribute("user", loggedInUser);

		List<User> registeredUsers = userService.getAllUser();
		model.addAttribute("registeredUsers", registeredUsers);

		return "welcome";
	}
}
