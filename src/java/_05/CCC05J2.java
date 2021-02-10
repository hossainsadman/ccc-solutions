package src.java._05;

import java.io.*;
import java.util.*;

//	COMPLETE

public class CCC05J2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println("The number of RSA numbers between " + a + " and " + b + " is " + rsa(a, b));
	}

	public static int rsa(int low, int high) {
		int rsas = 0;
		for (int i = low; i <= high; i++) {
			int divisors = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					divisors++;
				}
			}
			if (divisors == 4) {
				rsas++;
			}
		}
		return rsas;
	}
}