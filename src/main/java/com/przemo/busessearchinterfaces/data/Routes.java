package com.przemo.busessearchinterfaces.data;
// Generated 2015-08-09 11:52:28 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Routes generated by hbm2java
 */
public class Routes  implements java.io.Serializable {


     private int id;
     private Integer idStationFrom;
     private int idStation;
     private Date arrivalTime;
     private Date departureTime;
     private Integer idLines;

    public Routes() {
    }

	
    public Routes(int id, int idStation) {
        this.id = id;
        this.idStation = idStation;
    }
    public Routes(int id, Integer idStationFrom, int idStation, Date arrivalTime, Date departureTime, Integer idLines) {
       this.id = id;
       this.idStationFrom = idStationFrom;
       this.idStation = idStation;
       this.arrivalTime = arrivalTime;
       this.departureTime = departureTime;
       this.idLines = idLines;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Integer getIdStationFrom() {
        return this.idStationFrom;
    }
    
    public void setIdStationFrom(Integer idStationFrom) {
        this.idStationFrom = idStationFrom;
    }
    public int getIdStation() {
        return this.idStation;
    }
    
    public void setIdStation(int idStation) {
        this.idStation = idStation;
    }
    public Date getArrivalTime() {
        return this.arrivalTime;
    }
    
    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public Date getDepartureTime() {
        return this.departureTime;
    }
    
    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }
    public Integer getIdLines() {
        return this.idLines;
    }
    
    public void setIdLines(Integer idLines) {
        this.idLines = idLines;
    }




}


