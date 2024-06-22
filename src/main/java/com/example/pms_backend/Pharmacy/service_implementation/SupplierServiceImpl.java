package com.example.pms_backend.Pharmacy.service_implementation;

import com.example.pms_backend.Pharmacy.model.Supplier;
import com.example.pms_backend.Pharmacy.repository.SupplierRepository;
import com.example.pms_backend.Pharmacy.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    @Override
    public Optional<Supplier> getSupplierById(Long id) {
        return supplierRepository.findById(id);
    }

    @Override
    public Supplier createSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public Supplier updateSupplier(Long id, Supplier supplierDetails) {
        return supplierRepository.findById(id)
                .map(supplier -> {
                    supplier.setSupplierName(supplierDetails.getSupplierName());
                    supplier.setSupplierEmail(supplierDetails.getSupplierEmail());
                    supplier.setDrugName(supplierDetails.getDrugName());
                    return supplierRepository.save(supplier);
                })
                .orElseThrow(() -> new RuntimeException("Supplier not found with id " + id));
    }

    @Override
    public void deleteSupplier(Long id) {
        supplierRepository.findById(id)
                .ifPresent(supplierRepository::delete);
    }
}
