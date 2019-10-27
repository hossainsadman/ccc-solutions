package com.arctos6135.training.quiz.robot.sensors;

/**
 * A gyroscope is a sensor that measures rotation.
 * 
 * <p>
 * <small>Of course, this being a quiz and not an actual robot, the sensors
 * don't actually do anything and just return random values.</small>
 * </p>
 */
public class Gyroscope extends Sensor {

    /**
     * Creates a new gyroscope object on the specified port.
     * 
     * @param port The port the gyroscope is on
     */
    public Gyroscope(int port) {
        this.port = port;
    }

    /**
     * Gets the heading (direction) of the robot, <strong>in degrees</strong>.
     * 
     * @return The heading of the robot <strong>in degrees</strong>
     */
    public double getHeading() {
        return Math.random() * Math.PI * 2 - Math.PI;
    }
}
