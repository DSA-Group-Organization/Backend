package com.example.pms_backend.Pharmacy.mapper;

import com.example.pms_backend.Pharmacy.dto.ReceiptDTO;
import com.example.pms_backend.Pharmacy.model.Receipt;

public class ReceiptMapper {
    public static ReceiptDTO mapToReceiptDTO(Receipt receipt) {
        return new ReceiptDTO(
                receipt.getId(),
                receipt.getDrugName(),
                receipt.getUnitPrice(),
                receipt.getQtyBought(),
                receipt.getCustomerName(),
                receipt.getTime()
        );
    }

    public static Receipt mapToReceipt(ReceiptDTO receiptDTO) {
        return new Receipt(
                receiptDTO.getId(),
                receiptDTO.getDrugName(),
                receiptDTO.getUnitPrice(),
                receiptDTO.getQtyBought(),
                receiptDTO.getCustomerName(),
                receiptDTO.getTime()
        );
    }
}
