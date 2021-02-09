package repeatVisit;

public class User implements Comparable<User> {
	
	private String firstname, surname, email, mobile_no, date_of_birth,	country, password, subscribe, check_policy;
	
	public User(){}

	public User(String firstname, String surname, String email,	String mobile_no, String date_of_birth, String country, String password, String subscribe, String check_policy) {
		this.firstname = firstname;
		this.surname = surname;
		this.email = email;
		this.mobile_no = mobile_no;
		this.date_of_birth = date_of_birth;
		this.country = country;
		this.password = password;
		this.subscribe = subscribe;
		this.check_policy = check_policy;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getSurname() {
		return surname;
	}

	public String getEmail() {
		return email;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public String getCountry() {
		return country;
	}

	public String getPassword() {
		return password;
	}

	public String getSubscribe() {
		return subscribe;
	}

	public String getCheck_policy() {
		return check_policy;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSubscribe(String subscribe) {
		this.subscribe = subscribe;
	}

	public void setCheck_policy(String check_policy) {
		this.check_policy = check_policy;
	}

	public String toString() {
		return "User [firstname=" + firstname + ", surname=" + surname
				+ ", email=" + email + ", mobile_no=" + mobile_no
				+ ", date_of_birth=" + date_of_birth + ", country=" + country
				+ ", password=" + password + ", subscribe=" + subscribe
				+ ", check_policy=" + check_policy + "]";
	}

	@Override
	public int compareTo(User otherUser) {
		return this.getEmail().compareTo(otherUser.getEmail());
	}
	
	
	
	

}
