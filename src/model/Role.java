package model;

public enum Role {
    ADMINISTRATOR("Administrator"),
    MANAGER("Manager"),
    TRAINER("Trainer"),
    CONSUMER("Consumer");
	
    public final String label;

    private Role(String label) {
        this.label = label;
    }
}
