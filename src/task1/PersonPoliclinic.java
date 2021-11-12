package task1;

public class PersonPoliclinic {
    private String name;
    static int legs;

    public PersonPoliclinic(final String name) {
        this.name = name;
    }
    static {
        legs = 2;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public static int getLegs() {
        return legs;
    }

    public static void setLegs(final int legs) {
        PersonPoliclinic.legs = legs;
    }
}
