package dom_parser;

public class Customer {
	
	private String customerID;
	private String name;
	private String phone;
	private String email;
	private String address;

	public String getCustomerID(){
		return customerID;
	}
	
	public void setCustomerID(String customerID){
		this.customerID = customerID;
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
		return "Customer:: CustomerID= " + this.customerID + " Name= " + this.name + " Phone= " + this.phone + " Email= " + this.email + "Address= " + this.address ;
	}
	
	
}
