package bean;

public class Staff {
	
	private String staffID, staffName, rank, department;

	public String getStaffID() {
		return staffID;
	}

	public void setStaffID(String staffID) {
		this.staffID = staffID;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Staff [staffID=" + staffID + ", staffName=" + staffName
				+ ", rank=" + rank + ", department=" + department + "]";
	}
	
	

}
