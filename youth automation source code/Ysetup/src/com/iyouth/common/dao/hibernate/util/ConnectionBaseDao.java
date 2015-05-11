/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iyouth.common.dao.hibernate.util;



import java.sql.Connection;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author sumanta
 */
public class ConnectionBaseDao {

    private Session sessionDB;
    private Transaction trans;
    private Connection dbConnection;

    public ConnectionBaseDao() {
        sessionDB = YouthConnectionUtil.getSessionFactory().openSession();
        trans = sessionDB.beginTransaction();
        dbConnection=sessionDB.connection();
    }

    public Session getDataBaseSession() {
        sessionDB.clear();
        return sessionDB;
    }

    public void beginTransaction() {
        trans.begin();
    }

    public void commitTransaction() {
        trans.commit();
    }

	public Connection getDbConnection() {
		return dbConnection;
	}

	public void rollBackTransaction() {
        trans.rollback();
    }
    
   
}
