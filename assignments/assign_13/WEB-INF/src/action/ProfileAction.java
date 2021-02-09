package action;

import bean.Profile;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ProfileAction extends ActionSupport{
	
	private Profile profile;
	
	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public void validate(){
		String country=profile.getCountry();
		System.out.println(country);
		if(!(country.equalsIgnoreCase("Myanmar")) && !(country.equalsIgnoreCase("China")) && !(country.equalsIgnoreCase("India"))){
			addFieldError("profile.country", "Country must be Myanmar, China or India...");
		}
	}
	
	public String execute(){
		
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		session.setAttribute("profile", profile);
		System.out.println(profile.toString());
		return SUCCESS;
	}
	
}
