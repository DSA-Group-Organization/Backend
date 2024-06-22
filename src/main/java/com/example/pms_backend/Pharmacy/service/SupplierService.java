package com.example.pms_backend.Pharmacy.service;

import com.example.pms_backend.Pharmacy.model.Supplier;

import java.util.List;
import java.util.Optional;

public interface SupplierService {

    List<Supplier> getAllSuppliers();

    Optional<Supplier> getSupplierById(Long id);

    Supplier createSupplier(Supplier supplier);

    Supplier updateSupplier(Long id, Supplier supplierDetails);

    void deleteSupplier(Long id);
}
