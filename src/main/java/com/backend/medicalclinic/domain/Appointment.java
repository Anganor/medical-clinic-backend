package com.backend.medicalclinic.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
public class Appointment {
    private int appointmentId;
    private LocalDate visitDate;
    private Doctor doctor;
    private Patient patient;
    private Staff staff;
    private HealthFacility healthFacility;
}
