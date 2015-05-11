package com.sap.casestudy.subhankar.persistence.impl;

import com.sap.casestudy.subhankar.persistence.IPersistenceFactory;
import com.sap.casestudy.subhankar.persistence.IPersistencyService;

public class PersistenceFactoryImpl implements IPersistenceFactory {
	
	
	private PersistenceFactoryImpl(){
		
	}
	public static IPersistenceFactory init()
	{
		if(implinstance==null)
		{
			return new PersistenceFactoryImpl();
		}
		else{
		return implinstance;
		}
	}
	@Override
	public IPersistencyService getInstance(String parentPath) {
		// TODO Auto-generated method stub
		return new PersistencyServiceImpl(parentPath);
	}
	
	
	
	
	

}
