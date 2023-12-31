package com.example.admlab.dtos;

import java.time.LocalDateTime;

import com.example.admlab.models.CompoundModel.Measure;
import com.example.admlab.models.CompoundModel.PhysicalState;
import com.example.admlab.models.CompoundModel.SpecificRisks;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record CompoundRecordDTO(
        @NotNull String Formula,
        int PurityMainElement,
        @NotNull PhysicalState PhysicalState,
        @NotNull Measure Measure,
        LocalDateTime Expiration,
        String Title,
        @Max(4) @Min(0) @NotNull int Flammability,
        @Max(4) @Min(0) @NotNull int HealthRisks,
        @Max(4) @Min(0) @NotNull int Reactivity,
        SpecificRisks SpecificRisks) {

}
