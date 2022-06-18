package model;

public enum MembershipType {
    YEARLY("Yearly"),
    MONTHLY("Monthly");
	
    public final String label;

    private MembershipType(String label) {
        this.label = label;
    }
}
