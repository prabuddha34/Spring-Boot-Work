package com.example.hospitalmanagement.repository;

import com.example.hospitalmanagement.entity.appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<appointment, Long> {

}