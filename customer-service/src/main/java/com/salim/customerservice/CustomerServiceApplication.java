package com.farouk.customerservice;

import com.farouk.customerservice.entities.Customer;
import com.farouk.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository,
                            RepositoryRestConfiguration restConfiguration){
        restConfiguration.exposeIdsFor(Customer.class);
        return args -> {
            customerRepository.save(new Customer(null, "Mouad","mouad@gmail.com"));
            customerRepository.save(new Customer(null, "Yassine","yassine@gmail.com"));
            customerRepository.save(new Customer(null, "Salima","salima@gmail.com"));
            customerRepository.save(new Customer(null, "Ali","ali@gmail.com"));
            customerRepository.save(new Customer(null, "Farouk","farouk@gmail.com"));
            customerRepository.save(new Customer(null, "Hamza","hamza@gmail.com"));
            customerRepository.save(new Customer(null, "Fatima","fatima@gmail.com"));
        };
    }
}
