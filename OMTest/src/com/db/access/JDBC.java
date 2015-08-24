package com.db.access;

import java.sql.*;

import com.customers.*;

public class JDBC {

	public static void viewvesdb() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "hr", "password");

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from ves");
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2)
						+ " " + rs.getString(3) + " " + rs.getString(4) + " "
						+ rs.getString(5));

			}

			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void viewcustomerdb() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "hr", "password");

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from customers");
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2)
						+ " " + rs.getString(3) + " " + rs.getString(4) + " "
						+ rs.getString(5) + " " + rs.getString(6) + " "
						+ rs.getString(7) + " " + rs.getString(8) + " "
						+ rs.getString(9) + " " + rs.getString(10));

			}

			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static boolean insert(Bean bean) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "hr", "password");

			if (bean instanceof VESBean) {
				VESBean vbean = (VESBean) bean;
				PreparedStatement ps = con
						.prepareStatement("insert into customers values(?,?,?,?,?,?,?,?,?,?)");

				ps.setString(1, vbean.getCustomerId());
				ps.setString(2, vbean.getLineOfBusiness());
				ps.setString(3, vbean.getCustomerType());
				ps.setString(4, vbean.getfName());
				ps.setString(5, vbean.getlName());
				ps.setString(6, vbean.getConnectionAddress());
				ps.setString(7, vbean.getBillingAddress());
				ps.setString(8, vbean.getEmailId());
				ps.setString(9, vbean.getContactNumber());
				ps.setDate(10, vbean.getDateOfBirth());
				ps.execute();

				ps = con.prepareStatement("insert into ves values(?,?,?,?,?)");
				ps.setString(1, vbean.getModelType());
				ps.setString(2, vbean.getClassOfService());
				ps.setDate(3, vbean.getFromDate());
				ps.setDate(4, vbean.getToDate());
				ps.setInt(5, vbean.getDiscountPercentage());

				ps.execute();

				return true;

			} else if (bean instanceof CustomerBean) {
				CustomerBean cbean = (CustomerBean) bean;
				PreparedStatement ps = con
						.prepareStatement("insert into customers values(?,?,?,?,?,?,?,?,?,?)");

				ps.setString(1, cbean.getCustomerId());
				ps.setString(2, cbean.getLineOfBusiness());
				ps.setString(3, cbean.getCustomerType());
				ps.setString(4, cbean.getfName());
				ps.setString(5, cbean.getlName());
				ps.setString(6, cbean.getConnectionAddress());
				ps.setString(7, cbean.getBillingAddress());
				ps.setString(8, cbean.getEmailId());
				ps.setString(9, cbean.getContactNumber());
				ps.setDate(10, cbean.getDateOfBirth());

				ps.execute();
				return true;

			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
}
