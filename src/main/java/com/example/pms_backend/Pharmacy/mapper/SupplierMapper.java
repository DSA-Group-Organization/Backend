package com.example.pms_backend.Pharmacy.mapper;

import com.example.pms_backend.Pharmacy.dto.SupplierDTO;
import com.example.pms_backend.Pharmacy.model.Supplier;

public class SupplierMapper {
    public static SupplierDTO mapToSupplierDTO(Supplier supplier) {
        return new SupplierDTO(
                supplier.getId(),
                supplier.getSupplierName(),
                supplier.getSupplierEmail(),
                supplier.getDrugName()
        );
    }

    public static Supplier mapToSupplier(SupplierDTO supplierDTO) {
        return new Supplier(
                supplierDTO.getId(),
                supplierDTO.getSupplierName(),
                supplierDTO.getSupplierEmail(),
                supplierDTO.getDrugName()
        );
    }
}
