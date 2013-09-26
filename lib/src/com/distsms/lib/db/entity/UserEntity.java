/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.distsms.lib.db.entity;

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
@Table(name="user")
@GenericGenerator(name="incr", strategy="increment")
public class UserEntity {
    
    @Id
    @GeneratedValue(generator="incr")
    private long userid;
    
    @Column(length=20)
    private String username;
    
    @Column(length=100)
    private String password;
    
    @Column(length=45)
    private String email;

    /**
     * @return the userid
     */
    public long getUserid() {
        return userid;
    }

    /**
     * @param userid the userid to set
     */
    public void setUserid(long userid) {
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

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
