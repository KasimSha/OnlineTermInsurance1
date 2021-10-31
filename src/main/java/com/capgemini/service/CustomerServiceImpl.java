package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.entities.Customer;
import com.capgemini.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public String createCustomer(Customer customer) {
		customerRepository.save(customer);
		return "Successfully Registered";
	}
	
	

	@Override
	public List<Customer> findAllCustomers() {
		
		return customerRepository.findAll();
	}
	
	
	
	@Override
	public Customer findCustomerById(int id) {
		
		return customerRepository.findById(id).get();
	}
	
	

	@Override
	public String update( int id, Customer customer) {

		customerRepository.save(customer);

		return "Succesfully Updated";
		
	}
	
	

	@Override
	public String delete(int id) {
		
		customerRepository.deleteById(id);
		
		return "Sucessfully deleted";
	}

}

