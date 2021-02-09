package entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="emptable")
public class Employee implements Serializable {
	
	private int empid;
	private String empname, address, department, rank;
	
	public Employee(){}

	@Id
	@GeneratedValue
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname
				+ ", address=" + address + ", department=" + department
				+ ", rank=" + rank + "]";
	}
	
}
