package student;

import javax.servlet.*;
import javax.servlet.http.*;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class StudentInquiryAction extends ActionSupport{
	
	private Student student;
	private String rno;
	
	public StudentInquiryAction(){}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getRno() {
		return rno;
	}

	public void setRno(String rno) {
		this.rno = rno;
	}
		
	public void validate(){
		if(getRno().length()<1){
			addFieldError("rno","Roll number can not be blank");
		}
	}
	
	public String execute() throws Exception{
		
		boolean b=false;
		
		if(!(getRno().trim().equals(""))){
			student=new DBOperation().inquiryStudent(getRno());
			
			if(student.getRollNo()!=null){
				
				b=true;
			}
		}
		
		if(b==true){
			return SUCCESS;
		}
		else{
			return ERROR;
		}
	}
	
	

}
