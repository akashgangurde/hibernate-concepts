package com.ag;

public class Contract_Employee extends Employee {
	
	private float pay_per_hour;
	private String contract_duraction;
	public float getPay_per_hour() {
		return pay_per_hour;
	}
	public void setPay_per_hour(float pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}
	public String getContract_duraction() {
		return contract_duraction;
	}
	public void setContract_duraction(String contract_duraction) {
		this.contract_duraction = contract_duraction;
	}
	
	
}
