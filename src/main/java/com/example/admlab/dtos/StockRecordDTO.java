package com.example.admlab.dtos;

import com.example.admlab.models.CompoundModel;
import com.example.admlab.models.StockModel.StockStatus;

import jakarta.validation.constraints.NotNull;

public record StockRecordDTO(
        @NotNull CompoundModel Compound,
        @NotNull StockStatus StockStatus,
        @NotNull double Amount) {

}
