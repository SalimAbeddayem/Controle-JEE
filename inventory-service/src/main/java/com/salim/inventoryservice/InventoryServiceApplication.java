package com.farouk.inventoryservice;

import com.farouk.inventoryservice.entities.Product;
import com.farouk.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository,
                            RepositoryRestConfiguration restConfiguration){
        restConfiguration.exposeIdsFor(Product.class);
        return args -> {
            productRepository.save(new Product(null,"Ordinateur",788,12, true));
            productRepository.save(new Product(null,"Imprimante",288,129,false));
            productRepository.save(new Product(null,"Smartphone",1288,112, true));
            productRepository.save(new Product(null,"Table",500,85,false));
            productRepository.save(new Product(null,"Bureau",700,52, true));
            productRepository.save(new Product(null,"Projecteur",1560,41, true));
            productRepository.save(new Product(null,"Laptop",5890,44,false));
        };
    }
}
