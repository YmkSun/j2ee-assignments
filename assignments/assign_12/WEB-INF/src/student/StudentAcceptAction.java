package student;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAcceptAction extends ActionSupport{
	
	private Student student;
	
	public StudentAcceptAction(){}
	
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}


	public void validate(){
		if(student.getRollNo().isEmpty()){
			addFieldError("student.rollNo","Roll number can not be blank");
		}
		
		if(student.getFullName().isEmpty()){
			addFieldError("student.fullName","Name can not be blank");
		}
		
		if(student.getEmailID().isEmpty()){
			addFieldError("student.emailID","Roll number can not be blank");
		}
		
		if(student.getContactNo().isEmpty()){
			addFieldError("student.contactNo","Roll number can not be blank");
		}
	
	}

	public String execute() throws Exception{
		
		boolean b=false;
		
		if(!(student.getRollNo().trim().equals("")) && !(student.getFullName().trim().equals("")) && !(student.getEmailID().trim().equals("")) && !(student.getContactNo().trim().equals(""))){
			try{
				new DBOperation().acceptStudent(student);
				b=true;
			}catch(Exception e){
				addActionError(e.getMessage());
			}
			
		}
		else{
			addActionError("label.error");
		}
		
		if(b==true){
			return SUCCESS;
		}
		else{
			return ERROR;
		}
				
	}
}
