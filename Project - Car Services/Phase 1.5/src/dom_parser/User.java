package dom_parser;

public class User {
	
	private String userID;
	private String username;
	private String password;
	private String email;
	private String secretQuestion;
	private String secretAnswer;
	private String userType;
	
	
	public String getUserID(){
		return userID;
	}
	
	public void setUserID(String userID){
		this.userID = userID;
	}
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getSecretQuestion(){
		return secretQuestion;
	}
	
	public void setSecretQuestion(String secretQuestion){
		this.secretQuestion = secretQuestion;
	}
	
	public String getSecretAnswer(){
		return secretAnswer;
	}
	
	public void setSecretAnswer(String secretAnswer){
		this.secretAnswer = secretAnswer;
	}
	
	public String getUserType(){
		return userType;
	}
	
	public void setUserType(String userType){
		this.userType = userType;
	}
	
	public String toString() {
		return "User:: UserID= " + this.userID + " Username= " + this.username + " Password= " + this.password + " Email= " + this.email +
				"Secret Question= " + this.secretQuestion + "SecretAnswer= " + this.secretAnswer + "UserType= " + this.userType ;
	}
	
}
