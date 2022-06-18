package model;

public class SportsFacility {
	private String name;
	private SportsFacilityType type;
	private String description;
	private boolean status;
	private Location location;
	private String logo;
	private double averageRating;
	private String workingHours;
	
	public SportsFacility() {}
	
	public SportsFacility(String name, SportsFacilityType type, String description, boolean status, Location location,
			String logo, double averageRating, String workingHours) {
		super();
		this.name = name;
		this.type = type;
		this.description = description;
		this.status = status;
		this.location = location;
		this.logo = logo;
		this.averageRating = averageRating;
		this.workingHours = workingHours;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SportsFacilityType getType() {
		return type;
	}
	public void setType(SportsFacilityType type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public double getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}
	public String getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
	}
	
	
}
