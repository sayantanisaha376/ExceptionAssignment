package com.example;

// Custom Exception for Country Validation
class CountryNotValidException extends Exception {
    //constructor
    public CountryNotValidException(String message) {
        super(message);
    }
}

