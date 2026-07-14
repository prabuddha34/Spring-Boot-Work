package com.example.hospitalmanagement.repository;

import com.example.hospitalmanagement.entity.doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<doctor, Long> {
}