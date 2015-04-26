/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.przemo.busessearchinterfaces.interfaces;

import com.przemo.busessearchinterfaces.data.Route;
import com.przemo.busessearchinterfaces.data.Station;

/**
 *
 * @author Przemo
 */
public interface IRoutesService {
    
    Route findRoutesBetween(Station stationFrom, Station stationTo);
    
}
