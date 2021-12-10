package com.claims.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.claims.model.Claims;
import com.claims.service.Claimsdao;

import java.util.*;

@Controller
public class Claimscontroller {
	
	@Autowired
	Claims claims;
	
	@Autowired
	Claimsdao dao;
	
	@RequestMapping("/home")
	public String homePage()
	{
	   return "index";	
	}
	
	@RequestMapping("registration")
	public String registrationPage(Model model)
	{
	   model.addAttribute("claim",claims);
	   return "register";	
	}
	
	@RequestMapping("submitform")
	public String register(@ModelAttribute("claim") Claims claims,@RequestParam("claimPic") MultipartFile file) throws IOException
	{
		System.out.println("Save in progress");
		byte[] claimPic = file.getBytes();
		claims.setClaimPic(claimPic);
		dao.addClaim(claims);
		System.out.println(claims);
		return "message";
	}
	
	@RequestMapping("adminlogin")
	public ModelAndView adminPage(ModelAndView mv)
	{
		List<Claims> claimList=dao.getAllClaims();
		mv.addObject("list", claimList);
		mv.setViewName("viewclaims");
		return mv;
	}
	
	

}
