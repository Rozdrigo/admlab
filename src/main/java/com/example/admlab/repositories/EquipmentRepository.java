package com.example.admlab.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.admlab.models.EquipmentModel;

public interface EquipmentRepository extends JpaRepository<EquipmentModel, UUID>{
    
}
