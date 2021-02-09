package service;

import javax.persistence.*;
import org.hibernate.*;
import entity.*;

public class StuAdminDAOImpl {
	
	Transaction tx=null;
	Session session=null;	
	
	public void Save(StudentAdmin s){
		
		try
		{
			session = HibernateUtil.getSession();
			System.out.println("got session obj........");
			tx=session.beginTransaction();
			session.save(s);
			tx.commit();
			System.out.println("Student information added");		
			
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
	
	
	public StudentAdmin Search(StudentPK spk){
		
		try
		{
			session = HibernateUtil.getSession();
			System.out.println("got session obj........");
			tx=session.beginTransaction();
			System.out.println(spk.toString());
			StudentAdmin s=(StudentAdmin)session.get(StudentAdmin.class, spk);
			tx.commit();
			System.out.println("Student Search Done...");
			
			System.out.println(s.getAge());
			return s;
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			return null;
		}
		
		finally
		{
			session.close();
		}
		
		
	}
	
	public boolean Update(StudentAdmin s2,StudentPK s){
		try
		{
			session = HibernateUtil.getSession();
			System.out.println("got session obj........");
			tx=session.beginTransaction();
			System.out.println(s2);
        	
	        if(s2!=null){
	        	StudentAdmin s1=(StudentAdmin)session.get(StudentAdmin.class, s);
	        	session.clear();
	        	s1.setAge(s2.getAge());
	        	s1.setEmail(s2.getEmail());
	        	s1.setUsername(s2.getUsername());
	        	s1.setPassword(s2.getPassword());
	        	s1.setTraining_center(s2.getTraining_center());
	        	s1.setBio_summary(s2.getBio_summary());
	        	s1.setStupk(s2.getStupk());
	        	System.out.println(s1);
	        	session.update(s1);		   
	        	tx.commit();
			}
			System.out.println("Student Info Updated...");		
			return true;
		}
		catch(Exception ex)
		{
			if(tx!=null){
				tx.rollback();
			}
			ex.printStackTrace();
			return false;
			
		}
		finally
		{
			session.close();
		}
	}
	
	
	public boolean Delete(StudentPK spk){
		try
		{
			session = HibernateUtil.getSession();
			System.out.println("got session obj........");
			tx=session.beginTransaction();
			StudentAdmin stu=(StudentAdmin) session.get(StudentAdmin.class, spk);
			session.clear();
			if(stu!=null){
				session.delete(stu);
				tx.commit();
			}
			System.out.println("Student information deleted");		
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

}	
	
	

