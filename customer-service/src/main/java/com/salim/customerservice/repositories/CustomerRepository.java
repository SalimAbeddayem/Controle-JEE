package com.farouk.customerservice.repositories;

import com.farouk.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8083","http://localhost:8888"})
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
