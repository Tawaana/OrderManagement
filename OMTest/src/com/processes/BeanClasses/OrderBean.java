package com.processes.BeanClasses;

import java.sql.Date;

import com.customers.Bean;

public class OrderBean extends Bean{
	
	String OrderID;
	String CustomerID;
	String ServiceID;
	Date DateOfOrder;
	Date DueDate;
	String OrderStatus;
	String ListOfProducts;
	String Delinquent;
}
