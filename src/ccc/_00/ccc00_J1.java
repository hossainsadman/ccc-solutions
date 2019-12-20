package ccc._00;

import java.io.*;

//	INCOMPLETE

public class ccc00_J1 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int startDay = Integer.parseInt(in.readLine());
		int endDay = Integer.parseInt(in.readLine());
		System.out.println("Sun Mon Tue Wed Thr Fri Sat");
		
		System.out.print("  ");
		for (int i = 0; i < 4 * (startDay - 1); i++) {
			System.out.print(" ");
		}
		System.out.print("1");

		
	}
}
