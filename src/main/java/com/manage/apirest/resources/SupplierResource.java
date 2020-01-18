package com.manage.apirest.resources;

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


import com.manage.apirest.models.Supplier;
import com.manage.apirest.repository.SupplierRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins= "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Supplier")
public class SupplierResource {

	@Autowired
	SupplierRepository supplierRepository;
	
	@ApiOperation(value="Return List Supplier")
	@GetMapping("/supplier")
	public List<Supplier> listSupplier() {
		return supplierRepository.findAll();
	}
	
	@ApiOperation(value="Return Unique Supplier")
	@GetMapping("/supplier/{id}")
	public Supplier listSupplierId(@PathVariable(value="id") long id) {
		return supplierRepository.findById(id);
	}
	
	@ApiOperation(value="Save a Supplier")
	@PostMapping("/supplier")
	public Supplier saveSupplier(@RequestBody @Valid Supplier supplier) {
		return supplierRepository.save(supplier);
	}
	
	@ApiOperation(value="Delete a Supplier")
	@DeleteMapping("/supplier")
	public void deleteSupplier(@RequestBody @Valid Supplier supplier) {
		supplierRepository.delete(supplier);
	}
	
	@ApiOperation(value="Update a Supplier")
	@PutMapping("/supplier")
	public Supplier updateSupplier(@RequestBody @Valid Supplier supplier) {
		return supplierRepository.save(supplier);
	}
}
