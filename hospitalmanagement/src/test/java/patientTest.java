package com.example.hospitalmanagement;

import com.example.hospitalmanagement.entity.patient;
import com.example.hospitalmanagement.entity.type.bloodgroup;
import com.example.hospitalmanagement.repository.patientrepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PatientTest {

    @Autowired
    private patientrepo patientrepo;

    @Test
    void findPatientByBloodGroup() {

        List<patient> patients =
                patientrepo.findByBloodGroup(bloodgroup.A_POSITIVE);

        if (patients.isEmpty()) {
            System.out.println("No patients found");
        } else {
            patients.forEach(System.out::println);
        }
    }
}