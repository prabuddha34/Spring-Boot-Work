package com.example.hospitalmanagement.repository;

import com.example.hospitalmanagement.entity.patient;
import com.example.hospitalmanagement.entity.type.bloodgroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface patientrepo extends JpaRepository<patient, Long> {

    Optional<patient> findByName(String name);

    Optional<patient> findByDob(LocalDate dob);

    Optional<patient> findByNameAndDob(String name, LocalDate dob);

    List<patient> findByBloodGroup(bloodgroup bloodGroup);
}