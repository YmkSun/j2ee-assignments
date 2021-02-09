package action;

import entity.*;
import service.*;

import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class StudentAdminAction extends ActionSupport{
	
	private StudentAdmin sad, stad;
	private List<String> tclist;
	private StudentPK spk;
	private String traincenter;
	
	StuAdminDAOImpl dao=new StuAdminDAOImpl();
	
	public StudentAdminAction(){
		
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		
		List<String> tc=(List<String>)session.getAttribute("tc");
		
		if(tc==null){
			tclist=new ArrayList<String>();
			
			tclist.add("CICTT");
			tclist.add("IMCEITS");
			tclist.add("ICTTI");
			
			session.setAttribute("tc", tclist);
		}
		
	}
	
	public StudentAdmin getSad() {
		return sad;
	}
	
	public void setSad(StudentAdmin sad) {
		this.sad = sad;
	}
	
	public StudentAdmin getStad() {
		return stad;
	}

	public void setStad(StudentAdmin stad) {
		this.stad = stad;
	}

	public List<String> getTclist() {
		return tclist;
	}
	
	public void setTclist(List<String> tclist) {
		this.tclist = tclist;
	}
	
	public String getTraincenter() {
		return traincenter;
	}
	
	public void setTraincenter(String traincenter) {
		this.traincenter = traincenter;
	}	
	
	public StudentPK getSpk() {
		return spk;
	}

	public void setSpk(StudentPK spk) {
		this.spk = spk;
	}
	
	public String insertStu(){
		System.out.println(traincenter);
		
		sad.setTraining_center(traincenter);
		
		System.out.println(sad.toString());
		dao.Save(sad);
		return SUCCESS;
	}
	
	public String deleteStu(){
		dao.Delete(spk);
		return SUCCESS;
	}
	
	public String updateStu(){
		
		System.out.println(stad.toString());
		boolean b;
		b=dao.Update(stad, stad.getStupk());
		
		if(b==true){
			return SUCCESS;
			
		}
		else{
			addActionError(getText("error.update"));
			return ERROR;
		}
	}
	
	public String searchStu(){
		
		stad=dao.Search(spk);
		
		if(stad!=null){
			return SUCCESS;
			
		}
		else{
			addActionError(getText("error.search"));
			return ERROR;
		}
	}
	
}
