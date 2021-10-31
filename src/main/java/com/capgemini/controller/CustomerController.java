package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entities.Customer;
import com.capgemini.service.CustomerServiceImpl;

@RestController
@RequestMapping("/api/customer/")
public class CustomerController {

	@Autowired
	private CustomerServiceImpl customerServiceImpl;

	//create
	@PostMapping("/create")
	public String createCustomer(@RequestBody Customer customer) {

		customerServiceImpl.createCustomer(customer);
		return "Sucessfully created";

	}
	
	

	//GetAllUsers
	@GetMapping("/findall")
	public List<Customer> findAllCustomer() {

		return customerServiceImpl.findAllCustomers();
	}
	
	
		
	//GetUserById
	@GetMapping("/{id}")
	public Customer findCustomerById(int id) throws Exception {
		
		return customerServiceImpl.findCustomerById(id);
	}
	
	
	
	
	@PutMapping("/update")
	public String update(@PathVariable int id, @RequestBody Customer customer) {
		
		return customerServiceImpl.update(id, customer);
	}
	
	
	@DeleteMapping("/delete")
	public String delete(@PathVariable int id) {
		
		return customerServiceImpl.delete(id);
	}

}

