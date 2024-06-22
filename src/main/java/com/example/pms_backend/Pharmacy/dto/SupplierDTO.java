package com.example.pms_backend.Pharmacy.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SupplierDTO {

    private Long id;
    private String supplierName;
    private String supplierEmail;
    private String drugName;

    // You can add additional fields and methods as needed
}
