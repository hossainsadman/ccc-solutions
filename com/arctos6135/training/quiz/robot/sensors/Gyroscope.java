package com.arctos6135.training.quiz.robot.sensors;

public class Gyroscope extends Sensor {

    public Gyroscope(int port) {
        this.port = port;
    }

    public double getHeading() {
        return Math.random() * Math.PI * 2 - Math.PI;
    }
}
