package org.generation.ecommerce.dto; //nos va a permitir enviar información del backend al front end y viceversa. Es un tipo de objeto que sirve únicamente para transportar datos

public class ChangePassword {
	private String password;
	private String npassword;
	
	public ChangePassword(String password, String npassword) {
		super();
		this.password = password;
		this.npassword = npassword;
	}
	public ChangePassword() {}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNpassword() {
		return npassword;
	}
	public void setNpassword(String npassword) {
		this.npassword = npassword;
	}
	@Override
	public String toString() {
		return "ChangePassword [password=" + password + ", npassword=" + npassword + "]";
	}
}
