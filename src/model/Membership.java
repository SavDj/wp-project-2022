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
}
