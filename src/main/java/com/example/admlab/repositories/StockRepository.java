package com.example.admlab.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.admlab.models.StockModel;

public interface StockRepository extends JpaRepository<StockModel, UUID>{
    
}
