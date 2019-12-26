package com.exam.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.exam.model.UserInfo;
import com.exam.service.UserInfoService;

@RestController
public class LoginController {
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	UserInfoService userInfoService;

	@PostMapping("/register")
	public UserInfo register(@RequestBody @Valid UserInfo userInfo, BindingResult results) {

		if (!results.hasErrors()) {
			userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
			return userInfoService.save(userInfo);
		}
		return null;

	}
	
	
	@GetMapping(value = "/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}
	
	
	@GetMapping(value = "/login-success")
	public ModelAndView loginSuccess() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		List <GrantedAuthority> roles = (List<GrantedAuthority>) authentication.getAuthorities();
		
		if (roles.get(0).getAuthority().equalsIgnoreCase("admin")) {
			return new ModelAndView("pages/adminhome");
		}
		if (roles.get(0).getAuthority().equalsIgnoreCase("user")) {
			return new ModelAndView("index");
		}
		
		 return null;
	}
	
	@GetMapping(value = "/current-user")
	public String getCurrentUser() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
	
}
