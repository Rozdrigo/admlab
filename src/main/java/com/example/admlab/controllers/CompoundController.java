package com.example.admlab.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.admlab.dtos.CompoundRecordDTO;
import com.example.admlab.models.CompoundModel;
import com.example.admlab.repositories.CompoundRepository;

import jakarta.validation.Valid;

public class CompoundController {
    @Autowired
    CompoundRepository CompoundRepository;

    @PostMapping("/compound")
    public ResponseEntity<CompoundModel> saveProduct(@RequestBody @Valid CompoundRecordDTO compound) {
        var compoundModel = new CompoundModel();

        BeanUtils.copyProperties(compound, compoundModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(CompoundRepository.save(compoundModel));
    }
}
