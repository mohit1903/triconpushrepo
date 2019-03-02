package com.mohit.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.mohit.myapp.modal.modal;
import com.mohit.myapp.modal.services.MyService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	MyService service;
	
	@GetMapping(value="/myapp")
	public String myapp()
	{
		
		return "Hello World";
	}
	@GetMapping(value="/add")
	public String add()
	{
		modal md=new modal();
		md.setId(123);
		md.setName("Mohit");
		md.setSalary(54321);
		service.savedata(md);
		return "User Created";
	}
	
	@GetMapping(value="/getuser")
	public String getuser()
	{
		
		return "User Created";
	}
	
	

}
