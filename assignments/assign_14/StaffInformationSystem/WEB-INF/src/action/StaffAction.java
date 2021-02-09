package action;

import bean.Staff;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class StaffAction extends ActionSupport{
	
	private Staff staff;

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
	public void validate(){
		
		String rank=staff.getRank();
		String dept=staff.getDepartment();
		
		if(!(rank.equalsIgnoreCase("")) && !(rank.equalsIgnoreCase("tutor")) && !(rank.equalsIgnoreCase("assistance lecture")) && !(rank.equalsIgnoreCase("lecture")) && !(rank.equalsIgnoreCase("associate professor"))){
			addFieldError("staff.rank", "Rank should be tutor, assistance lecture, lecture, associate professor.");
		}
		
		if(!(dept.equals("")) && !(dept.equals("CICTT")) && !(dept.equals("IMCEITS")) && !(dept.equals("ICTTI"))){
			addFieldError("staff.department", "Department should be 'CICTT', 'IMCEITS' and 'ICTTI'.");
		}
		
	}
	
	public String execute(){
		
		int i;
		String stid;
		
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		
		List<Staff> list=(ArrayList<Staff>)session.getAttribute("staffList");
		
		if(list==null){
			list=new ArrayList<Staff>();
			i=1;
		}
		else{
			i=list.size();
			i++;
		}
		
		System.out.println(i);
		
		if(i<10){
			stid="stf00"+i;
		}
		else if(i<100){
			stid="stf0"+i;
		}
		else{
			stid="stf"+i;
		}
		
		staff.setStaffID(stid);
		System.out.println(staff.toString());
		list.add(staff);
		session.setAttribute("staffList", list);
		
		return SUCCESS;
	}

}
