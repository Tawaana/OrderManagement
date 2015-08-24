package com.customers;

import java.sql.Date;

public class VESBean extends CustomerBean{
	
	String ModelType;
	String ClassOfService; 
	Date FromDate; 
	Date ToDate; 
	int DiscountPercentage;
	public String getModelType() {
		return ModelType;
	}
	public void setModelType(String modelType) {
		ModelType = modelType;
	}
	public String getClassOfService() {
		return ClassOfService;
	}
	public void setClassOfService(String classOfService) {
		ClassOfService = classOfService;
	}
	public Date getFromDate() {
		return FromDate;
	}
	public void setFromDate(Date fromDate) {
		FromDate = fromDate;
	}
	public Date getToDate() {
		return ToDate;
	}
	public void setToDate(Date toDate) {
		ToDate = toDate;
	}
	public int getDiscountPercentage() {
		return DiscountPercentage;
	}
	public void setDiscountPercentage(int discountPercentage) {
		DiscountPercentage = discountPercentage;
	}
//	@Override
//	public String toString() {
//		return "VESBean [ModelType=" + ModelType + ", ClassOfService="
//				+ ClassOfService + ", FromDate=" + FromDate + ", ToDate="
//				+ ToDate + ", DiscountPercentage=" + DiscountPercentage + "]";
//	}
	@Override
	public String toString() {
		return "VESBean [ModelType=" + ModelType + ", ClassOfService="
				+ ClassOfService + ", FromDate=" + FromDate + ", ToDate="
				+ ToDate + ", DiscountPercentage=" + DiscountPercentage
				+ ", CustomerId=" + CustomerId + ", LineOfBusiness="
				+ LineOfBusiness + ", CustomerType=" + CustomerType
				+ ", fName=" + fName + ", lName=" + lName
				+ ", ConnectionAddress=" + ConnectionAddress
				+ ", BillingAddress=" + BillingAddress + ", EmailId=" + EmailId
				+ ", ContactNumber=" + ContactNumber + ", DateOfBirth="
				+ DateOfBirth + "]";
	}
	
	
	
	
	

}
