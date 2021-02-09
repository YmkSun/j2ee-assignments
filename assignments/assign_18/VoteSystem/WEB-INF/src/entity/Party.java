package entity;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="PartyTable")
public class Party implements Serializable {
	
	private int pid;
	private String  partyname, acronym;
	private List<Voter> vrt=new ArrayList<Voter>();
	

	@Id
	@GeneratedValue
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String getPartyname() {
		return partyname;
	}

	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}


	@OneToMany(mappedBy="pty",fetch=FetchType.EAGER)
	public List<Voter> getVrt() {
		return vrt;
	}

	public void setVrt(List<Voter> vrt) {
		this.vrt = vrt;
	}


	

}
