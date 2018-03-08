package dom_parser;

public class PartInventory {
	
	private String partID;
	private String serviceID;
	private String providerID;
	private String name;
	private String description;
	private String price;

	public String getPartID(){
		return partID;
	}
	
	public void setPartID(String partID){
		this.partID = partID;
	}
	
	public String getServiceID(){
		return serviceID;
	}
	
	public void setServiceID(String serviceID){
		this.serviceID = serviceID;
	}
	
	public String getProviderID(){
		return providerID;
	}
	
	public void setProviderID(String providerID){
		this.providerID = providerID;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public String getPrice(){
		return price;
	}
	
	public void setPrice(String price){
		this.price = price;
	}
	
	public String toString() {
		return "PartInventory:: PartID=" + this.partID + " ServiceID=" + this.serviceID + " ProviderID=" + this.providerID +
				" Name=" + this.name + "Description: " + this.description + "Price= " + this.price;
	}
	
	
}
