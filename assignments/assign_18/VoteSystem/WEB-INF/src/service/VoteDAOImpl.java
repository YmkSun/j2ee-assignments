package service;

import javax.persistence.*;
import org.hibernate.*;
import entity.*;

public class VoteDAOImpl {
	
	Transaction tx=null;
	Session session=null;	
	
	public boolean SaveVoter(Voter s){
		
		try
		{
			session = HibernateUtil.getSession();
			System.out.println("got session obj........");
			tx=session.beginTransaction();
			session.save(s);
			tx.commit();
			System.out.println("Voter information added");
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
	
	
	public boolean saveParty(Party p){
		System.out.println(p.getAcronym());
		try
		{
			session = HibernateUtil.getSession();
			System.out.println("got session obj........");
			tx=session.beginTransaction();
			session.save(p);
			tx.commit();
			System.out.println("Party information added");
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
	
	public Voter retrieveVoter(int id){
		Voter vt=null;	
		try
		{
			session = HibernateUtil.getSession();
			System.out.println("got session obj........");
			tx=session.beginTransaction();
			vt=(Voter)session.get(Voter.class, id);				
			tx.commit();		
			return vt;
		}
		catch(Exception ex)
		{
			if(tx!=null)
				tx.rollback();
			ex.printStackTrace();
			return vt;
		}
		finally
		{
			session.close();
		}

	}
	
	public Party retrieveParty(int id){
		Party pt=null;	
		try
		{
			session = HibernateUtil.getSession();
			System.out.println("got session obj........");
			tx=session.beginTransaction();
			pt=(Party)session.get(Party.class, id);
			tx.commit();		
			return pt;
		}
		catch(Exception ex)
		{
			if(tx!=null)
				tx.rollback();
			ex.printStackTrace();
			return pt;
		}
		finally
		{
			session.close();
		}
		
	}

}	
	
	

