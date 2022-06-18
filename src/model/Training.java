package model;

public class Training {
	private String name;
	private TrainingType type;
	private SportsFacility facility;
	private int duration;
	private User trainer;
	private String description;
	private String image;
	
	public Training() {}
	
	public Training(String name, TrainingType type, SportsFacility facility, int duration, String description,
			String image) {
		super();
		this.name = name;
		this.type = type;
		this.facility = facility;
		this.duration = duration;
		this.description = description;
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TrainingType getType() {
		return type;
	}
	public void setType(TrainingType type) {
		this.type = type;
	}
	public SportsFacility getFacility() {
		return facility;
	}
	public void setFacility(SportsFacility facility) {
		this.facility = facility;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public User getTrainer() {
		return trainer;
	}
	public void setTrainer(User trainer) {
		this.trainer = trainer;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
