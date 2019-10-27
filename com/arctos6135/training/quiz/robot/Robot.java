package com.arctos6135.training.quiz.robot;

public abstract class Robot {
    
    public abstract double getLeftWheelDistance();

    public abstract double getRightWheelDistance();

    public abstract double getHeading();

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doSomethingCool() throws NameNotSetException {
        if(name == null) {
            throw new NameNotSetException("Name is not set!");
        }

        System.out.println(name + " is doing something cool!");
    }

    public void doTask(Task task) {
        try {
            task.doIt();
            System.out.println("Task successfully done!");
        }
        catch(TaskExecutionException e) {
            System.err.println("Oh no, task execution failed!");
            e.printStackTrace();
        }
    }
}
