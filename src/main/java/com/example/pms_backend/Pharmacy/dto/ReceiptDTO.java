package com.example.pms_backend.Pharmacy.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReceiptDTO {
    private Long id;
    private String drugName;
    private double unitPrice;
    private int qtyBought;
    private String customerName;
    private Date time;
}
