package com.pratik.user;



import com.pratik.DAO.Insuarance_DAO;
import com.pratik.DAO.Insurance_DAO_Factory;

import com.pratik.utility.HibernateUtil;

public class TestApp_getdata {

	public static void main(String[] args) {
		Insuarance_DAO dao=null;
		//get the session
		HibernateUtil.getSession();
		//use DAO
		dao=Insurance_DAO_Factory.getInstance();
		dao.getdata();
		HibernateUtil.closeFactory();

	}

}
