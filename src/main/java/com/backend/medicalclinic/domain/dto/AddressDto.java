package com.backend.medicalclinic.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddressDto {
    private String country;
    private String city;
    private String zipCode;
    private String streetName;
    private String buildingNumber;
    private String flatNumber;
}
