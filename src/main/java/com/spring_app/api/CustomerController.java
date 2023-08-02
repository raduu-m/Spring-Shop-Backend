package com.spring_app.api;

import com.spring_app.model.Customer;
import com.spring_app.model.CustomerRequest;
import com.spring_app.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping ("api/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getAllCustomers();
    }
    @PostMapping
    public void addCustomer(@RequestBody CustomerRequest request) {
        customerService.addCustomer(request);
    }

    @DeleteMapping("{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Integer id) {
        customerService.deleteCustomer(id);
    }
}

