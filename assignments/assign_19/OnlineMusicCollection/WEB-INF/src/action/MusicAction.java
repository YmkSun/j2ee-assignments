package action;

import entity.*;
import service.*;
import java.util.*;
import com.opensymphony.xwork2.ActionSupport;

public class MusicAction extends ActionSupport{
	
	private MusicCD mucd;
	private MusicStudio musto;
	private List<MusicStudio> mslist;
	private List<MusicCD> mclist;
	private List<String> stlist=new ArrayList<String>();
	private String studio;
	private boolean check;
	private String mtype;
	private String stname;
	
	DBOperation dbo=new DBOperation();
		
	public MusicAction(){}

	public MusicCD getMucd() {
		return mucd;
	}

	public void setMucd(MusicCD mucd) {
		this.mucd = mucd;
	}

	public MusicStudio getMusto() {
		return musto;
	}

	public void setMusto(MusicStudio musto) {
		this.musto = musto;
	}

	public List<MusicStudio> getMslist() {
		return mslist;
	}

	public void setMslist(List<MusicStudio> mslist) {
		this.mslist = mslist;
	}

	public List<String> getStlist() {
		return stlist;
	}

	public void setStlist(List<String> stlist) {
		this.stlist = stlist;
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}
	
	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public String getMtype() {
		return mtype;
	}

	public void setMtype(String mtype) {
		this.mtype = mtype;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}
	
	

	public List<MusicCD> getMclist() {
		return mclist;
	}

	public void setMclist(List<MusicCD> mclist) {
		this.mclist = mclist;
	}

	public String insertStudio(){
		musto.setFeedback(check);
		dbo.SaveStudio(musto);
		
		return SUCCESS;
	}
	
	public String display(){
		
		mslist=dbo.showStudio();
		for(int i=0;i<mslist.size();i++){
			stlist.add(mslist.get(i).getName());
		}
		
		if(stlist!=null){
			return SUCCESS;
		}
		else{
			return ERROR;
		}
	}
	
	
	
	public String insertMusicCD(){
		//mucd.setMdetail(new MusicDetail());
		mucd.getMdetail().setMusictype(mtype);
		mslist=dbo.showStudio();
		System.out.println(mucd.getMdetail().getMusictype());
		
		for(int i=0;i<mslist.size();i++){
			System.out.println("i is "+mslist.get(i).getName());
			if(stname.equals(mslist.get(i).getName()))
			{
				System.out.println("Equal "+mslist.get(i).getStudioid());
				
				mucd.setStudio(new MusicStudio());
				mucd.getStudio().setStudioid(mslist.get(i).getStudioid());
			    				
				System.out.println(mucd.getStudio().getStudioid());
				
			}
		}
		
		dbo.SaveMusic(mucd);
		
		return SUCCESS;
	}
	
	public String viewByType(){
		System.out.println(mtype);
		mslist=dbo.chooseMusic(mtype);
		
		if(!(mslist.isEmpty())){
			return SUCCESS;
		}
		else{
			return ERROR;
		}
	}
	
	public String viewByName(){
		
		System.out.println(stname);
		
		mslist=dbo.showStudio();
		int id=0;
				
		for(int i=0;i<mslist.size();i++){
			
			System.out.println("i is "+mslist.get(i).getName());
			
			if(stname.equals(mslist.get(i).getName()))
			{
				System.out.println(mslist.get(i).getName());
				System.out.println("Equal "+mslist.get(i).getStudioid());
				musto=mslist.get(i);
				mclist=dbo.searchByName(mslist.get(i).getStudioid());
			}
		}
		
		if(!(mclist.isEmpty())){
			return SUCCESS;
		}
		else{
			return ERROR;
		}
	}
	
	public String viewByTitle(){
		
		System.out.println(stname);
		System.out.println(mtype);
		
		mslist=dbo.showStudio();
		int id=0;
				
		for(int i=0;i<mslist.size();i++){
			
			System.out.println("i is "+mslist.get(i).getName());
			
			if(stname.equals(mslist.get(i).getName()))
			{
				System.out.println(mslist.get(i).getName());
				System.out.println("Equal "+mslist.get(i).getStudioid());
				musto=mslist.get(i);
				mucd=dbo.searchByNameTitle(mslist.get(i).getStudioid(), mtype);
			}
		}
		
		if(mucd.getTitle()!=null){
			return SUCCESS;
		}
		else{
			return ERROR;
		}
	}
	
}
