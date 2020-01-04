package com.product.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.apirest.models.Product;
import com.product.apirest.repository.ProductRepository;

@RestController
@RequestMapping(value="/api")
public class ProductResource {

	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/products")
	public List<Product> listProducts(){
		return productRepository.findAll();
	}
	
	@GetMapping("/product/{id}")
	public Product listProductId(@PathVariable(value="id") long id){
		return productRepository.findById(id);
	}
}
