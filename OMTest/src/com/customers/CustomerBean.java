package com.customers;

import java.sql.Date;

public class CustomerBean extends Bean{
	
	String CustomerId;
	String LineOfBusiness;
	String CustomerType;
	String fName;
	String lName;
	String ConnectionAddress;
	String BillingAddress;
	String EmailId; 
	String ContactNumber; 
	Date DateOfBirth;
	public String getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}
	public String getLineOfBusiness() {
		return LineOfBusiness;
	}
	public void setLineOfBusiness(String lineOfBusiness) {
		LineOfBusiness = lineOfBusiness;
	}
	public String getCustomerType() {
		return CustomerType;
	}
	public void setCustomerType(String customerType) {
		CustomerType = customerType;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getConnectionAddress() {
		return ConnectionAddress;
	}
	public void setConnectionAddress(String connectionAddress) {
		ConnectionAddress = connectionAddress;
	}
	public String getBillingAddress() {
		return BillingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		BillingAddress = billingAddress;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "CustomerBean [CustomerId=" + CustomerId + ", LineOfBusiness="
				+ LineOfBusiness + ", CustomerType=" + CustomerType
				+ ", fName=" + fName + ", lName=" + lName
				+ ", ConnectionAddress=" + ConnectionAddress
				+ ", BillingAddress=" + BillingAddress + ", EmailId=" + EmailId
				+ ", ContactNumber=" + ContactNumber + ", DateOfBirth="
				+ DateOfBirth + "]";
	}
	
	
	
	


}
