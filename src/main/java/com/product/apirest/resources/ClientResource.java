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

import com.product.apirest.models.Client;
import com.product.apirest.models.Product;
import com.product.apirest.repository.ClientRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins= "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Client")
public class ClientResource {

	@Autowired
	ClientRepository clientRepository;
	
	@ApiOperation(value="Return List Clients")
	@GetMapping("/clients")
	public List<Client> listClients() {
		return clientRepository.findAll();
	}
	
	@ApiOperation(value="Return Unique Client")
	@GetMapping("/client/{id}")
	public Client listClientId(@PathVariable(value="id") long id) {
		return clientRepository.findById(id);
	}
	
	@ApiOperation(value="Save a Client")
	@PostMapping("/client")
	public Client saveClient(@RequestBody @Valid Client client) {
		return clientRepository.save(client);
	}
	
	@ApiOperation(value="Delete a Client")
	@DeleteMapping("/client")
	public void deleteClient(@RequestBody @Valid Client client) {
		clientRepository.delete(client);
	}
	
	@ApiOperation(value="Update a Client")
	@PutMapping("/client")
	public Client updateClient(@RequestBody @Valid Client client) {
		return clientRepository.save(client);
	}
}
