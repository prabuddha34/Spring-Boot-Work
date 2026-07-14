package com.example.hospitalmanagement.service;

import com.example.hospitalmanagement.entity.patient;
import com.example.hospitalmanagement.repository.patientrepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class patientservice {

    private final patientrepo patientrepo;

    @Transactional
    public patient getpatientbyid(long id) {

        patient p = patientrepo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Patient not found with id: " + id));

        p.setName("lolhomiesuckforlife");

        return patientrepo.save(p);
    }
}