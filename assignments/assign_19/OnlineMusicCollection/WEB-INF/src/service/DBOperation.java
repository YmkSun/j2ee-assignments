package service;

import java.util.*;

import javax.persistence.*;
import org.hibernate.*;
import org.hibernate.Query;

import entity.*;

public class DBOperation {
	
	Transaction tx=null;
	Session session=null;	
	
	public boolean SaveMusic(MusicCD mc){
		
		try
		{
			session = HibernateUtil.getSession();
			System.out.println("got session obj........");
			tx=session.beginTransaction();
			session.save(mc);
			tx.commit();
			System.out.println("Music CD information added...");
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
	
	public boolean SaveStudio(MusicStudio ms){
		
		try
		{
			session = HibernateUtil.getSession();
			System.out.println("got session obj........");
			tx=session.beginTransaction();
			session.save(ms);
			tx.commit();
			System.out.println("Music CD information added...");
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
	
	public List<MusicStudio> showStudio(){
		MusicStudio t;
		List<MusicStudio> list = null;
		try{
			session=HibernateUtil.getSession();
			tx=session.beginTransaction();
			Query q=session.createQuery("select t from MusicStudio t");
			
			list=q.list();
			
			tx.commit();
			return list;
		}
		catch(Exception e){
			e.printStackTrace();
			if(tx!=null) tx.rollback();
			return null;
		}
		finally{
			session.close();
		}
	}
	
	public List<MusicStudio> chooseMusic(String type){
		List<MusicStudio> list = null;
		try{
			session=HibernateUtil.getSession();
			tx=session.beginTransaction();
			SQLQuery q=session.createSQLQuery("select m.* from MusicTable m where m.musictype LIKE :mtype");
			q.addEntity(MusicCD.class);
			q.setParameter("mtype",type);
			
			list=q.list();
			
			tx.commit();
			return list;
		}
		catch(Exception e){
			e.printStackTrace();
			if(tx!=null) tx.rollback();
			return null;
		}
		finally{
			session.close();
		}
	}
	
	public List<MusicCD> searchByName(int s){
		List<MusicCD> list = null;
		try{
			session=HibernateUtil.getSession();
			tx=session.beginTransaction();
			System.out.println(s);
			Query q=session.createQuery("select m from MusicCD m where m.studio.studioid LIKE ? ");
			q.setParameter(0, s);
			list=q.list();
			tx.commit();
			return list;			
			
		}
		catch(Exception e){
			e.printStackTrace();
			if(tx!=null) tx.rollback();
			return null;
		}
		finally{
			session.close();
		}
	}
	
	public MusicCD searchByNameTitle(int i, String s){
		MusicCD cd = null;
		try{
			session=HibernateUtil.getSession();
			tx=session.beginTransaction();
			System.out.println(s);
			Query q=session.createQuery("select m from MusicCD m where m.studio.studioid LIKE ? and m.title LIKE :s");
			q.setParameter(0, i);
			q.setParameter("s", s);
			cd=(MusicCD) q.uniqueResult();
			tx.commit();
			return cd;			
			
		}
		catch(Exception e){
			e.printStackTrace();
			if(tx!=null) tx.rollback();
			return null;
		}
		finally{
			session.close();
		}
	}

}	
	
	

