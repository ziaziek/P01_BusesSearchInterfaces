/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.przemo.busessearchinterfaces.data;

import java.io.Serializable;

/**
 *
 * @author Przemo
 */
public class Line implements Serializable{

    public int getId() {
        return id;
    }
    
    private int id;
    private Line line;
    private Bus bus;
    
    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus idBus) {
        this.bus = idBus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    private String description;
    
}
