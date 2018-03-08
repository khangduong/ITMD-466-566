package dom_parser;

public class PartServices {
	
	private String partServiceID;
	private String customerID;
	private String serviceID;
	private String providerID;
	private String partID;
	private String description;
	private String price;
	private String start;
	private String end;
	private String status;
	
	public String getPartServiceID(){
		return partServiceID;
	}
	
	public void setPartServiceID(String partServiceID){
		this.partServiceID = partServiceID;
	}
	
	public String getCustomerID(){
		return customerID;
	}
	
	public void setCustomerID(String customerID){
		this.customerID = customerID;
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
	
	public String getPartID(){
		return partID;
	}
	
	public void setPartID(String partID){
		this.partID = partID;
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
	
	public String getStart(){
		return start;
	}
	
	public void setStart(String start){
		this.start = start;
	}
	
	public String getEnd(){
		return end;
	}
	
	public void setEnd(String end){
		this.end = end;
	}
	
	public String getStatus(){
		return status;
	}
	
	public void setStatus(String status){
		this.status = status;
	}
	
	public String toString() {
		return "PartService:: PartServiceID=" + this.partServiceID + " CustomerID=" + this.customerID + " ServiceID=" + this.serviceID + " ProviderID=" + this.providerID + " PartID=" + this.partID +
				" Description=" + this.description + "Price= " + this.price + "Start= " + this.start + "End= " + this.end + "Status= " + this.status;
	}
	
}
