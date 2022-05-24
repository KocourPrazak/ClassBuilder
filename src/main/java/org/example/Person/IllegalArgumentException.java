package org.example.Person;

public class IllegalArgumentException extends RuntimeException {
    public IllegalArgumentException(String str) {
        // calling the constructor of parent Exception
        super(str);
    }
}