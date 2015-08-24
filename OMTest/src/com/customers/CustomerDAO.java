package com.customers;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.json.JSONException;
import org.json.JSONObject;

public class CustomerDAO implements CustomerDAOInf {

	@Override
	public boolean add(Bean bean, JSONObject obj) {
		CustomerBean cbean = (CustomerBean) bean;
		try {
			cbean.setLineOfBusiness(obj.get("lineofbusiness").toString());

			cbean.setCustomerType("new");
			cbean.setfName((String) ((JSONObject) obj.get("customerdetails"))
					.get("fname"));
			cbean.setlName((String) ((JSONObject) obj.get("customerdetails"))
					.get("lname"));
			cbean.setConnectionAddress(((JSONObject) obj.get("customerdetails"))
					.get("connectionaddress").toString());
			cbean.setBillingAddress(((JSONObject) obj.get("customerdetails"))
					.get("billingaddress").toString());
			cbean.setEmailId((String) ((JSONObject) obj.get("customerdetails"))
					.get("email"));
			cbean.setContactNumber((String) ((JSONObject) obj
					.get("customerdetails")).get("contactnumber"));

			SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
			java.util.Date utilDate = formatter
					.parse((String) ((JSONObject) obj.get("customerdetails"))
							.get("dateofbirth"));

			Date date = new java.sql.Date(utilDate.getTime());
			cbean.setDateOfBirth(date);


		System.out.println(obj.get("lineofbusiness").toString()+"Customer added");
		} catch (JSONException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public void view(Bean bean) {
		CustomerBean cbean = (CustomerBean) bean;
		System.out.println(cbean);
	}

	@Override
	public boolean update(Bean changedRecord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CustomerBean display(String email, String customerid) {
		// TODO Auto-generated method stub
		return null;
	}
}
