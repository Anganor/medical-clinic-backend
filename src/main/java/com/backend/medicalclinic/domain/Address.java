package com.backend.medicalclinic.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address {
    private String country;
    private String city;
    private String zipCode;
    private String streetName;
    private String buildingNumber;
    private String flatNumber;

    @Override
    public String toString() {
        return "Address:" + country + '\'' + city + '\'' + zipCode + '\'' + streetName + '\'' + buildingNumber + '\'' + flatNumber + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (country != null ? !country.equals(address.country) : address.country != null) return false;
        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        if (zipCode != null ? !zipCode.equals(address.zipCode) : address.zipCode != null) return false;
        if (streetName != null ? !streetName.equals(address.streetName) : address.streetName != null) return false;
        if (buildingNumber != null ? !buildingNumber.equals(address.buildingNumber) : address.buildingNumber != null)
            return false;
        return flatNumber != null ? flatNumber.equals(address.flatNumber) : address.flatNumber == null;
    }

    @Override
    public int hashCode() {
        int result = country != null ? country.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        result = 31 * result + (streetName != null ? streetName.hashCode() : 0);
        result = 31 * result + (buildingNumber != null ? buildingNumber.hashCode() : 0);
        result = 31 * result + (flatNumber != null ? flatNumber.hashCode() : 0);
        return result;
    }
}
