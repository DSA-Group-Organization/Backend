package com.example.pms_backend.Pharmacy.repository;

import com.example.pms_backend.Pharmacy.model.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, Long> {
}
