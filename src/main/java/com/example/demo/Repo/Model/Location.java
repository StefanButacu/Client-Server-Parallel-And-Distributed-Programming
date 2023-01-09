package com.example.demo.Repo.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Location {

    @Id
    public String id;

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<LocationTreatment> treatmentList = new ArrayList<>();

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<Reservation> reservations = new ArrayList<>();

}
