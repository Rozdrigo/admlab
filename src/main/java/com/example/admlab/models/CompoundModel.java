package com.example.admlab.models;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Compound")
public class CompoundModel {

    public static enum Measure {
        t,
        kg,
        g,
        mg,
    }

    public static enum PhysicalState {
        Solid,
        Liquid,
        Gas,
        Plasma,
        BoseEinstein
    }

    public static enum SpecificRisks {
        OX,
        ACID,
        ALK,
        COR,
        W
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID CompoundId;

    @NotNull
    private String Formula;

    private int PurityMainElement;

    @NotNull
    private PhysicalState PhysicalState;

    @NotNull
    private Measure Measure;

    private LocalDateTime Expiration;

    private String Title;

    @Max(4)
    @Min(0)
    @NotNull
    private int Flammability;

    @Max(4)
    @Min(0)
    @NotNull
    private int HealthRisks;

    @Max(4)
    @Min(0)
    @NotNull
    private int Reactivity;

    private SpecificRisks SpecificRisks;

    public int getFlammability() {
        return Flammability;
    }

    public void setFlammability(int flammability) {
        Flammability = flammability;
    }

    public int getHealthRisks() {
        return HealthRisks;
    }

    public void setHealthRisks(int healthRisks) {
        HealthRisks = healthRisks;
    }

    public int getReactivity() {
        return Reactivity;
    }

    public void setReactivity(int reactivity) {
        Reactivity = reactivity;
    }

    public SpecificRisks getSpecificRisks() {
        return SpecificRisks;
    }

    public void setSpecificRisks(SpecificRisks specificRisks) {
        SpecificRisks = specificRisks;
    }

    public String getFormula() {
        return Formula;
    }

    public void setFormula(String formula) {
        Formula = formula;
    }

    public int getPurityMainElement() {
        return PurityMainElement;
    }

    public void setPurityMainElement(int purityMainElement) {
        PurityMainElement = purityMainElement;
    }

    public PhysicalState getPhysicalState() {
        return PhysicalState;
    }

    public void setPhysicalState(PhysicalState physicalState) {
        PhysicalState = physicalState;
    }

    public Measure getMeasure() {
        return Measure;
    }

    public void setMeasure(Measure measure) {
        Measure = measure;
    }

    public LocalDateTime getExpiration() {
        return Expiration;
    }

    public void setExpiration(LocalDateTime expiration) {
        Expiration = expiration;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
