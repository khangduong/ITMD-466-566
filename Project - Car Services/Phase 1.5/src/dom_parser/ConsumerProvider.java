package dom_parser;

public class ConsumerProvider {
	
	private String consumerProviderID;
	private String providerID;
	
	public String getConsumerProviderID(){
		return consumerProviderID;
	}
	
	public void setConsumerProviderID(String consumerProviderID){
		this.consumerProviderID = consumerProviderID;
	}
	
	public String getProviderID(){
		return providerID;
	}
	
	public void setProviderID(String providerID){
		this.providerID = providerID;
	}
	
	public String toString() {
		return "ConsumerProvider:: ConsumerProviderID=" + this.consumerProviderID + " ProviderID=" + this.providerID ;
	}
	
}
