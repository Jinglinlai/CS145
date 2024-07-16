public class CommissionEmployee {
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;
   private double grossSales; // gross weekly sales
   private double commissionRate; // commission percentage

   // Constructor
   public CommissionEmployee(String firstName, String lastName,
                             String socialSecurityNumber, double grossSales,
                             double commissionRate) {
      // Validate grossSales
      if (grossSales < 0.0) {
         throw new IllegalArgumentException(
                 "Gross sales must be >= 0.0");
      }
      // Validate commissionRate
      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException(
                 "Commission rate must be > 0.0 and < 1.0");
      }

      this.firstName = firstName;
      this.lastName = lastName;
      this.socialSecurityNumber = socialSecurityNumber;
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
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

   // Setter for grossSales
   public void setGrossSales(double grossSales) {
      if (grossSales < 0.0) {
         throw new IllegalArgumentException(
                 "Gross sales must be >= 0.0");
      }
      this.grossSales = grossSales;
   }

   // Getter for grossSales
   public double getGrossSales() {
      return grossSales;
   }

   // Setter for commissionRate
   public void setCommissionRate(double commissionRate) {
      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException(
                 "Commission rate must be > 0.0 and < 1.0");
      }
      this.commissionRate = commissionRate;
   }

   // Getter for commissionRate
   public double getCommissionRate() {
      return commissionRate;
   }

   // Method to calculate earnings
   public double earnings() {
      return getCommissionRate() * getGrossSales();
   }

   // Override toString method to return a string representation of the object
   @Override
   public String toString() {
      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
              "commission employee", getFirstName(), getLastName(),
              "social security number", getSocialSecurityNumber(),
              "gross sales", getGrossSales(),
              "commission rate", getCommissionRate());
   }
}
