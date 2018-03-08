package dom_parser;

public class CarInventory {
	
	private String carID;
	private String serviceID;
	private String providerID;
	private String model;
	private String year;
	private String price;
	private String mileage;
	
	public String getCarID(){
		return carID;
	}
	
	public void setCarID(String carID){
		this.carID = carID;
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
	
	public String getModel(){
		return model;
	}
	
	public void setModel(String model){
		this.model = model;
	}
	
	public String getYear(){
		return year;
	}
	
	public void setYear(String year){
		this.year = year;
	}
	
	public String getPrice(){
		return price;
	}
	
	public void setPrice(String price){
		this.price = price;
	}
	
	public String getMileage(){
		return mileage;
	}
	
	public void setMileage(String mileage){
		this.mileage = mileage;
	}
	
	public String toString() {
		return "CarInventory:: CarID=" + this.carID + " ServiceID=" + this.serviceID + " ProviderID=" + this.providerID +
				" Model=" + this.model + "Year: " + this.year + "Price= " + this.price + "Mileage= " + this.mileage;
	}
	
	
}
