package HR;

public class HeartRates {
    private final String firstName;
    private final String lastName;
    private final int birthYear;
    private final int currentYear;

    // constructor
    public HeartRates(String firstName, String lastName, int birthYear, int currentYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.currentYear = currentYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return (currentYear - birthYear);
    }

    public int getMaximumHeartRate() {
        return (220 - currentYear + birthYear);
    }

    public double getMinimumTargetHeartRate() {
        return 0.5 * getMaximumHeartRate();
    }

    public int getMaximumTargetHeartRate() {
        return 200;
    }
}

