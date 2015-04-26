/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.przemo.busessearchinterfaces.data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Przemo
 */
@Entity
public class Bus implements Serializable {

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
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String make;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date manufacturedOn;
    
}
