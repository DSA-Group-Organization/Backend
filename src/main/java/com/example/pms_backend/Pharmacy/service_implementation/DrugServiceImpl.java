package com.example.pms_backend.Pharmacy.service_implementation;

import com.example.pms_backend.Pharmacy.model.Drug;
import com.example.pms_backend.Pharmacy.repository.DrugRepository;
import com.example.pms_backend.Pharmacy.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DrugServiceImpl implements DrugService {

    @Autowired
    private DrugRepository drugRepository;

    @Override
    public List<Drug> getAllDrugs() {
        return drugRepository.findAll();
    }

    @Override
    public Optional<Drug> getDrugById(Long id) {
        return drugRepository.findById(id);
    }

    @Override
    public Drug createDrug(Drug drug) {
        return drugRepository.save(drug);
    }

    @Override
    public Drug updateDrug(Long id, Drug drugDetails) {
        return drugRepository.findById(id)
                .map(drug -> {
                    drug.setDrugName(drugDetails.getDrugName());
                    drug.setQuantityInStock(drugDetails.getQuantityInStock());
                    drug.setUnitPrice(drugDetails.getUnitPrice());
                    drug.setCategory(drugDetails.getCategory());
                    return drugRepository.save(drug);
                })
                .orElseThrow(() -> new RuntimeException("Drug not found with id " + id));
    }

    @Override
    public void deleteDrug(Long id) {
        drugRepository.findById(id)
                .ifPresent(drugRepository::delete);
    }
}
