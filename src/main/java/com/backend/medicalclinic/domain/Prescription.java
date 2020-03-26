package com.backend.medicalclinic.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Prescription {
    private int prescriptionId;
    private String prescriptionName;
    private String prescriptionDescription;
    private List<Medicines> medicinesList;
}
