/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.distsms.coreserver.auth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author adeclerk
 */
@Entity
@Table(name="core_user")
@GenericGenerator(name="incr", strategy="increment")
public class UserEntity {
    
    @Id
    @GeneratedValue(generator="incr")
    private int userid;
    
    @Column(length=20)
    private String username;
    
    @Column(length=120)
    private String password;

    /**
     * @return the userid
     */
    public int getUserid() {
        return userid;
    }

    /**
     * @param userid the userid to set
     */
    public void setUserid(int userid) {
        this.userid = userid;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
