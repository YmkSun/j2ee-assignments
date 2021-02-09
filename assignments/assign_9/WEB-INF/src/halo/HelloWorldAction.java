package halo;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
	
	private static final String GREET="Welcome ";
	private String username, greeting;
	
	public HelloWorldAction(){}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getUsername() {
		return username;
	}

	public String getGreeting() {
		return greeting;
	}
	
	public String execute() throws Exception {
		if(!(username.trim().equals("")) && !(username.equals("virus"))){
			setGreeting(GREET+getUsername());
			return SUCCESS;
		}
		else{
			addActionError(getText("label.error"));
			return ERROR;
		}
	}

}
