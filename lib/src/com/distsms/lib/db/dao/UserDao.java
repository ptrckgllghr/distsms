/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.distsms.lib.db.dao;

import com.distsms.lib.db.DatabaseUtility;
import com.distsms.lib.db.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author adeclerk
 */
public class UserDao {
    
    public void create(UserEntity user) {
        Session sess = DatabaseUtility.getSession();
        Transaction trans = sess.beginTransaction();
        sess.persist(user);
        trans.commit();
        sess.close();
    }
    
    public void update(UserEntity user) {
        
    }
    
    public void read(UserEntity user) {
        
    }
    
    public void delete(UserEntity user) {
        
    }
}
