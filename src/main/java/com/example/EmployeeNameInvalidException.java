package com.example;

// Custom Exception for EmployeeName Validation
class EmployeeNameInvalidException extends Exception {
    //constructor
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}
