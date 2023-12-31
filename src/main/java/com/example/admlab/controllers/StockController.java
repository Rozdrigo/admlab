package com.example.admlab.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.admlab.dtos.StockRecordDTO;
import com.example.admlab.models.StockModel;
import com.example.admlab.repositories.StockRepository;

import jakarta.validation.Valid;

public class StockController {
    @Autowired
    StockRepository StockRepository;

    @PostMapping("/Stock")
    public ResponseEntity<StockModel> saveProduct(@RequestBody @Valid StockRecordDTO stock) {
        var stockModel = new StockModel();

        BeanUtils.copyProperties(stock, stockModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(StockRepository.save(stockModel));
    }
}
