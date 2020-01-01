package ccc._06;

import java.util.Scanner;

public class ccc06_J1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int calories = 0;
		int burger = in.nextInt();
		if (burger == 1) {
			calories += 461;
		} else if (burger == 2) {
			calories += 431;
		} else if (burger == 3) {
			calories += 420;
		}
		
		int side = in.nextInt();
		if (side == 1) {
			calories += 100;
		} else if (side == 2) {
			calories += 57;
		} else if (side == 3) {
			calories += 70;
		}

		int drink = in.nextInt();
		if (drink == 1) {
			calories += 130;
		} else if (drink == 2) {
			calories += 160;
		} else if (drink == 3) {
			calories += 118;
		}

		int dessert = in.nextInt();
		if (dessert == 1) {
			calories += 167;
		} else if (dessert == 2) {
			calories += 266;
		} else if (dessert == 3) {
			calories += 75;
		}

		System.out.println("Your total Calorie count is " + calories + ".");
	}
}