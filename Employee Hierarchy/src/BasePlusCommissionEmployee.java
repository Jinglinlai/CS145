public class BasePlusCommissionEmployee {
   private CommissionEmployee commissionEmployee; // Composition
   private double baseSalary; // Base salary per week

   // Constructor
   public BasePlusCommissionEmployee(String firstName, String lastName,
                                     String socialSecurityNumber, double grossSales, double commissionRate,
                                     double baseSalary) {
      if (baseSalary < 0.0) {
         throw new IllegalArgumentException(
                 "Base salary must be >= 0.0");
      }

      commissionEmployee = new CommissionEmployee(firstName, lastName,
              socialSecurityNumber, grossSales, commissionRate);
      this.baseSalary = baseSalary;
   }

   // Getter for first name (delegated to CommissionEmployee)
   public String getFirstName() {
      return commissionEmployee.getFirstName();
   }

   // Getter for last name (delegated to CommissionEmployee)
   public String getLastName() {
      return commissionEmployee.getLastName();
   }

   // Getter for social security number (delegated to CommissionEmployee)
   public String getSocialSecurityNumber() {
      return commissionEmployee.getSocialSecurityNumber();
   }

   // Setter for gross sales (delegated to CommissionEmployee)
   public void setGrossSales(double grossSales) {
      commissionEmployee.setGrossSales(grossSales);
   }

   // Getter for gross sales (delegated to CommissionEmployee)
   public double getGrossSales() {
      return commissionEmployee.getGrossSales();
   }

   // Setter for commission rate (delegated to CommissionEmployee)
   public void setCommissionRate(double commissionRate) {
      commissionEmployee.setCommissionRate(commissionRate);
   }

   // Getter for commission rate (delegated to CommissionEmployee)
   public double getCommissionRate() {
      return commissionEmployee.getCommissionRate();
   }

   // Setter for base salary
   public void setBaseSalary(double baseSalary) {
      if (baseSalary < 0.0) {
         throw new IllegalArgumentException(
                 "Base salary must be >= 0.0");
      }
      this.baseSalary = baseSalary;
   }

   // Getter for base salary
   public double getBaseSalary() {
      return baseSalary;
   }

   // Method to calculate earnings (base salary + commission earnings)
   public double earnings() {
      return getBaseSalary() + commissionEmployee.earnings();
   }

   // Override toString method to return a string representation of the object
   @Override
   public String toString() {
      return String.format("%s %s\n%s: %.2f", "base-salaried",
              commissionEmployee.toString(), "base salary", getBaseSalary());
   }
}
