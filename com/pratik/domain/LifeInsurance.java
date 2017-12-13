package com.pratik.domain;

public class LifeInsurance extends Insurance {
	private String policy_name;

	public String getPolicy_name() {
		return policy_name;
	}
	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}
	@Override
	public String toString() {
		return "LifeInsurance [policy_name=" + policy_name + "]";
	}


}
