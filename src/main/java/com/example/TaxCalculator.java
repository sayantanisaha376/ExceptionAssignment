package com.example;
// Tax Calculator class containing the business logic
class TaxCalculator {
    public double calculateTax(String empName, boolean isIndian, double empSal) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        // Checking if the employee is not Indian
        if (!isIndian) {
            // If the employee is not Indian, throwing a custom exception
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
        }

       // Checking if the employee name is null or empty
        if (empName == null || empName.equals("")) {
            // If the employee name is invalid (null or empty), throwing a custom exception
            throw new EmployeeNameInvalidException("The employee name cannot be empty.");
        }
      // Checking if the salary is greater than 1,00,000
        if (empSal > 100000) {
            // If salary is greater than 1,00,000, calculating 8% tax
            return empSal * 8 / 100;
        }
     // Checking if the salary is between 50,000 and 1,00,000
        else if (empSal >= 50000) {
            // If salary is between 50,000 and 1,00,000, calculating 6% tax
            return empSal * 6 / 100;
        }
    // Checking if the salary is between 30,000 and 50,000
        else if (empSal >= 30000) {
            // If salary is between 30,000 and 50,000, calculating 5% tax
            return empSal * 5 / 100;
        }
    // Checking if the salary is between 10,000 and 30,000
        else if (empSal >= 10000) {
            // If salary is between 10,000 and 30,000, calculating 4% tax
            return empSal * 4 / 100;
        }

        else {
            // If salary is less than 10,000, throwing a custom exception as the employee is not eligible to pay tax
            throw new TaxNotEligibleException("The employee does not need to pay tax.");
        }
    }
}

