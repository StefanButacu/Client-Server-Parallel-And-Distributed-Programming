package com.example.demo.Repo.Model;


import jakarta.persistence.*;

@Entity
public class LocationTreatment {
    @EmbeddedId
    public LocationTreatmentKey id;


    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("locationId")
    public Location location;


    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("treatmentId")
    public Treatment treatment;


    public Long capacity;



}
