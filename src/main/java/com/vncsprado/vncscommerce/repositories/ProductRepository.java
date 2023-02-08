package com.vncsprado.vncscommerce.repositories;

import com.vncsprado.vncscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
