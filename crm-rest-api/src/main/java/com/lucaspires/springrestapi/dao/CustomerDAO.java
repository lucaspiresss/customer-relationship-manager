package com.lucaspires.springrestapi.dao;

import java.util.List;

import com.lucaspires.springrestapi.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();
}