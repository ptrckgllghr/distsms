/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.distsms.coreserver.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.SettingsFactory;

/**
 *
 * @author adeclerk
 */
public class DatabaseUtility {
    private static SessionFactory factory = null;
    
    private DatabaseUtility() { } 
    
    public static SessionFactory getSessionFactory() {
        if(DatabaseUtility.factory == null)
            DatabaseUtility.factory = new AnnotationConfiguration().configure("./com/distsms/coreserver/hibernate/hibernate.cfg.xml").buildSessionFactory();
        return DatabaseUtility.factory;
            
    }
}
