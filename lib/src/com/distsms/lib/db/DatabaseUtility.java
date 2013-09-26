/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.distsms.lib.db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.Session;

/**
 *
 * @author adeclerk
 */
public class DatabaseUtility {
    private static SessionFactory session = null;
    
    private DatabaseUtility() { }
    
    public static SessionFactory getSessionFactory() {
        if(DatabaseUtility.session == null) 
            DatabaseUtility.session = new AnnotationConfiguration().configure().buildSessionFactory();
        return DatabaseUtility.session;
    }
    
    public static Session getSession() {
        return DatabaseUtility.getSessionFactory().openSession();
    }
}
