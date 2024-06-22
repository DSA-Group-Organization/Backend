package com.example.pms_backend.Pharmacy.controller;

import com.example.pms_backend.Pharmacy.model.PharmUser;
import com.example.pms_backend.Pharmacy.service.PharmaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pharmusers")
public class PharmUserController {

    private final PharmaUserService pharmUserService;

    @Autowired
    public PharmUserController(PharmaUserService pharmUserService) {
        this.pharmUserService = pharmUserService;
    }

    @GetMapping
    public List<PharmUser> getAllUsers() {
        return pharmUserService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PharmUser> getUserById(@PathVariable Long id) {
        return pharmUserService.getUserById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public PharmUser createUser(@RequestBody PharmUser user) {
        return pharmUserService.createUser(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PharmUser> updateUser(@PathVariable Long id, @RequestBody PharmUser userDetails) {
        return ResponseEntity.ok(pharmUserService.updateUser(id, userDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        pharmUserService.deleteUser(id);
        return ResponseEntity.ok().build();
    }
}
