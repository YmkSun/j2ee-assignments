package action;

import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DisplayAction extends ActionSupport {
	
	private List<String> party;
		
	HttpServletRequest request=ServletActionContext.getRequest();
	HttpSession session=request.getSession();
	
	public DisplayAction(){}
	
	public List<String> getParty() {
		return party;
	}
	
	public void setParty(List<String> party) {
		this.party = party;
	}

	public String display(){		
		
		party=(List<String>)session.getAttribute("party");
		
		if(party==null){
			return ERROR;
		}
		else{
			
			return SUCCESS;
		}
	}
	
}
