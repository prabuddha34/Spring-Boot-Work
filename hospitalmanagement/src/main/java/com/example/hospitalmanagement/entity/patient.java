package com.example.hospitalmanagement.entity;

import com.example.hospitalmanagement.entity.type.bloodgroup;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@Table(
        name = "patient",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "unique_patient_email",
                        columnNames = {"email"}
                ),
                @UniqueConstraint(
                        name = "unique_patient_name_dob",
                        columnNames = {"patient_name", "dob"}
                )
        },
        indexes = {
                @Index(
                        name = "idx_patient_dob",
                        columnList = "dob"
                )
        }
)
public class patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "patient_name")
    private String name;

    private LocalDate dob;

    private String email;

    private String gender;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    @Column(name = "blood_group")
    private bloodgroup bloodGroup;

    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JoinColumn(name = "insurance_id", referencedColumnName = "id")
    private insurance insurance;


}