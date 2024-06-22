package com.example.pms_backend.Pharmacy.controller;

import com.example.pms_backend.Pharmacy.model.Drug;
import com.example.pms_backend.Pharmacy.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//import java.util.*;

@RestController
@RequestMapping("/drugs")
public class DrugController {
//    private final List<Drug> list;

    @Autowired
    private DrugService drugService;

//    public DrugController() {
//        // Initializing the list and adding a sample Drug object
//        list = new ArrayList<>();
//        list.add(new Drug(45L, "para", 45, 15.50, "category"));
//    }

    @GetMapping
    public List<Drug> getAllDrugs() {
        return drugService.getAllDrugs();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Drug> getDrugById(@PathVariable Long id) {
        return drugService.getDrugById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Drug createDrug(@RequestBody Drug drug) {
        return drugService.createDrug(drug);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Drug> updateDrug(@PathVariable Long id, @RequestBody Drug drugDetails) {
        return ResponseEntity.ok(drugService.updateDrug(id, drugDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDrug(@PathVariable Long id) {
        drugService.deleteDrug(id);
        return ResponseEntity.ok().build();
    }
}
