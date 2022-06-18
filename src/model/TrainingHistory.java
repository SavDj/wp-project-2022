package model;

import java.util.Date;

public class TrainingHistory {
	private Date registrationDateTime;
	private Training training;
	private User customer;
	private User trainer;
	
	public TrainingHistory() {}
	
	public TrainingHistory(Date registrationDateTime, Training training, User customer) {
		super();
		this.registrationDateTime = registrationDateTime;
		this.training = training;
		this.customer = customer;
	}
	public Date getRegistrationDateTime() {
		return registrationDateTime;
	}
	public void setRegistrationDateTime(Date registrationDateTime) {
		this.registrationDateTime = registrationDateTime;
	}
	public Training getTraining() {
		return training;
	}
	public void setTraining(Training training) {
		this.training = training;
	}
	public User getCustomer() {
		return customer;
	}
	public void setCustomer(User customer) {
		this.customer = customer;
	}
	public User getTrainer() {
		return trainer;
	}
	public void setTrainer(User trainer) {
		this.trainer = trainer;
	}
	
	
	

}
