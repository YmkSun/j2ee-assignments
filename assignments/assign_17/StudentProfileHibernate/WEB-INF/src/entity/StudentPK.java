package entity;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
//@SequenceGenerator(name="syn", sequenceName="synSeq", allocationSize=1)
public class StudentPK implements Serializable {
	
	private int rno;
	private String name;
	
	public StudentPK(){}

	public StudentPK(int rno, String name) {
		this.rno = rno;
		this.name = name;
	}
	
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="syn")
	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return " rno=" + rno + ", name=" + name;
	}
	
	

}
