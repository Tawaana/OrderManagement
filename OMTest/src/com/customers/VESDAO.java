package com.customers;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.json.JSONException;
import org.json.JSONObject;

public class VESDAO implements VESDAOInf {

	@Override
	public VESBean display(String customerid) {
		return null;
	}

	@Override
	public boolean add(Bean bean, JSONObject obj) {
		VESBean vbean = (VESBean) bean;
		// this.add(vbean, obj);

		vbean.setCustomerType("new");
		try {

			vbean.setLineOfBusiness(obj.get("lineofbusiness").toString());
			vbean.setfName((String) ((JSONObject) obj.get("customerdetails"))
					.get("fname"));
			vbean.setlName((String) ((JSONObject) obj.get("customerdetails"))
					.get("lname"));
			vbean.setConnectionAddress(((JSONObject) obj.get("customerdetails"))
					.get("connectionaddress").toString());
			vbean.setBillingAddress(((JSONObject) obj.get("customerdetails"))
					.get("billingaddress").toString());
			vbean.setEmailId((String) ((JSONObject) obj.get("customerdetails"))
					.get("email"));
			vbean.setContactNumber((String) ((JSONObject) obj
					.get("customerdetails")).get("contactnumber"));

			SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
			java.util.Date utilDate = formatter
					.parse((String) ((JSONObject) obj.get("customerdetails"))
							.get("dateofbirth"));

			Date date = new java.sql.Date(utilDate.getTime());
			vbean.setDateOfBirth(date);

			vbean.setModelType( ((JSONObject) obj.get("contractdetails"))
					.get("modeltype").toString());
			vbean.setClassOfService((String) ((JSONObject) obj
					.get("contractdetails")).get("classofservice"));
			utilDate = formatter.parse((String) ((JSONObject) obj
					.get("contractdetails")).get("fromdate"));
			date = new java.sql.Date(utilDate.getTime());
			vbean.setFromDate(date);

			utilDate = formatter.parse((String) ((JSONObject) obj
					.get("contractdetails")).get("todate"));
			date = new java.sql.Date(utilDate.getTime());
			vbean.setToDate(date);
			vbean.setDiscountPercentage((Integer) ((JSONObject) obj
					.get("contractdetails")).get("discountpercentage"));
		} catch (JSONException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("VES added");
		return false;
	}

	@Override
	public boolean update(Bean changedRecord) {
		return false;
	}

	public void view(Bean bean) {
		VESBean vbean = (VESBean) bean;
		System.out.println(vbean);
	}

}
