package com.beans;

public abstract class Registrar {

	User user;

	public void register(String name, int mobileNo) {
		user = getUser();
		user.setName(name);
		user.setMobileNo(mobileNo);
		System.out.println(user+" "+user.hashCode());
	}
	
	public abstract User getUser();
}
