package com.example.pms_backend.Pharmacy.service;

import com.example.pms_backend.Pharmacy.model.Drug;

import java.util.List;
import java.util.Optional;

public interface DrugService {

    List<Drug> getAllDrugs();

    Optional<Drug> getDrugById(Long id);

    Drug createDrug(Drug drug);

    Drug updateDrug(Long id, Drug drugDetails);

    void deleteDrug(Long id);
}
