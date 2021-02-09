package student;

public class Student {
	
	private String rollNo, fullName, emailID, contactNo;
	
	public Student(){}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getRollNo() {
		return rollNo;
	}

	public String getFullName() {
		return fullName;
	}

	public String getEmailID() {
		return emailID;
	}

	public String getContactNo() {
		return contactNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", fullName=" + fullName + ", emailID=" + emailID + ", contactNo=" + contactNo + "]";
	}
	
	

}
