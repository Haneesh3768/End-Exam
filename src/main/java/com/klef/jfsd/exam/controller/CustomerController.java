package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.service.CustomerService;

@RestController
public class CustomerController 
{
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("/")
	public String home()
	{
		return "JFSD LAB EXAM";
	}
	
	@PostMapping("addcustomer")
	public String addcustomer(@RequestBody  Customer customer)
	{
		return service.addcustomer(customer);
	}
	
	@GetMapping("viewall")
	public List<Customer> viewallcustomers()
	{
		return service.viewall();
	}
	
	
	
}
