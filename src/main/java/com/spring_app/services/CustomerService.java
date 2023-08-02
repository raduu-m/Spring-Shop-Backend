package com.spring_app.services;

import com.spring_app.model.Customer;
import com.spring_app.model.CustomerRequest;
import com.spring_app.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public void addCustomer(CustomerRequest request) {
        Customer customer = Customer.builder()
                .name(request.getName())
                .age(request.getAge())
                .email(request.getEmail())
                .build();
        customerRepository.save(customer);

    }

    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }
}
