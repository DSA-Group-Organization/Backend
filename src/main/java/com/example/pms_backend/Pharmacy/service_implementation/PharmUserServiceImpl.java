package com.example.pms_backend.Pharmacy.service_implementation;

import com.example.pms_backend.Pharmacy.model.PharmUser;
import com.example.pms_backend.Pharmacy.service.PharmaUserService;
import com.example.pms_backend.Pharmacy.repository.PharmUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PharmUserServiceImpl implements PharmaUserService {

    @Autowired
    private PharmUserRepository pharmUserRepository;

    @Override
    public PharmUser createUser(PharmUser pharmUser) {
        return pharmUserRepository.save(pharmUser);
    }

    @Override
    public List<PharmUser> getAllUsers() {
        return pharmUserRepository.findAll();
    }

    @Override
    public Optional<PharmUser> getUserById(Long id) {
        return pharmUserRepository.findById(id);
    }

    @Override
    public PharmUser updateUser(Long id, PharmUser pharmUser) {
        pharmUser.setId(id);
        return pharmUserRepository.save(pharmUser);
    }

    @Override
    public void deleteUser(Long id) {
        pharmUserRepository.deleteById(id);
    }
}
