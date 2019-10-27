package com.arctos6135.training.quiz.robot;

import com.arctos6135.training.quiz.robot.sensors.Encoder;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Encoder(1).getDistance());
    }
}
