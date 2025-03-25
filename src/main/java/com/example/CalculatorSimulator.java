package com.example;

class CalculatorSimulator {// Class to test the TaxCalculator class

    public static void testCase(TaxCalculator taxCalculator, String empName, double empSalary, boolean isIndian) {
        try {// Try block to handle exceptions
            double tax = taxCalculator.calculateTax(empName, isIndian, empSalary);// Calculate tax
            System.out.println("Tax amount is:- " + tax);
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            System.out.println(e.getMessage());// Print the exception message
        }
    }

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator(); // Creating object of TaxCalculator class
        testCase(taxCalculator, "Ron", 34000, false);// Test case 1
        testCase(taxCalculator, "Tim", 1000, true);// Test case 2
        testCase(taxCalculator, "Jack", 55000, true);// Test case 3
        testCase(taxCalculator, "", 30000, true);// Testcase4
    }
}