package com.example.hospitalmanagement.repository;

import com.example.hospitalmanagement.entity.department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<department, Long> {
}