package com.example.admlab.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.admlab.dtos.EquipmentRecordDTO;
import com.example.admlab.models.EquipmentModel;
import com.example.admlab.repositories.EquipmentRepository;

import jakarta.validation.Valid;

public class EquipmentController {
    @Autowired
    EquipmentRepository CompoundRepository;

    @PostMapping("/compound")
    public ResponseEntity<EquipmentModel> saveProduct(@RequestBody @Valid EquipmentRecordDTO equipment) {
        var equipmentModel = new EquipmentModel();

        BeanUtils.copyProperties(equipment, equipmentModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(CompoundRepository.save(equipmentModel));
    }
}
