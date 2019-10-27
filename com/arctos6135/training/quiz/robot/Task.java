package com.arctos6135.training.quiz.robot;

/**
 * A task that a {@link Robot} can do.
 */
@FunctionalInterface
public interface Task {

    /**
     * Does the task.
     */
    public void doIt();
}
