/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.przemo.busessearchinterfaces.interfaces;

import com.przemo.busessearchinterfaces.data.Lines;
import com.przemo.busessearchinterfaces.data.Stations;
import java.util.List;

/**
 *
 * @author Przemo
 */
public interface ILinesService {
    
    List<Lines> getLinesForStations(Stations stationFrom, Stations stationTo);
    
}
