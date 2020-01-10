package com.product.apirest.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TB_CLIENT")
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotNull
	private String name;
	
	@NotNull
	private BigDecimal rg;
	
	@NotNull
	private BigDecimal cpf;
	
	@NotNull
	private String adress;
	
	@NotNull
	private BigDecimal city;
	
	@NotNull
	private String region;
	
	@NotNull
	private String postalCode;
	
	@NotNull
	private String country;
	
	@NotNull
	private BigDecimal fone;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getRg() {
		return rg;
	}

	public void setRg(BigDecimal rg) {
		this.rg = rg;
	}

	public BigDecimal getCpf() {
		return cpf;
	}

	public void setCpf(BigDecimal cpf) {
		this.cpf = cpf;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public BigDecimal getCity() {
		return city;
	}

	public void setCity(BigDecimal city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public BigDecimal getFone() {
		return fone;
	}

	public void setFone(BigDecimal fone) {
		this.fone = fone;
	}	
}
