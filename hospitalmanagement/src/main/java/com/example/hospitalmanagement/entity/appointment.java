package com.example.hospitalmanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "appointment")
public class appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime time;

    @Column(nullable = false, length = 500)
    private String reason;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private doctor doctor;
}