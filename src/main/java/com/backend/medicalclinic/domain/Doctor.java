package com.backend.medicalclinic.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Doctor {
    private int docId;
    private String docName;
    private String docLastname;
    private String docSpecialization;
    private ContactDetails docContactDetails;
    private Address docAddress;
}
