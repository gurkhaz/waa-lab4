package com.lab.waa.service;

import com.lab.waa.model.Customer;
import com.lab.waa.model.Product;

public interface CustomerService {

	public boolean addCustomer(Customer customer);
	public Object getAllCustomers();
	public void deleteCustomerByName(String userName);
	public Object editCustomerByName(String userName);
	
	public boolean updateCustomerByName(Customer customer);

	
}
