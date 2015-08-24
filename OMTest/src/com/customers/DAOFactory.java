package com.customers;

import org.json.JSONObject;

public interface DAOFactory {
	public boolean add(Bean addRecord,JSONObject obj);
	public boolean update(Bean changedRecord);
	public void view(Bean bean);
}
