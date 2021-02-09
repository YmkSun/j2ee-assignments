package action;

import entity.*;
import service.*;
import java.util.*;

import com.opensymphony.xwork2.ActionSupport;

public class JobAction extends ActionSupport{
	
	private Job j,mj;
	private List<String> jobtype;
	private List<String> degree;
	private String selectedJob;
	private String[] checkedDegree;
	private int jid;
	
	JobDAOImpl dao=new JobDAOImpl();
	
	public Job getJ() {
		return j;
	}
	
	public void setJ(Job j) {
		this.j = j;
	}
	
	public Job getMj() {
		return mj;
	}
	
	public void setMj(Job mj) {
		this.mj = mj;
	}
	
	public List<String> getJobtype() {
		return jobtype;
	}

	public void setJobtype(List<String> jobtype) {
		this.jobtype = jobtype;
	}

	public List<String> getDegree() {
		return degree;
	}

	public void setDegree(List<String> degree) {
		this.degree = degree;
	}

	public String getSelectedJob() {
		return selectedJob;
	}

	public void setSelectedJob(String selectedJob) {
		this.selectedJob = selectedJob;
	}

	public String[] getCheckedDegree() {
		return checkedDegree;
	}

	public void setCheckedDegree(String[] checkedDegree) {
		this.checkedDegree = checkedDegree;
	}
	
	public int getJid() {
		return jid;
	}

	public void setJid(int jid) {
		this.jid = jid;
	}

	public String insert(){
		
		System.out.println(selectedJob);
		String degrees="";
		
		for(int i=0; i<checkedDegree.length; i++){
			degrees+=checkedDegree[i];
			if(i==checkedDegree.length-1) break;
			degrees+=", ";
		}
		System.out.println(degrees);
		
		j.setJobType(selectedJob);
		j.setDegree(degrees);
		
		System.out.println(j.toString());
		
		dao.Save(j);
		return SUCCESS;
	}
	
	public String search(){
		
		System.out.println();
		
		mj=dao.Search(jid);
		
		if(mj!=null){
			return SUCCESS;
		}
		else{
			addActionError(getText("error.search"));
			return ERROR;
		}
	}
	
	public String display(){
		
		jobtype=new ArrayList<String>();
		degree=new ArrayList<String>();
		
		jobtype.add("project manager");
		jobtype.add("web developer");
		jobtype.add("programmer");
		
		degree.add("B.E");
		degree.add("B.Tech");
		degree.add("B.C.Sc");
		degree.add("B.C.Tech");
		
		return SUCCESS;
	}

}
