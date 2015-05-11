package com.sap.casestudy.subhankar.persistence;

import com.sap.casestudy.subhankar.persistence.impl.PersistenceFactoryImpl;

public interface IPersistenceFactory {

	public static IPersistenceFactory implinstance= PersistenceFactoryImpl.init();
	
	public IPersistencyService getInstance(String parentPath);

}
