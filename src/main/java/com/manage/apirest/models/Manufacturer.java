package com.manage.apirest.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="TB_MANUFACTURER")
public class Manufacturer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotNull
	private String name;
	
	@NotNull
	private BigDecimal cnpj;
	
	@NotNull
	private BigDecimal stateRegistration;
	
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

	public BigDecimal getCnpj() {
		return cnpj;
	}

	public void setCnpj(BigDecimal cnpj) {
		this.cnpj = cnpj;
	}

	public BigDecimal getStateRegistration() {
		return stateRegistration;
	}

	public void setStateRegistration(BigDecimal stateRegistration) {
		this.stateRegistration = stateRegistration;
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
