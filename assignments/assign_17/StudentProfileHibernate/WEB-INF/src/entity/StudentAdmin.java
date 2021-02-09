package entity;

import java.io.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="StudentTable")
public class StudentAdmin implements Serializable{
	
	private String age, email, username, password, training_center, bio_summary;
	private StudentPK stupk=null;
	
	public StudentAdmin(){}		

	@EmbeddedId
	public StudentPK getStupk() {
		return stupk;
	}

	public void setStupk(StudentPK stupk) {
		this.stupk = stupk;
	}
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTraining_center() {
		return training_center;
	}

	public void setTraining_center(String training_center) {
		this.training_center = training_center;
	}

	public String getBio_summary() {
		return bio_summary;
	}

	public void setBio_summary(String bio_summary) {
		this.bio_summary = bio_summary;
	}

	@Override
	public String toString() {
		return "StudentAdmin ["+stupk.toString()+", age=" + age + ", email=" + email + ", username="
				+ username + ", password=" + password + ", training_center="
				+ training_center + ", bio_summary=" + bio_summary + "]";
	}
	
	

}
