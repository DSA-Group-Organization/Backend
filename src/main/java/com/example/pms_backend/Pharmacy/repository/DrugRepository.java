package com.example.pms_backend.Pharmacy.repository;

import com.example.pms_backend.Pharmacy.model.Drug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrugRepository extends JpaRepository<Drug, Long> {
    // Additional query methods (if needed) can be defined here
}
