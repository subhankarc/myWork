package com.sap.casestudy.subhankar.ui;

public interface IMTSConstants {
	// Tree Nodes Label
		public static final String DEPLOYMENT_UNITS = "Deployment Units";
		public static final String PROCESS_COMPONENTS = "Process Components";
		public static final String BUSINESS_OBJECTS = "Business Objects";
		public static final String BUSINESS_OBJECT_NODES = "Business Object Nodes";

		// Wizard Pages / Editor Labels
		public static final String LBL_TECHNICAL_NAME = "Technical Name *: ";
		public static final String LBL_ABBREVIATION_NAME = "Abbreviation Name: ";
		public static final String LBL_SEMANTIC_NAME = "Semantic Name: ";

		public static final String LBL_CODE = "Code: ";
		public static final String LBL_NAMEKEY_NAME = "Namekey Name: ";
		public static final String LBL_NAMEKEY_NAMESPACE = "Namekey Namespace: ";
		public static final String LBL_CATEGORY = "Category: ";

		public static final String LBL_OBJECT_CATEGORY = "Object Category: ";
		public static final String LBL_PROVIDER_INTERFACE = "Provider Interface: ";
		public static final String LBL_PROVIDER_CLASS = "Provider Class: ";

		// Messages
		public static final String MSG_TECHNICAL_NAME_EMPTY = "Technical Name cannot be empty";
		public static final String MSG_DUPLICATE_TECHNICAL_NAME = "Object exists with similiar Technical Name";

		// BO Editor Name
		public static final String EDT_BO_NAME = "Business Object";
		public static final String EDT_BO_DESIGN_PAGE = "Business Object Design";
		public static final String EDT_BO_SOURCE_PAGE = "Busines Object Source";

		// BO Design Editor Section Title
		public static final String SECT_BO_INFO = "Business Object Info";
		public static final String SECT_ROOT_BO_NODE_INFO = "Root Business Object Node Info";
		public static final String SECT_BO_NODES_INFO = "Business Object Nodes Info";

		public static final String FILE_EXTENSION = ".";
		
		//BO Nodes Table Column Titles
		public static final String TBL_LBL_TECHNICAL_NAME = "Technical Name";
		public static final String TBL_LBL_CATEGORY = "Category";
		String MTS_PLUGIN_ID = "com.sap.casestudy.subhankar.ui";

		String MTS_PROJECT_NATURE_ID = "com.sap.casestudy.subhankar.ui.MyNature";
		String pattern = "[a-zA-Z0-9_]{1,40}";

}

