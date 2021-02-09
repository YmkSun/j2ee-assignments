package action;

import javax.servlet.*;
import javax.servlet.http.*;

import java.util.*;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import service.*;
import entity.*;

public class PartyAction extends ActionSupport {
	
	private Party prty;
	private List<String> party;
	private HashMap<String, Party> plist;
	
	VoteDAOImpl dao=new VoteDAOImpl();
	HttpServletRequest request=ServletActionContext.getRequest();
	HttpSession session=request.getSession();
	
	public PartyAction(){}
	
	public Party getPrty() {
		return prty;
	}

	public void setPrty(Party p) {
		this.prty = p;
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

	public String insertParty(){
		System.out.println(prty.getPartyname());
		
		plist=(HashMap<String, Party>)session.getAttribute("plist");
		party=(List<String>)session.getAttribute("party");
		
		if(party==null && plist==null){
			party=new ArrayList<String>();
			plist=new HashMap<String, Party>();
		}
		plist.put(prty.getPartyname(), prty);
		party.add(prty.getPartyname());
		
		session.setAttribute("party", party);
		session.setAttribute("plist", plist);
		
		boolean t=dao.saveParty(prty);
		
		if(t){
			return SUCCESS;
		}
		return ERROR;
		
	}
	
}
