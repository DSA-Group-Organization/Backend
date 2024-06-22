package com.example.pms_backend.Pharmacy.repository;

import com.example.pms_backend.Pharmacy.model.PharmUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmUserRepository extends JpaRepository<PharmUser, Long> {
}
