package com.arctos6135.training.quiz.robot;

public class NameNotSetException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 5305964759950943326L;
    
    public NameNotSetException() {
    }

    public NameNotSetException(String message) {
        super(message);
    }

    public NameNotSetException(Throwable cause) {
        super(cause);
    }

    public NameNotSetException(String message, Throwable cause) {
        super(message, cause);
    }
}
