package model;

import java.util.Date;
import java.util.List;

public class User {
	
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private Gender gender;
	private Date dateOfBirth;
	private Role role;
	private TrainingHistory trainingHistory;
	private Membership membership;
	private SportsFacility managedFacility;
	private List<SportsFacility> visitedFacilities;
	private int points;
	private CustomerType customerType;
	
	public User() {}
	
	public User(String username, String password, String firstName, String lastName, Gender gender, Date dateOfBirth) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public TrainingHistory getTrainingHistory() {
		return trainingHistory;
	}
	public void setTrainingHistory(TrainingHistory trainingHistory) {
		this.trainingHistory = trainingHistory;
	}
	public Membership getMembership() {
		return membership;
	}
	public void setMembership(Membership membership) {
		this.membership = membership;
	}
	public SportsFacility getManagedFacility() {
		return managedFacility;
	}
	public void setManagedFacility(SportsFacility managedFacility) {
		this.managedFacility = managedFacility;
	}
	public List<SportsFacility> getVisitedFacilities() {
		return visitedFacilities;
	}
	public void setVisitedFacilities(List<SportsFacility> visitedFacilities) {
		this.visitedFacilities = visitedFacilities;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public CustomerType getCustomerType() {
		return customerType;
	}
	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}
	
}
