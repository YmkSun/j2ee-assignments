package entity;

import javax.persistence.*;
import java.io.*;

@Entity
@Table(name="JobEntity")
public class Job implements Serializable {
	
	private int jobid;
	private String jobTitle, jobType, jobLocation, degree, company_name;
	
	public Job(){}

	@Id
	@GeneratedValue
	public int getJobid() {
		return jobid;
	}

	public void setJobid(int jobid) {
		this.jobid = jobid;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	@Override
	public String toString() {
		return "Job [jobid=" + jobid + ", jobTitle=" + jobTitle + ", jobType="
				+ jobType + ", jobLocation=" + jobLocation + ", degree="
				+ degree + ", company_name=" + company_name + "]";
	}
	
	
		
}
