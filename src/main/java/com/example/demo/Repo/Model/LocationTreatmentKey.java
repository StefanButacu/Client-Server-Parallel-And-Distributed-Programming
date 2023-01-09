package com.example.demo.Repo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class LocationTreatmentKey implements Serializable {

    @Column(name = "location_id")
    public String locationId;


    @Column(name = "treatment_id")
    public String treatmentId;

    public LocationTreatmentKey() {
    }

    public LocationTreatmentKey(String locationId, String treatmentId) {
        this.locationId = locationId;
        this.treatmentId = treatmentId;
    }
}
