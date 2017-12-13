package com.pratik.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pratik.domain.Insurance;
import com.pratik.domain.LifeInsurance;
import com.pratik.domain.VehicleInsurance;
import com.pratik.utility.HibernateUtil;

public class Insurance_DAO_IMPL implements Insuarance_DAO {

	@Override
	public String savedata()  {
		Session ses=null;
		Transaction tx=null;
		String newresult=null;
			//get the session
		ses=HibernateUtil.getSession();
		//create the objects and set the data
		Insurance in=new Insurance();
			in.setName("Rohit");in.setCompany("HDFC");
		LifeInsurance lf=new LifeInsurance();
			lf.setPolicy_name("Jeeven beema");
		VehicleInsurance vi=new VehicleInsurance();
			vi.setVehType("Truck");
			
			//save the objects
			try {
				tx=ses.beginTransaction();
				ses.save(in);
				ses.save(lf);
				ses.save(vi);
				tx.commit();
				newresult="Object is Saved";
				System.out.println("\t--> Object is Saved <--");
				
			}catch (HibernateException he) {
				he.printStackTrace();
				tx.rollback();
				System.out.println("\t--> Object is not Saved <--");
				newresult="Object is not Saved";
			}
			catch (Exception e) {
				e.printStackTrace();
				tx.rollback();
				System.out.println("\t--> Object is not Saved <--");
				newresult="Object is not Saved";
			}
			finally {
				try {
					HibernateUtil.closeSession(ses);
					
				}catch (HibernateException he) {
					he.printStackTrace();
				}
				catch (Exception e) {
					e.printStackTrace();;
				}
				
			}
			
		return newresult;
	}//method savedata() ends
	
	@Override
	public List<Insurance> getdata() {
		Session ses=null;
		Transaction tx=null;
		List<Insurance> list=null;
		List<LifeInsurance>list1=null;
		List<VehicleInsurance>list2=null;
			//get the session
		ses=HibernateUtil.getSession();
		//create the HQL query for Insurance domain i.e superclass
			Query q=ses.createQuery("from Insurance");
				//execute the QBC
			list=q.list();
			System.out.println("\t*****************************");
			System.out.println("\t-->Insurance<--");
			System.out.println("\t*****************************");
			list.forEach(row->{
				System.out.println(row);
			});
			
			//create the HQL query for Insurance domain i.e superclass
			Query q1=ses.createQuery("from LifeInsurance");
				//execute the QBC
			list1=q1.list();
			System.out.println("\t*****************************");
			System.out.println("\t-->Life Insurance<--");
			System.out.println("\t*****************************");
			list1.forEach(row->{
				System.out.println(row);
			});
			//create the HQL query for Insurance domain i.e superclass
			Query q2=ses.createQuery("from VehicleInsurance");
				//execute the QBC
			list2=q2.list();
			System.out.println("\t*****************************");
			System.out.println("\t-->Vehicle Insurance<--");
			System.out.println("\t*****************************");
			list2.forEach(row->{
				System.out.println(row);
			});
			
			HibernateUtil.closeSession(ses);
		return null;
	}

}//class ends
