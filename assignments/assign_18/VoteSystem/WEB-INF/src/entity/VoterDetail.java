package entity;

import java.io.*;
import javax.persistence.*;


@Embeddable
public class VoterDetail implements Serializable{
	
	private String nrc, township, city, phoneno;
	
	public VoterDetail(){}

	public String getNrc() {
		return nrc;
	}

	public void setNrc(String nrc) {
		this.nrc = nrc;
	}

	public String getTownship() {
		return township;
	}

	public void setTownship(String township) {
		this.township = township;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "nrc=" + nrc + ", township=" + township + ", city=" + city + ", phoneno=" + phoneno;
	}
	
}
