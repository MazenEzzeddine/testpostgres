package org.example.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.entity.Customer;
import org.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    private static final Logger log = LogManager.getLogger(CustomerController.class);


    @Autowired
    CustomerRepository customerRepo;



    @RequestMapping("/customers")
    @ResponseBody
    public ResponseEntity<List<Customer>> getAllItems(){
        List<Customer> items =  customerRepo.findAll();
        return new ResponseEntity<List<Customer>>(items, HttpStatus.OK);
    }


   /* @RequestMapping("/customers")
    @ResponseBody
    public ResponseEntity<List<Customer>> getAllItems(){
        List<Customer> items =  customerRepo.findAll();
        return new ResponseEntity<List<Customer>>(items, HttpStatus.OK);
    }*/


    @PostMapping("/addCustomer")
    public Customer addOneCustomer(@RequestBody Customer cust) {
        return this.customerRepo.save(cust);
    }

}