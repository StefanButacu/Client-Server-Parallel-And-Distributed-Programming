package com.example.demo.Repo.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Treatment {

    @Id
    public String id;

    public int cost;

    public int duration;

    @OneToMany(mappedBy = "treatment", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<LocationTreatment> locationsList = new ArrayList<>();

    @OneToMany(mappedBy = "treatment", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<Reservation> reservations = new ArrayList<>();


    public Treatment() {
    }
}
