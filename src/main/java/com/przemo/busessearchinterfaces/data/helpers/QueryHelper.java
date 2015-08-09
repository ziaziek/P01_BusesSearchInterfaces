/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.przemo.busessearchinterfaces.data.helpers;

import com.przemo.busessearchinterfaces.data.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Przemo
 */
public class QueryHelper {
    
    public static List getListFromSQLQuery(Class<?> classT, String qry){
        return runHelper(classT, qry);
    }
    
    public static List getListFromHQLQuery(String qry){
        return runHelper(null, qry);
    }
    
    private static List runHelper(Class<?> classT, String qry){
        Session s = HibernateUtil.openNewSession();
        List ret;
        if(classT!=null){
         ret = s.createSQLQuery(qry).addEntity(classT).list();   
        } else{
            ret = s.createQuery(qry).list();
        }
        s.close();
        return ret;
    }
}
