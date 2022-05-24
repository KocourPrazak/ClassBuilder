package org.example.Person;

public class IllegalStateException extends RuntimeException {
    public IllegalStateException(String str) {
        // calling the constructor of parent Exception
        super(str);
    }
}
