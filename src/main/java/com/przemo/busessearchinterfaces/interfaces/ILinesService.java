/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.przemo.busessearchinterfaces.interfaces;

import com.przemo.busessearchinterfaces.data.Line;
import com.przemo.busessearchinterfaces.data.Station;

/**
 *
 * @author Przemo
 */
public interface ILinesService {
    
    Line getLineForStations(Station stationFrom, Station stationTo);
    
}
