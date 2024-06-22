package com.example.pms_backend.Pharmacy.service;

import com.example.pms_backend.Pharmacy.model.Receipt;

import java.util.List;
import java.util.Optional;

public interface ReceiptService {

    List<Receipt> getAllReceipts();

    Optional<Receipt> getReceiptById(Long id);

    Receipt createReceipt(Receipt receipt);

    Receipt updateReceipt(Long id, Receipt receiptDetails);

    void deleteReceipt(Long id);
}
