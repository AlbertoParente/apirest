package com.manage.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.manage.apirest.models.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long>{

	Supplier findById(long id);
}
