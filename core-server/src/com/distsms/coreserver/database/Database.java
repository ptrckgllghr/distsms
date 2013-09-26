/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.distsms.coreserver.database;

import org.hibernate.Session;

/**
 *
 * @author adeclerk
 */
public class Database {
    public static Session newSession() {
        return DatabaseUtility.getSessionFactory().openSession();
    }
}
