package entity;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class MusicDetail implements Serializable{
	
	private String musicianName, email, musictype;
	private int no_tracks;
	private double price;
	
	public MusicDetail(){}

	public String getMusicianName() {
		return musicianName;
	}

	public void setMusicianName(String musicianName) {
		this.musicianName = musicianName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMusictype() {
		return musictype;
	}

	public void setMusictype(String musictype) {
		this.musictype = musictype;
	}

	public int getNo_tracks() {
		return no_tracks;
	}

	public void setNo_tracks(int no_tracks) {
		this.no_tracks = no_tracks;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
