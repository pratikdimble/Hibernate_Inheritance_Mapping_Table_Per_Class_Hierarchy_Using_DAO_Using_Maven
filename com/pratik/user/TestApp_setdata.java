package com.pratik.user;

import org.hibernate.Session;

import com.pratik.DAO.Insuarance_DAO;
import com.pratik.DAO.Insurance_DAO_Factory;
import com.pratik.DAO.Insurance_DAO_IMPL;
import com.pratik.utility.HibernateUtil;

public class TestApp_setdata {

	public static void main(String[] args) {
		Session ses=null;
		Insuarance_DAO dao=null;
		Insurance_DAO_IMPL impl=new Insurance_DAO_IMPL();
		//get the session
		HibernateUtil.getSession();
		//use DAO
		dao=Insurance_DAO_Factory.getInstance();
		try {
		dao.savedata();
		}catch (Exception e) {
			e.getMessage();
		}
		//System.out.println(new Insurance_DAO_IMPL().savedata());
		HibernateUtil.closeFactory();

	}

}
