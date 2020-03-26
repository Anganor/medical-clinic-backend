package com.backend.medicalclinic.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class HealthFacility {
    private int facilityId;
    private String facilityName;
    private ContactDetails facilityContactDetails;
    private Address facilityAddress;
    private List<Staff> facilityStaff;
    private List<Doctor> facilityDoctors;
}
