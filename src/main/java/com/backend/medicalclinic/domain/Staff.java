package com.backend.medicalclinic.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Staff {
    private int staffId;
    private String staffName;
    private String staffLastname;
    private String occupation;
    private ContactDetails staffContactDetails;
    private Address staffAddress;
}
