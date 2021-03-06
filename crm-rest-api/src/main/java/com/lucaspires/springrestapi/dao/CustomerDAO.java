package com.lucaspires.springrestapi.dao;

import java.util.List;

import com.lucaspires.springrestapi.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();
	public Customer getCustomer(int customerId);
	public void saveCustomer(Customer theCustomer);
	public void deleteCustomer(Customer theCustomer);
}