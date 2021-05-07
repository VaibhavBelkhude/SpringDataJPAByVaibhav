package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.entity.Customer;

public interface CustomerRepo extends MongoRepository<Customer,String>{

}
