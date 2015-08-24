package com.parser.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.json.JSONException;
import org.json.JSONObject;

import com.customers.DAOFactory;
import com.customers.DAOLookup;

public class Order {
	public String objectParser(String str) {
		try {
			//verifying the JSONObject
			JSONObject obj = new JSONObject(str);
			
			//DAOFactory df = DAOLookup.getDAOObject(obj.get("lineofbusiness").toString());
			
			System.out.println(obj.get("name"));
			System.out.println(obj.get("city"));
			
//			//creating a customer
//			Customer cust;
//			cust = CustomerCreater.createCustomer("CMB");
//			cust.insert(obj);
			
			//Entry in the database
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "hr", "password");
			PreparedStatement ps = con
					.prepareStatement("insert into names values(?,?)");
			ps.setString(1, obj.getString("name"));
			ps.setString(2, obj.getString("city"));
			ps.execute();
			return null;
		} catch (JSONException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}
