package model;

public enum TrainingType {
    GROUP("Group"),
    PERSONAL("Personal"),
    GYM("Gym");
	
    public final String label;

    private TrainingType(String label) {
        this.label = label;
    }
}
