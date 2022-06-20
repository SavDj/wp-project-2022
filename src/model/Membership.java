package model;

import java.util.Date;

public class Membership {
	private String id;
	private MembershipType membershipType;
	private Date paymentDate;
	private Date expirationDate;
	private int price;
	private User customer;
	private boolean status;
	private int visitationNumber;
	
	public Membership() {}
	
	public Membership(String id, MembershipType membershipType, Date paymentDate, Date expirationDate, int price,
			User customer, boolean status, int visitationNumber) {
		super();
		this.id = id;
		this.membershipType = membershipType;
		this.paymentDate = paymentDate;
		this.expirationDate = expirationDate;
		this.price = price;
		this.customer = customer;
		this.status = status;
		this.visitationNumber = visitationNumber;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public MembershipType getMembershipType() {
		return membershipType;
	}
	public void setMembershipType(MembershipType membershipType) {
		this.membershipType = membershipType;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public User getCustomer() {
		return customer;
	}
	public void setCustomer(User customer) {
		this.customer = customer;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getVisitationNumber() {
		return visitationNumber;
	}
	public void setVisitationNumber(int visitationNumber) {
		this.visitationNumber = visitationNumber;
	}
	
	
}
