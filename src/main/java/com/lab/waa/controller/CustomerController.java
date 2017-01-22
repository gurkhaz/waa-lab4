package com.lab.waa.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lab.waa.model.Customer;
import com.lab.waa.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	/*@InitBinder
	public void initializeBinder(WebDataBinder binder) {
		binder.setDisallowedFields("sex");
	}*/

	@RequestMapping(value = "/customer")
	public String addCustomer(Customer customer) {

		return "customer";
	}

	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public String getCustomer(@ModelAttribute("customer") @Valid Customer customer, BindingResult result) {
		System.err.println("Error orrcured");
	
		if (result.hasErrors()) {
			return "customer";
		}
		
		if (customerService.addCustomer(customer)) {

			return "redirect:customerList";

		} else {

			return "customer";
		}

	}

	@RequestMapping(value = "/customerList")
	public String getProductList(@ModelAttribute("customer")  Customer customer, Model model) {

		model.addAttribute("customers", customerService.getAllCustomers());

		return "customerList";

	}
	
	
	@RequestMapping(value = "/deleteUser/{userName}")
	public String deleteCustomerByName(@PathVariable("userName") String userName){
		
		customerService.deleteCustomerByName(userName);
		
		return "redirect:/customerList";
		
		
	}
	

}
