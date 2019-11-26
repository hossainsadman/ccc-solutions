package com.arctos6135.training.quiz.robot;

import com.arctos6135.training.quiz.robot.actuators.Motor;
import com.arctos6135.training.quiz.robot.sensors.Gyroscope;
import com.arctos6135.training.quiz.robot.sensors.Encoder;

/**
 * Includes commands and characteristics of a robot (e.g. left
 * and right motors, encoders, gyroscope, state)
 */
public class RobotBearings extends Robot {
	
	private Motor motorL = new Motor(0);
	private Motor motorR = new Motor(1);
	private Encoder encoderL = new Encoder(2);
	private Encoder encoderR = new Encoder(3);
	private Gyroscope gyro = new Gyroscope(4);
	private State state;
	
	/**
     * Sets the state of the robot.
     * 
     * @param state The state of the robot
     */
	public void setState(State state) {
		this.state = state;
	}

	/**
     * Gets the state of the robot.
     * 
     * @return The state of the robot
     */	
	public State getState() {
		return this.state;
	}

	@Override
	public double getLeftWheelDistance() {
		return encoderL.getDistance() * 2.54;
	}

	@Override
	public double getRightWheelDistance() {
		return encoderR.getDistance() * 2.54;
	}

	@Override
	public double getHeading() {
		return Math.abs(gyro.getHeading() % 360);
	}

	Task task = (Robot robot) -> {
		try {
			if (this.state == State.ENABLED) {
				motorL.setSpeed(200);
				motorR.setSpeed(200);
			}
			else if (this.state == State.DISABLED) {
			}
		} catch (TaskExecutionException e) {
			System.err.println("Robot state is unknown. Please set state to be ENABLED or DISABLED in order to do task.");
		}
	};

}