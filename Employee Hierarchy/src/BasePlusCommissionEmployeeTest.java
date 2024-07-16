//Jing Lin and Vi
public class BasePlusCommissionEmployeeTest {

    public static void main(String[] args) {
        // Create a new BasePlusCommissionEmployee object
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                "Good", "Fella", "123-45-6789", 5000.0, 0.06, 300.0);

        // Display the initial state of the BasePlusCommissionEmployee object
        System.out.println("Initial details:");
        System.out.println(employee);

        // Update gross sales and commission rate
        employee.setGrossSales(6000.0);
        employee.setCommissionRate(0.05);

        // Update base salary
        employee.setBaseSalary(350.0);

        // Display the updated state of the BasePlusCommissionEmployee object
        System.out.println("\nUpdated details:");
        System.out.println(employee);

        // Display earnings
        System.out.printf("\nEarnings: $%.2f%n", employee.earnings());
    }
}
