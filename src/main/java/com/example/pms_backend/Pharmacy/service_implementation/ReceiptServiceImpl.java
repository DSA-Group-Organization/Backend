package com.example.pms_backend.Pharmacy.service_implementation;

import com.example.pms_backend.Pharmacy.model.Receipt;
import com.example.pms_backend.Pharmacy.repository.ReceiptRepository;
import com.example.pms_backend.Pharmacy.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReceiptServiceImpl implements ReceiptService {

    @Autowired
    private ReceiptRepository receiptRepository;

    @Override
    public List<Receipt> getAllReceipts() {
        return receiptRepository.findAll();
    }

    @Override
    public Optional<Receipt> getReceiptById(Long id) {
        return receiptRepository.findById(id);
    }

    @Override
    public Receipt createReceipt(Receipt receipt) {
        return receiptRepository.save(receipt);
    }

    @Override
    public Receipt updateReceipt(Long id, Receipt receiptDetails) {
        return receiptRepository.findById(id)
                .map(receipt -> {
                    receipt.setDrugName(receiptDetails.getDrugName());
                    receipt.setUnitPrice(receiptDetails.getUnitPrice());
                    receipt.setQtyBought(receiptDetails.getQtyBought());
                    receipt.setCustomerName(receiptDetails.getCustomerName());
                    receipt.setTime(receiptDetails.getTime());
                    return receiptRepository.save(receipt);
                })
                .orElseThrow(() -> new RuntimeException("Receipt not found with id " + id));
    }

    @Override
    public void deleteReceipt(Long id) {
        receiptRepository.findById(id)
                .ifPresent(receiptRepository::delete);
    }
}
