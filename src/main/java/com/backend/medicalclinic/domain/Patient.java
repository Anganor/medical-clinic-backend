package com.backend.medicalclinic.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Patient {
    private int patientId;
    private String patientName;
    private String patientLastname;
    private Address patientAddress;
    private String gender;
    private ContactDetails patientContactDetails;
    private List<Appointment> appointments;
}
