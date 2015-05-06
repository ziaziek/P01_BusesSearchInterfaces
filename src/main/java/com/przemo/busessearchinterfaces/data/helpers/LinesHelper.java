/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.przemo.busessearchinterfaces.data.helpers;

import com.przemo.busessearchinterfaces.data.Lines;
import com.przemo.busessearchinterfaces.data.Routes;
import com.przemo.busessearchinterfaces.data.Stations;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Przemo
 */
public class LinesHelper {
    
    public static List<Lines> filterLinesFromTo(List<Lines> linesList, Stations from, Stations to){
        List<Lines> result = new ArrayList<>();
        for(Lines l:linesList){
            if(l.getRouteses()!=null && !l.getRouteses().isEmpty() && l.getRouteses().contains(from) && l.getRouteses().contains(to) && isStationFromToValid(l,from, to)){
                result.add(l);
            }
        }
        return result;
    }

    private static boolean isStationFromToValid(Lines l, Stations from, Stations to) {
        Iterator<Routes> rit = l.getRouteses().iterator();
        Date dep = null, arr = null;
        while(rit.hasNext() && dep==null && arr==null){
            Routes currentRoute = rit.next();
            if(currentRoute.getStationsByIdStation().getId()==from.getId()){
               dep=currentRoute.getDepartureTime();
            } else if(currentRoute.getStationsByIdStation().getId()==to.getId()){
                arr=currentRoute.getArrivalTime();
            }
        }
        return (dep!=null && arr!=null && dep.before(arr));
    }
}
