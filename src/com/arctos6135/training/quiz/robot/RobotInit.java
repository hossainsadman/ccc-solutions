package com.arctos6135.training.quiz.robot;

public class RobotInit {

	public static void main(String[] args) throws NameNotSetException {
		RobotBearings robot1 = new RobotBearings();
		robot1.setName("Ursus");
		robot1.setState(State.ENABLED);
		robot1.doSomethingCool();
		System.out.println(robot1.getLeftWheelDistance());
		System.out.println(robot1.getRightWheelDistance());
		System.out.println(robot1.getState());
		System.out.println(robot1.getHeading());
		System.out.println(robot1.getName());
	}
}