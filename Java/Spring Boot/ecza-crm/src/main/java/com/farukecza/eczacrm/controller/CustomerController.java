package com.farukecza.eczacrm.controller;

import com.farukecza.eczacrm.entity.Customer;
import com.farukecza.eczacrm.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController extends BaseController<CustomerService, Customer> {
    public CustomerController() {
        this.viewBase="customer";
        this.type=Customer.class;
    }
}
