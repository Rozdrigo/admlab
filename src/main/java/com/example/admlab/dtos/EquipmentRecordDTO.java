package com.example.admlab.dtos;

import com.example.admlab.models.EquipmentModel;
import jakarta.validation.constraints.NotNull;

public record EquipmentRecordDTO(
        @NotNull String Name,
        @NotNull String Description,
        @NotNull EquipmentModel.Status EquipamentStatus,
        @NotNull EquipmentModel.Type EquipamentType) {

}
