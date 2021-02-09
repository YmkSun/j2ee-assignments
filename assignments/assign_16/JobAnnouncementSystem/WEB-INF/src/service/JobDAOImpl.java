package service;

import org.hibernate.Transaction;
import org.hibernate.Session;
import entity.*;

public class JobDAOImpl {
	
	Transaction tx=null;
	Session session=null;	
	 
	
	public void Save(Job j){
		
		try
		{
			session = HibernateUtil.getSession();
			System.out.println("got session obj........");
			tx=session.beginTransaction();
			session.save(j);
			tx.commit();
			System.out.println("Job information added");		
			
		}
		catch(Exception ex)
		{
			if(tx!=null)
				tx.rollback();
			ex.printStackTrace();
			
			
		}
		finally
		{
			session.close();
		}
	}
	
	
	public Job Search(int jobid){
		Job j=null;
		try
		{
			session = HibernateUtil.getSession();
			System.out.println("got session obj........");
			tx=session.beginTransaction();
			j=(Job)session.get(Job.class, jobid);
			tx.commit();
			System.out.println("Job searched");
			
			
		}
		catch(Exception ex)
		{
			if(tx!=null)
				tx.rollback();
			ex.printStackTrace();
			
			
		}
		finally
		{
			session.close();
		}
		
		return j;
	}

}	
	
	

