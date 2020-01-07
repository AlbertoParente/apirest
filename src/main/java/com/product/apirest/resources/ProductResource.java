package com.product.apirest.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.apirest.models.Product;
import com.product.apirest.repository.ProductRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins= "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Product")
public class ProductResource {

	@Autowired
	ProductRepository productRepository;
	
	@ApiOperation(value="Return List Products")
	@GetMapping("/products")
	public List<Product> listProducts() {
		return productRepository.findAll();
	}
	
	@ApiOperation(value="Return Unique Product")
	@GetMapping("/product/{id}")
	public Product listProductId(@PathVariable(value="id") long id) {
		return productRepository.findById(id);
	}
	
	@ApiOperation(value="Save a Product")
	@PostMapping("/product")
	public Product saveProduct(@RequestBody @Valid Product product) {
		return productRepository.save(product);
	}
	
	@ApiOperation(value="Delete a Product")
	@DeleteMapping("/product")
	public void deleteProduct(@RequestBody @Valid Product product) {
		productRepository.delete(product);
	}
	
	@ApiOperation(value="Update a Product")
	@PutMapping("/product")
	public Product updateProduct(@RequestBody @Valid Product product) {
		return productRepository.save(product);
	}
}
