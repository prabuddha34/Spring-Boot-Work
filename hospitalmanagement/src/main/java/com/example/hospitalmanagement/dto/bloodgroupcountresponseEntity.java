package com.example.hospitalmanagement.dto;

import com.example.hospitalmanagement.entity.type.bloodgroup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class bloodgroupcountresponseEntity {
private bloodgroup bloodgroup;
private  Long count;
}
