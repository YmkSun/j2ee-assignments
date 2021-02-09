package entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.*;

@Entity
@Table(name="StudioTable")
public class MusicStudio implements Serializable {
	
	private int studioid;
	private String name, email;
	private boolean feedback;
	//private List<MusicCD> mcd=new ArrayList<MusicCD>();
	
	public MusicStudio(){}
	
	@Id
	@GeneratedValue
	public int getStudioid() {
		return studioid;
	}

	public void setStudioid(int studioid) {
		this.studioid = studioid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getFeedback() {
		return feedback;
	}

	public void setFeedback(boolean feedback) {
		this.feedback = feedback;
	}

	//@OneToMany(mappedBy="studio",fetch=FetchType.EAGER)
	/* Remove comment for bidirectional mapping...
	public List<MusicCD> getMcd() {
		return mcd;
	}

	public void setMcd(List<MusicCD> mcd) {
		this.mcd = mcd;
	}*/
	
	

}
