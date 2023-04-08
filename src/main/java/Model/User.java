package model;

public class User {
	private String uName;
	private String uAddress;
	private String uContact;
	private String uGender;
	private String uEmail;
	private String encryptedPassword;
	public User(String uName, String uAddress, String uContact, String uGender, String encryptedPassword) {
		
		this.uName = uName;
		this.uAddress = uAddress;
		this.uContact = uContact;
		this.uGender = uGender;
		this.encryptedPassword = encryptedPassword;
		
		
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuAddress() {
		return uAddress;
	}
	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}
	public String getuContact() {
		return uContact;
	}
	public void setuContact(String uContact) {
		this.uContact = uContact;
	}
	
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	

}
	
	public String getuGender() {
		return uGender;
	}
	public void setuGender(String uGender) {
		this.uGender = uGender;
	}
		
		
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	
	

}
