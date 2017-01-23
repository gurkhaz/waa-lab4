package com.lab.waa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.waa.model.Customer;
import com.lab.waa.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public boolean addCustomer(Customer customer) {
		
		return customerRepository.addCustomer(customer);
	}

	@Override
	public Object getAllCustomers() {
		
		return customerRepository.getAllCustomers();
	}

	@Override
	public void deleteCustomerByName(String userName) {
		
		customerRepository.deleteCustomerByName(userName);
	}

	@Override
	public Object editCustomerByName(String userName) {
		
		return customerRepository.editCustomerByName(userName);
	}

	@Override
	public boolean updateCustomerByName(Customer customer) {
		
		return customerRepository.updateCustomerByName(customer);
	}

	


}
