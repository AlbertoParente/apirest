package com.manage.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manage.apirest.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	Product findById(long id);

}
