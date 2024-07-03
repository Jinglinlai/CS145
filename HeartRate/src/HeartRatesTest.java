//Jing Lin and Vi
import HR.HeartRates;// used package and import into this file for extra credit
import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();  // Read the entire line (including spaces)

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your year of birth: ");
        int birthYear = scanner.nextInt();  // Read an integer

        // Assuming the current year is 2024
        int currentYear = 2024;

        // Create a HeartRates object based on user input
        HeartRates user = new HeartRates(firstName, lastName, birthYear, currentYear);

        System.out.println("\nHere's your heart rate information:");
        System.out.printf("First name: %s%n", user.getFirstName());
        System.out.printf("Last name: %s%n", user.getLastName());
        System.out.printf("Age: %d%n", user.getAge());
        System.out.printf("Maximum heart rate: %d%n", user.getMaximumHeartRate());
        System.out.println("Target heart rate range:");
        System.out.printf(" Minimum: %.0f%n", user.getMinimumTargetHeartRate());
        System.out.printf(" Maximum: %d%n", user.getMaximumTargetHeartRate());

        scanner.close();  // Close the Scanner object
    } // end main
}
