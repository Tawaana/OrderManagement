package com.customers;

public class DAOLookup {
	
	static String cInfo;
	
	
	public static String getcInfo() {
		return cInfo;
	}

	public static void setcInfo(String cInfo) {
		DAOLookup.cInfo = cInfo;
	}

	public static DAOFactory getDAOObject() {
		DAOFactory returnObject;
		if (cInfo.equals("cmb")||cInfo.equals("vzw")) {
			
			returnObject = new CustomerDAO();
		} else if (cInfo.equals("ves")) {
			returnObject = new VESDAO();
		} else {
			returnObject = null;
		}
		return returnObject;
	}
	
	public static Bean getBeanObject() {
		Bean returnObject;
		if(cInfo.equals("cmb")||cInfo.equals("vzw"))
		{
			returnObject = new CustomerBean();
		}
		else if(cInfo.equals("ves"))
		{
			returnObject = new VESBean();
		}
		else
		{
			returnObject = null;
		}
		return returnObject;
	}
}
