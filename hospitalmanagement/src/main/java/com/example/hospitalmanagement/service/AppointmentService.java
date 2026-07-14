package com.example.hospitalmanagement.service;

import com.example.hospitalmanagement.entity.appointment;
import com.example.hospitalmanagement.entity.doctor;
import com.example.hospitalmanagement.entity.patient;
import com.example.hospitalmanagement.repository.AppointmentRepository;
import com.example.hospitalmanagement.repository.DoctorRepository;
import com.example.hospitalmanagement.repository.patientrepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private final patientrepo patientRepo;
    private final AppointmentRepository appointmentRepo;
    private final DoctorRepository doctorRepo;

    @Transactional
    public appointment createNewAppointment(
            appointment appointment,
            Long patientId,
            Long doctorId
    ) {

        if (appointment.getId() != null) {
            throw new IllegalArgumentException(
                    "New appointment must not already have an ID"
            );
        }

        patient patient = patientRepo.findById(patientId)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Patient not found with id: " + patientId
                        )
                );

        doctor doctor = doctorRepo.findById(doctorId)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Doctor not found with id: " + doctorId
                        )
                );

        appointment.setPatient(patient);
        appointment.setDoctor(doctor);

        return appointmentRepo.save(appointment);
    }
}