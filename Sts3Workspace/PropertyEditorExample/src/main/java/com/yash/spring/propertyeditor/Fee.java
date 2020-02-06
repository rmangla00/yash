package com.yash.spring.propertyeditor;

public class Fee {
	
	private Double totalFee;
	private Double feePaid;
	private Double feebal;
	
	public Fee(Double totalFee, Double feePaid, Double feebal) {
		this.totalFee = totalFee;
		this.feePaid = feePaid;
		this.feebal = feebal;
	}

	public Double getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(Double totalFee) {
		this.totalFee = totalFee;
	}

	public Double getFeePaid() {
		return feePaid;
	}

	public void setFeePaid(Double feePaid) {
		this.feePaid = feePaid;
	}

	public Double getFeebal() {
		return feebal;
	}

	public void setFeebal(Double feebal) {
		this.feebal = feebal;
	}

	
	
}
