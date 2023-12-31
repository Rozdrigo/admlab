package com.example.admlab.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Equipment")
public class EquipmentModel {

    public static enum Status {
        Busy,
        Available,
        Broken,
    }

    public static enum Type {
        Container,
        Machinery,
        Tools,
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID EquipmentId;

    @NotNull
    private String Name;

    @NotNull
    private String Description;

    @NotNull
    private Status EquipamentStatus;

    @NotNull
    private Type EquipamentType;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Status getEquipamentStatus() {
        return EquipamentStatus;
    }

    public void setEquipamentStatus(Status equipamentStatus) {
        EquipamentStatus = equipamentStatus;
    }

    public Type getEquipamentType() {
        return EquipamentType;
    }

    public void setEquipamentType(Type equipamentType) {
        EquipamentType = equipamentType;
    }
}
