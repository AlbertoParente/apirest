package com.manage.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manage.apirest.models.Manufacturer;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long>{

	Manufacturer findById(long id);
}
