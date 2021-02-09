package entity;

import java.io.*;
import javax.persistence.*;

@Entity
@Table(name="VoterTable")
public class Voter implements Serializable {
	
	private int vid;
	private Party pty;
	private String name, gender, religion;
	private int age;
	private VoterDetail vdetail;
	
	public Voter(){}
	
	@Id
	@GeneratedValue
	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}
	
	@ManyToOne
	public Party getPty() {
		return pty;
	}

	public void setPty(Party pty) {
		this.pty = pty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	@Embedded
	public VoterDetail getVdetail() {
		return vdetail;
	}

	public void setVdetail(VoterDetail vdetail) {
		this.vdetail = vdetail;
	}
	
	

}
