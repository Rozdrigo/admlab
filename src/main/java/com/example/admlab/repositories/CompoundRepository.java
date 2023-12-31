package com.example.admlab.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.admlab.models.CompoundModel;

@Repository
public interface CompoundRepository extends JpaRepository<CompoundModel, UUID> {

}
