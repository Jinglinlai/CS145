public class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    // Constructor for Employee class
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Getter for socialSecurityNumber
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // Override toString() to include common details
    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s",
                "Employee", getFirstName(), getLastName(),
                "Social Security Number", getSocialSecurityNumber());
    }
}
