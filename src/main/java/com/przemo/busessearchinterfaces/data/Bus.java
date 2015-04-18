/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.przemo.busessearchinterfaces.data;

import java.util.Date;

/**
 *
 * @author Przemo
 */
public class Bus {

    public int getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Date getManufacturedOn() {
        return manufacturedOn;
    }

    public void setManufacturedOn(Date manufacturedOn) {
        this.manufacturedOn = manufacturedOn;
    }
    
    private int id;
    private String make;
    private Date manufacturedOn;
    
}
