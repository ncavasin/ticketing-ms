package com.ncavasin.ticketingapi.customer;

import com.ncavasin.ticketingapi.customer.dto.CreateCustomerDto;
import com.ncavasin.ticketingapi.customer.dto.CustomerDto;
import com.ncavasin.ticketingapi.customer.dto.UpateCustomerDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public record CustomerController(CustomerService customerService) {

    @GetMapping("/all")
    public List<CustomerDto> getAll() {
        return null;
    }

    @PostMapping()
    public CustomerDto addCustomer(@Validated @RequestBody CreateCustomerDto createCustomerDto) {
        return null;
    }

    @PatchMapping
    public CustomerDto updateCustomer(@PathVariable("id") String id, @Validated @RequestBody UpateCustomerDto upateCustomerDto) {
        return null;
    }

    @DeleteMapping
    public void deleteCustomer(@PathVariable("id") String id) {

    }

}
