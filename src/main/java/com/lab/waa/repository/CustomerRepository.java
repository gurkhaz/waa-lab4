package com.lab.waa.repository;

import com.lab.waa.model.Customer;

public interface CustomerRepository {
	
	public boolean addCustomer(Customer customer);

	public Object getAllCustomers();

}
