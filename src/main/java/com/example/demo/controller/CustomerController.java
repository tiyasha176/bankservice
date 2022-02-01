package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;


import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@PostMapping("/customer")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addCustomer(@RequestBody Customer customer) {
		customerService.addUser(customer);
	}

}
