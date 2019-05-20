package com.lucaspires.springrestapi.service;

import java.util.List;

import com.lucaspires.springrestapi.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomer();
	public Customer getCustomer(int customerId);
	public void saveCustomer(Customer theCustomer);
}