package src.java._07;

import java.io.*;
import java.util.*;

//	INCOMPLETE

public class CCC07J5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		TreeSet<Integer> stops = new TreeSet<Integer>();
		initialStops(stops);

		int a = in.nextInt();
		int b = in.nextInt();
		int addStops = in.nextInt();

		int i = 0;
		while (i < addStops) {
			int tmp = in.nextInt();
			stops.add(tmp);
		}

		int counter = 0;
		int[] stopsArray = new int[stops.toArray().length];
		i = 0;
		for (Object stop: stops.toArray()) {
			stopsArray[i] = (int) stop.toString().charAt(i);
			i++;
		}

		for (int elem: stopsArray) {
			System.out.println(elem);
		}
	}

	public static void initialStops(TreeSet<Integer> stops) {
		stops.add(0);
		stops.add(990);
		stops.add(1010);
		stops.add(1970);
		stops.add(2030);
		stops.add(2940);
		stops.add(3060);
		stops.add(3930);
		stops.add(4060);
		stops.add(4970);
		stops.add(5030);
		stops.add(5990);
		stops.add(6010);
		stops.add(7000);
	}
}