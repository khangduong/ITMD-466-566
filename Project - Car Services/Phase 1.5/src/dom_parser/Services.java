package dom_parser;

public class Services {
	
	private String serviceID;
	private String description;
	
	public String getServiceID(){
		return serviceID;
	}
	
	public void setServiceID(String serviceID){
		this.serviceID = serviceID;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public String toString() {
		return "Services:: ServiceID=" + this.serviceID + " Description=" + this.description ;
	}
	
}
