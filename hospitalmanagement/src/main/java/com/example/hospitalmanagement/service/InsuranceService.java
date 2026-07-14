package com.example.hospitalmanagement.service;

import com.example.hospitalmanagement.entity.insurance;
import com.example.hospitalmanagement.entity.patient;
import com.example.hospitalmanagement.repository.InsuranceRepository;
import com.example.hospitalmanagement.repository.patientrepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InsuranceService {

    private final InsuranceRepository insuranceRepository;
    private final patientrepo patientRepo;

    @Transactional
    public patient assignInsurance(insurance insurance, Long patientId) {

        patient patient = patientRepo.findById(patientId)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Patient not found with id: " + patientId
                        )
                );

        patient.setInsurance(insurance);
        insurance.setPatient(patient);

        insuranceRepository.save(insurance);

        return patientRepo.save(patient);
    }
}