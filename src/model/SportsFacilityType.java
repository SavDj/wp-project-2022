package model;

public enum SportsFacilityType {
    GYM("Gym"),
    POOL("Pool"),
    SPORTS_CENTER("Sports center"),
    DANCE_STUDIO("Dance studio");
	
    public final String label;

    private SportsFacilityType(String label) {
        this.label = label;
    }
}
