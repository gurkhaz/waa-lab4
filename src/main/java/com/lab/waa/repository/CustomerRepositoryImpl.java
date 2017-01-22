package com.lab.waa.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lab.waa.model.Customer;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository{
	
	private List<Customer> listOfCustomer = new ArrayList<>();

	@Override
	public boolean addCustomer(Customer customer) {
		
		if (listOfCustomer.add(customer)) {
			System.out.println(customer);

			return true;
		}

		return false;
	}

	@Override
	public Object getAllCustomers() {
		return listOfCustomer;
	}

}
