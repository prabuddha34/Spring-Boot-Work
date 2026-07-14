package com.example.hospitalmanagement;

import com.example.hospitalmanagement.entity.insurance;
import com.example.hospitalmanagement.entity.patient;
import com.example.hospitalmanagement.entity.type.bloodgroup;
import com.example.hospitalmanagement.repository.patientrepo;
import com.example.hospitalmanagement.service.InsuranceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class InsuranceTests {

    @Autowired
    private InsuranceService insuranceService;

    @Autowired
    private patientrepo patientRepo;

    @Test
    void insuranceTest() {

        LocalDate dob = LocalDate.of(1998, 5, 15);

        patient patient = patientRepo
                .findByNameAndDob("John Doe", dob)
                .orElseGet(() -> {
                    patient newPatient = new patient();

                    newPatient.setName("John Doe");
                    newPatient.setEmail("john123@example.com");
                    newPatient.setGender("Male");
                    newPatient.setDob(dob);
                    newPatient.setBloodGroup(bloodgroup.A_POSITIVE);

                    return patientRepo.save(newPatient);
                });

        insurance insurance = new insurance();

        insurance.setPolicyNumber(
                "POL" + System.currentTimeMillis()
        );
        insurance.setProvider("Star Health");
        insurance.setValidUntil(LocalDate.of(2027, 12, 31));

        patient updatedPatient = insuranceService.assignInsurance(
                insurance,
                patient.getId()
        );

        System.out.println("Patient ID: " + updatedPatient.getId());
        System.out.println("Patient name: " + updatedPatient.getName());
        System.out.println(
                "Policy number: " +
                        updatedPatient.getInsurance().getPolicyNumber()
        );
        System.out.println(
                "Provider: " +
                        updatedPatient.getInsurance().getProvider()
        );
    }
}