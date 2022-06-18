package model;

public enum Gender {
    MALE("Male"),
    FEMALE("Female");
	
    public final String label;

    private Gender(String label) {
        this.label = label;
    }
}
