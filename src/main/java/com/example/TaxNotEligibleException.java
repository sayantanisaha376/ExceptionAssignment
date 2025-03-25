package com.example;
// Custom Exception for Tax  Eligibility
class TaxNotEligibleException extends Exception {
    //constructor
    public TaxNotEligibleException(String message) {
        super(message);
    }
}

