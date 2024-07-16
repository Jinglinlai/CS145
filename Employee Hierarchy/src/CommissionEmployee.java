public class CommissionEmployee extends Employee {
   private double grossSales;
   private double commissionRate;

   // Constructor for CommissionEmployee class
   public CommissionEmployee(String firstName, String lastName,
                             String socialSecurityNumber, double grossSales,
                             double commissionRate) {
      super(firstName, lastName, socialSecurityNumber);

      if (grossSales < 0.0) {
         throw new IllegalArgumentException("Gross sales must be >= 0.0");
      }

      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
      }

      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   }

   // Setter for grossSales
   public void setGrossSales(double grossSales) {
      if (grossSales < 0.0) {
         throw new IllegalArgumentException("Gross sales must be >= 0.0");
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
         throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
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

   // Override toString() to include CommissionEmployee details
   @Override
   public String toString() {
      return String.format("%s%n%s: %.2f%n%s: %.2f",
              super.toString(), "Gross Sales", getGrossSales(),
              "Commission Rate", getCommissionRate());
   }
}
