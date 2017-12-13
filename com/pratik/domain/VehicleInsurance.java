package com.pratik.domain;

public class VehicleInsurance extends Insurance {
	private String vehType;

	public String getVehType() {
		return vehType;
	}
	public void setVehType(String vehType) {
		this.vehType = vehType;
	}
	@Override
	public String toString() {
		return "VehicleInsurance [vehType=" + vehType + "]";
	}

	
	

}
