/**
 * @(#) User.java Created on 2014-11-4
 *
 * Copyright (c) 2014 Aspire. All Rights Reserved
 */
package com.zilee.jinlinclient.bean;

import java.io.Serializable;

/**
 * The class <code>User</code>
 *
 * @version 1.0
 */
public class User implements Serializable{

    /**
     * Serializable id
     */
    private static final long serialVersionUID = 1L;
    
    private String userName ;
    private String passwd;
    private String confirmPasswd;
    private String nickName;
    private String headPath;
    
    public User(){}
    
}
