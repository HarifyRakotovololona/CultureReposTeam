package com.culture.API.Models;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Plot implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlot;

    @ManyToOne
    @JoinColumn(name="idField")
    private Field field;

    @Basic
    private double area;

    @ManyToOne
    @JoinColumn(name="idGroundType")
    private GroundType groundType;

    public int getIdPlot() {
        return idPlot;
    }

    public void setIdPlot(int idPlot) {
        this.idPlot = idPlot;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public GroundType getGroundType() {
        return groundType;
    }

    public void setGroundType(GroundType groundType) {
        this.groundType = groundType;
    }

    public Plot(){

    }

}
