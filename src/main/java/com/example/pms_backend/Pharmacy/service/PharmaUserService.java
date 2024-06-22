package com.example.pms_backend.Pharmacy.service;

import com.example.pms_backend.Pharmacy.model.PharmUser;

import java.util.List;
import java.util.Optional;

public interface PharmaUserService {
    PharmUser createUser(PharmUser pharmUser);
    List<PharmUser> getAllUsers();
    Optional<PharmUser> getUserById(Long id);
    PharmUser updateUser(Long id, PharmUser pharmUser);
    void deleteUser(Long id);
}
