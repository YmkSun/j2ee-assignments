package profile;

public class Profile {
	
	private String userID, userName, password, email, address;
	
	public Profile(){}

	public Profile(String userID, String userName, String password,  String email, String address) {
		this.userID = userID;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.address = address;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserID() {
		return userID;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public String toString() {
		return "Profile [userID=" + userID + ", userName=" + userName + ", password=" + password + ", email=" + email + ", address=" + address + "]";
	}
	
	

}
