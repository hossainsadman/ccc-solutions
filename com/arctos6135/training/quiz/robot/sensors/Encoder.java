package com.arctos6135.training.quiz.robot.sensors;

public class Encoder extends Sensor {

    public Encoder(int port) {
        this.port = port;
    }

    public double getDistance() {
        return Math.random() * 100000 - 50000;
    }
}
