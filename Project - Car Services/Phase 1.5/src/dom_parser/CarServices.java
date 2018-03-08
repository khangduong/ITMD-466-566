package dom_parser;

public class CarServices {
	
	private String carServiceID;
	private String customerID;
	private String serviceID;
	private String providerID;
	private String carID;
	private String model;
	private String price;
	private String start;
	private String end;
	private String status;
	
	public String getCarServiceID(){
		return carServiceID;
	}
	
	public void setCarServiceID(String carServiceID){
		this.carServiceID = carServiceID;
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
	
	public String getCarID(){
		return carID;
	}
	
	public void setCarID(String carID){
		this.carID = carID;
	}
	
	public String getModel(){
		return model;
	}
	
	public void setModel(String model){
		this.model = model;
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
		return "CarService:: CarServiceID=" + this.carServiceID + " CustomerID=" + this.customerID + " ServiceID=" + this.serviceID + " ProviderID=" + this.providerID + " CarID=" + this.carID +
				" Model=" + this.model + "Price= " + this.price + "Start= " + this.start + "End= " + this.end + "Status= " + this.status;
	}
	
}
