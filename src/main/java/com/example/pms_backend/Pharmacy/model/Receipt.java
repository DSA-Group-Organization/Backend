package com.example.pms_backend.Pharmacy.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "receipt")
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "drug_name")
    private String drugName;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "qty_bought")
    private int qtyBought;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "time")
    private Date time;

    // Constructors, getters, and setters

    public Receipt() {
    }

    public Receipt(Long id, String drugName, double unitPrice, int qtyBought, String customerName, Date time) {
        this.id = id;
        this.drugName = drugName;
        this.unitPrice = unitPrice;
        this.qtyBought = qtyBought;
        this.customerName = customerName;
        this.time = time;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQtyBought() {
        return qtyBought;
    }

    public void setQtyBought(int qtyBought) {
        this.qtyBought = qtyBought;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    // toString, equals, hashCode methods (optional)
}

