package com.example.pms_backend.Pharmacy.repository;

import com.example.pms_backend.Pharmacy.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
