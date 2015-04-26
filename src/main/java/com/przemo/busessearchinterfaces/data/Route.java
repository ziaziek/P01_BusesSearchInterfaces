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
public class Route {
    
    private int id;

    public int getId() {
        return id;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station idStation) {
        this.station = idStation;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    private Station station;
    private String arrivalTime;
    private String departureTime;
    
}
