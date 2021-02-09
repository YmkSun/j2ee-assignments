package action;

import javax.servlet.*;
import javax.servlet.http.*;

import java.util.*;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import service.*;
import entity.*;

public class VoterAction extends ActionSupport {
	
	private Voter votr;
	private List<String> party;
	private HashMap<String, Party> plist;
	private String ptyname;
	private String gen;
		
	VoteDAOImpl dao=new VoteDAOImpl();
	HttpServletRequest request=ServletActionContext.getRequest();
	HttpSession session=request.getSession();
	
	public VoterAction(){
		
	}
	
	public Voter getVotr() {
		return votr;
	}
	
	public void setVotr(Voter v) {
		this.votr = v;
	}
	
	public List<String> getParty() {
		return party;
	}
	
	public void setParty(List<String> party) {
		this.party = party;
	}
	
	public HashMap<String, Party> getPlist() {
		return plist;
	}

	public void setPlist(HashMap<String, Party> plist) {
		this.plist = plist;
	}

	public String getPtyname() {
		return ptyname;
	}

	public void setPtyname(String ptyname) {
		this.ptyname = ptyname;
	}
	
	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}

	public String insertVoter(){
		System.out.println(gen);
		plist=(HashMap<String, Party>)session.getAttribute("plist");
		if(plist.containsKey(ptyname) && gen!=null){
			Party prty=plist.get(ptyname);
			votr.setPty(prty);
			votr.setGender(gen);
			boolean t=dao.SaveVoter(votr);
			if(t){
				return SUCCESS;
			}
			else{
				return ERROR;
			}
		}
		else{
			return ERROR;
		}
	}
	
}
