package com.lab.waa.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lab.waa.model.Customer;
import com.lab.waa.model.Product;

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

	@Override
	public void deleteCustomerByName(String userName) {
		int index = -1 ;
		for (Customer customer : listOfCustomer) {
			if (customer.getUserName().equals(userName.trim())) {
				 index = listOfCustomer.indexOf(customer);
				//listOfCustomer.remove(customer);
			}
		}
		if(index != -1){}
		listOfCustomer.remove(index);
		
	}
	
	


}
