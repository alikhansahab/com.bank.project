package com.bank.application.enums;

public enum ApiConstants {

	VIEW_ALL_APPROVED("/view-all-approved"),
	VIEW_ALL_INREVIEW("/view-all-inreview"),
	VIEW_ALL_REJECTED("/view-all-rejected"),
	VIEW_ALL_PENDING("/view-all-pending"),
	ACCOUNT("account"),
	SLASH("/"),	
	ACCOUNT_SERVER_ADDRESS("http://localhost:8081/"),
	TRANSACTIONS("/account/transaction/details"),
	DASHBOARD("/dashboard"),
	
	;

	
	private String value;
	ApiConstants(String string) {
		value = string;
	}
	
	public String getStrValue() {
		return value;
	}
}
