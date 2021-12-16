package com.example.demo;
public class Customer {
	private int custId;
	private String area;
	private String email;
	public Customer() {
		super();
}
	public Customer(int custId, String area, String email)throws InvalidEmailException {
		super();
		this.custId = custId;
		this.area = area;
		if(email.contains("@") && email.contains(".com") || email.contains(".org") || email.contains(".in") ){
			this.email=email;
		}
		else {
			throw new InvalidEmailException("enter valid email id");
			}
		
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.contains("@") && email.contains(".com") || email.contains(".org") || email.contains(".in") ){
			this.email=email;
		}
		else {
			try {
				throw new InvalidEmailException("enter valid email id");
			} catch ( InvalidEmailException e) {
				e.printStackTrace();
			}
		}
		}
	@Override
	public String toString() {
		return " [custId=" + custId + ", area=" + area + ", email=" + email + "]";
	}
	

}
