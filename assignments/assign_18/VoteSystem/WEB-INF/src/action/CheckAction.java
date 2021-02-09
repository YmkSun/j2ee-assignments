package action;

import com.opensymphony.xwork2.ActionSupport;
import service.*;
import entity.*;

public class CheckAction extends ActionSupport {
	
	private Voter votr;
	private int vtid;
	
	VoteDAOImpl dao=new VoteDAOImpl();
	
	public CheckAction(){}
	
	public Voter getVotr() {
		return votr;
	}
	
	public void setVotr(Voter v) {
		this.votr = v;
	}

	public int getVtid() {
		return vtid;
	}

	public void setVtid(int vtid) {
		this.vtid = vtid;
	}

	public String checkVoter(){
		
		votr=dao.retrieveVoter(vtid);
		if(votr!=null){
			return SUCCESS;
		}
		else{
			addActionError(getText("error.check"));
			return ERROR;
		}
		
	}
	
}
