package com.customers;

import org.json.JSONException;
import org.json.JSONObject;

import com.db.access.JDBC;

public class Experiment {

	public static void main1(String ar){

//		String ar = "{\"lineofbusiness\": \"ves\",\"customerdetails\": {"
//				+ "\"customertype\": \"new\",\"customerid\": \"1234567\","
//				+ "\"fname\": \"suresh\"," + "\"lname\": \"siddharth\","
//				+ "\"connectionaddress\": {"
//				+ " \"streetname\": \"10, mg road\"," + "\"zipcode\": 560102,"
//				+ "\"city\": \"bangalore\"," + "\"state\": \"karnataka\","
//				+ "\"country\": \"india\"" + "}," + "\"billingaddress\": {"
//				+ "\"streetname\": \"10, mg road\"," + "\"zipcode\": 560102,"
//				+ "\"city\": \"bangalore\"," + "\"state\": \"karnataka\","
//				+ "\"country\": \"india\"" + "},"
//				+ "\"email\": \"suresh.siddharth@gmail.com\","
//				+ "\"contactnumber\":\"9500689870\","
//				+ "\"dateofbirth\": \"24-mar-1993\"" + "},"
//				+ "contractdetails:{" + "\"modeltype\":\"transactional|rtb\","
//				+ "\"classofservice\":\"platinum|gold|silver|bronze|normal\","
//				+ "\"fromdate\": \"18-aug-2015\","
//				+ "\"todate\":\"18-aug-2016\"," + "\"discountpercentage\":10"
//				+ "}}";
		System.out.println(ar);

		JSONObject obj;
		try {
			obj = new JSONObject(ar);

			
			System.out.println(obj.get("lineofbusiness").toString());
			
			
		DAOLookup.setcInfo(obj.get("lineofbusiness").toString());
		
		DAOFactory df = DAOLookup.getDAOObject();
		Bean bean = DAOLookup.getBeanObject();

		df.add(bean, obj);
		df.view(bean);
		System.out.println(JDBC.insert(bean));
		JDBC.viewvesdb();
		JDBC.viewcustomerdb();
		} catch (JSONException e) {
			e.printStackTrace();
		}

	}
}
