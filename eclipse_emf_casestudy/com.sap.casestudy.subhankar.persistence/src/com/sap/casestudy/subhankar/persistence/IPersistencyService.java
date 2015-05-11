package com.sap.casestudy.subhankar.persistence;

import java.util.List;

import org.eclipse.core.runtime.IPath;

import com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit;
import com.sap.casestudy.subhankar.casestudymodel.IAdtMainObject;

public interface IPersistencyService {
	
//public boolean saveAll( IAdtMainObject object, IPath path);

public boolean save (IAdtMainObject object , IPath path);

public List<DeploymentUnit> load (IPath path);




//public List<IAdtMainObject> loadAll (IPath path);





//public void setParentPath(String path);


//public String getParentPath();

}
