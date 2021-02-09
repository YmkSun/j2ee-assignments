package service;

import java.util.*;

import javax.persistence.*;
import org.hibernate.*;
import org.hibernate.Query;

import entity.*;

public class DBOperation {
	
	Transaction tx=null;
	Session session=null;	
	
	public boolean Save(Employee em){
		
		try
		{
			session = HibernateUtil.getSession();
			System.out.println("got session obj........");
			tx=session.beginTransaction();
			session.save(em);
			tx.commit();
			System.out.println("Employee information added...");
			return true;
			
		}
		catch(Exception ex)
		{
			if(tx!=null)
				tx.rollback();
			ex.printStackTrace();
			return false;
			
			
		}
		finally
		{
			session.close();
		}
	}	
	
	public Employee search(int i){
		Employee em = null;
		try{
			System.out.println("id in dbo:"+i);
			session=HibernateUtil.getSession();
			tx=session.beginTransaction();
			SQLQuery q=session.createSQLQuery("select em.* from emptable em where em.empid LIKE :id ");
			q.addEntity(Employee.class);
			q.setParameter("id", i);
			em=(Employee) q.uniqueResult();
			System.out.println(em.toString());
			tx.commit();
			return em;			
			
		}
		catch(Exception ex){
			ex.printStackTrace();
			if(tx!=null) tx.rollback();
			return null;
		}//catch(NumberFormatException)
		finally{
			session.close();
		}
	}

}	
	
	

