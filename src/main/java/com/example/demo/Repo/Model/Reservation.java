package com.example.demo.Repo.Model;


import jakarta.persistence.*;
import jakarta.persistence.EmbeddedId;




@Entity
public class Reservation {
    @EmbeddedId
    public ReservationKey id;


    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("locationId")
    public Location location;


    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("treatmentId")
    public Treatment treatment;


    public String name;
    public String cnp;
    public Long hour;

    @Enumerated(EnumType.STRING)
    public ReservationStatus status;

    public Reservation() {
    }
}
