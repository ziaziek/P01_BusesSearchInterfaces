/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.przemo.busessearchinterfaces.data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Przemo
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
    
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    
    public static Session openNewSession(){
        return sessionFactory.openSession();
    }
}
