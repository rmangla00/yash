package com.yash.spring.propertyeditor;

public class StudentID {
	
	private Integer sid;
	private String bid;
	
	public StudentID(String bid, Integer sid) {
		super();
		this.bid = bid;
		this.sid = sid;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}
	
	

}
