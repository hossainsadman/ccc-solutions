package com.arctos6135.training.quiz.robot;

public class TaskExecutionException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 6326571580386933355L;

    public TaskExecutionException() {
    }

    public TaskExecutionException(String message) {
        super(message);
    }

    public TaskExecutionException(Throwable cause) {
        super(cause);
    }

    public TaskExecutionException(String message, Throwable cause) {
        super(message, cause);
    }
}
