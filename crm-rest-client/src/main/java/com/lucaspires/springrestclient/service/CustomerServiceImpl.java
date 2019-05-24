package com.lucaspires.springrestclient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.lucaspires.springrestclient.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	private RestTemplate restTemplate;
	private String crmRestUrl;
	
	@Autowired
	public CustomerServiceImpl(RestTemplate theRestTemplate, @Value("${crm.rest.url}") String theUrl) {
		restTemplate = theRestTemplate;
		crmRestUrl = theUrl;
	}
	
	@Override
	public List<Customer> getCustomers() {
		ResponseEntity<List<Customer>> responseEntity = restTemplate.exchange(crmRestUrl, HttpMethod.GET, null, new ParameterizedTypeReference<List<Customer>>() {});

		List<Customer> customers = responseEntity.getBody();

		return customers;
	}
}