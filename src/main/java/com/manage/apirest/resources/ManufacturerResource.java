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

import com.manage.apirest.models.Manufacturer;
import com.manage.apirest.repository.ManufacturerRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins= "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Manufacturer")
public class ManufacturerResource {

	@Autowired
	ManufacturerRepository manufacturerRepository;
	
	@ApiOperation(value="Return List Manufacturer")
	@GetMapping("/manufacturer")
	public List<Manufacturer> listManufacturer() {
		return manufacturerRepository.findAll();
	}
	
	@ApiOperation(value="Return Unique Manufacturer")
	@GetMapping("/manufacturer/{id}")
	public Manufacturer listManufacturerId(@PathVariable(value="id") long id) {
		return manufacturerRepository.findById(id);
	}
	
	@ApiOperation(value="Save a Manufacturer")
	@PostMapping("/manufacturer")
	public Manufacturer saveManufacturer(@RequestBody @Valid Manufacturer manufacturer) {
		return manufacturerRepository.save(manufacturer);
	}
	
	@ApiOperation(value="Delete a Manufacturer")
	@DeleteMapping("/manufacturer")
	public void deleteManufacturer(@RequestBody @Valid Manufacturer manufacturer) {
		manufacturerRepository.delete(manufacturer);
	}
	
	@ApiOperation(value="Update a Manufacturer")
	@PutMapping("/manufacturer")
	public Manufacturer updateManufacturer(@RequestBody @Valid Manufacturer manufacturer) {
		return manufacturerRepository.save(manufacturer);
	}
}
