package dom_parser;

public class ServiceProvider {
	
	private String serviceProviderID;
	private String serviceID;
	private String providerID;
	private String name;
	private String phone;
	private String email;
	private String address;
	
	public String getServiceProviderID(){
		return serviceProviderID;
	}
	
	public void setServiceProviderID(String serviceProviderID){
		this.serviceProviderID = serviceProviderID;
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
	
	public String getPhone(){
		return phone;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getAdress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String toString() {
		return "ServiceProvider:: ServiceProviderID=" + this.serviceProviderID + " ServiceID=" + this.serviceID + " ProviderID=" + this.providerID + 
				" Name= " + this.name + " Phone= " + this.phone + " Email= " + this.email + "Address= " + this.address ;
	}
}
