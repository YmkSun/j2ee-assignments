package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="MusicTable")
public class MusicCD implements Serializable {
	
	private int mid;
	private String title;
	private MusicDetail mdetail;
	private MusicStudio studio;
	
	public MusicCD(){}

	@Id
	@GeneratedValue
	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Embedded
	public MusicDetail getMdetail() {
		return mdetail;
	}

	public void setMdetail(MusicDetail mdetail) {
		this.mdetail = mdetail;
	}
	
	@ManyToOne
	public MusicStudio getStudio() {
		return studio;
	}

	public void setStudio(MusicStudio studio) {
		this.studio = studio;
	}
	
	

}
