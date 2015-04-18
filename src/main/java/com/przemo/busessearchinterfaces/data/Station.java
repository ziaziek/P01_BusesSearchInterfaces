/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.przemo.busessearchinterfaces.data;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Przemo
 */
public class Station implements Serializable{

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    private int id;
    private String name;
    
    public Station(int id, String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Station){
            return ((Station)obj).getId()==this.getId() && ((Station)obj).getName().equals(this.getName());
        }else {
          return super.equals(obj);  
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.name);
        return hash;
    }
    
}
