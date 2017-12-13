package com.pratik.DAO;

public class Insurance_DAO_Factory {
	public static Insuarance_DAO getInstance() {
		return new Insurance_DAO_IMPL();
	}

}
