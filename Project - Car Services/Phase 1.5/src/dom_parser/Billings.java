package dom_parser;

public class Billings {
	
	private String billingID;
	private String customerID;
	private String cardDetail;
	private String password;
	
	public String getBillingID(){
		return billingID;
	}
	
	public void setBillingID(String billingID){
		this.billingID = billingID;
	}
	
	public String getcustomerID(){
		return customerID;
	}
	
	public void setCustomerID(String customerID){
		this.customerID = customerID;
	}
	
	public String getCardDetail(){
		return cardDetail;
	}
	
	public void setCardDetail(String cardDetail){
		this.cardDetail = cardDetail;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String toString() {
		return "Billing:: BillingID=" + this.billingID + " CustomerID=" + this.customerID + " CardDetail=" + this.cardDetail +
				" Password=" + this.password;
	}
	
}
