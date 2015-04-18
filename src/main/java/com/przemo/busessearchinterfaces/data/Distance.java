/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.przemo.busessearchinterfaces.data;

/**
 *
 * @author Przemo
 */
public class Distance {
    
    private int id;

    public int getId() {
        return id;
    }

    public int getIdStationFrom() {
        return idStationFrom;
    }

    public int getIdStationTo() {
        return idStationTo;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    private int idStationFrom;
    private int idStationTo;
    private double distance; //(km)
    
    
}
