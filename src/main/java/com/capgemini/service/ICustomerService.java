package com.capgemini.service;

import java.util.List;

import com.capgemini.entities.Customer;

public interface ICustomerService {
	
	public String createCustomer(Customer customer);
	
	public List<Customer> findAllCustomers();
	
	public String update(int id, Customer customer);
	
	public Customer findCustomerById(int id);
	
	public String delete(int id);

}
