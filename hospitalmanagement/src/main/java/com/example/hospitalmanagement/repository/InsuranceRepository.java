package com.example.hospitalmanagement.repository;

import com.example.hospitalmanagement.entity.insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<insurance, Long> {
}