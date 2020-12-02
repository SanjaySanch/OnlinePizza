package com.cg.onlinepizza.service;

import java.util.List;

import com.cg.onlinepizza.model.Customer;



public interface ICustomerService {

	Customer addCustomer(Customer customer);

    Customer updateCustomer(Customer customer);
	
	Customer deleteCustomer(int customerId);
	
	Customer viewCustomer(int customerid);
	
	List<Customer> viewCustomersList();

}
