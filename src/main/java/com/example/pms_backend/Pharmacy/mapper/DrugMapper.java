package com.example.pms_backend.Pharmacy.mapper;

import com.example.pms_backend.Pharmacy.dto.DrugDTO;
import com.example.pms_backend.Pharmacy.model.Drug;

public class DrugMapper {
    public static DrugDTO mapToDrugDTO(Drug drug) {
        return new DrugDTO(
                drug.getDrugId(),
                drug.getDrugName(),
                drug.getQuantityInStock(),
                drug.getUnitPrice(),
                drug.getCategory()
        );
    }

    public static Drug mapToDrug(DrugDTO drugDTO) {
        return new Drug(
                drugDTO.getId(),
                drugDTO.getDrugName(),
                drugDTO.getQuantityInStock(),
                drugDTO.getUnitPrice(),
                drugDTO.getCategory()
        );
    }
}
