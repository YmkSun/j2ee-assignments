package action;

import com.opensymphony.xwork2.ActionSupport;
import service.*;
import entity.*;

public class SearchAction extends ActionSupport {
	
	private Party prty;
	private int ptid;
	
	VoteDAOImpl dao=new VoteDAOImpl();

	public SearchAction(){}
	
	public Party getPrty() {
		return prty;
	}

	public void setPrty(Party p) {
		this.prty = p;
	}

	public int getPtid() {
		return ptid;
	}

	public void setPtid(int ptid) {
		this.ptid = ptid;
	}

	public String searchVoter(){
		
		prty=dao.retrieveParty(ptid);
		if(prty!=null){
			return SUCCESS;
		}
		else{
			addActionError(getText("error.search"));
			return ERROR;
		}
		
	}
		

}
