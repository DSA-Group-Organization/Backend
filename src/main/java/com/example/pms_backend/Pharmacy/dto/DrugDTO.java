package com.example.pms_backend.Pharmacy.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DrugDTO {

    private Long id;
    private String drugName;
    private int quantityInStock;
    private double unitPrice;
    private String category;

    // You can add additional fields and methods as needed
}
