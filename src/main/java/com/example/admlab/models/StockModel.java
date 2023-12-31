package com.example.admlab.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Stock")
public class StockModel {

    public static enum StockStatus {
        Unimpeded,
        Blocked,
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Code;

    private CompoundModel Compound;
    private StockStatus StockStatus;
    private double Amount;

    public CompoundModel getCompound() {
        return Compound;
    }

    public void setCompound(CompoundModel compound) {
        Compound = compound;
    }

    public StockStatus getStockStatus() {
        return StockStatus;
    }

    public void setStockStatus(StockStatus stockStatus) {
        StockStatus = stockStatus;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }
}
