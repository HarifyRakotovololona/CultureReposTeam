package com.culture.API.Models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Field implements Serializable{
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int idField;
    
    @Basic
    private double latitude;

    @Basic
    private double longitude;

    @ManyToOne()
    @JoinColumn(name = "idOwner")
    private Owner owner;

    @OneToMany(mappedBy = "field", fetch = FetchType.EAGER)
    private List<Plot> plots;


    public Field() {

    }

    public int getIdField() {
        return idField;
    }

    public void setIdField(int idField) {
        this.idField = idField;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<Plot> getPlots() {
        return plots;
    }

    public void setPlots(List<Plot> plots) {
        this.plots = plots;
    }

}
