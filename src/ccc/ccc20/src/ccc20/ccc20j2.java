package ccc20;

import java.util.*;
import java.io.*;

public class ccc20j2 {

	public static void main(String[] args) throws IOException {
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 int p = Integer.parseInt(in.readLine());
		 int n = Integer.parseInt(in.readLine());
		 int r = Integer.parseInt(in.readLine());
		 int total = n;
		 int counter = 1;
		 if (r == 1) {
			 while (total < p) {
				 total += n;
				 counter++;
			 }
		 } else if (n == 1) {
			 while (total < p) {
				 total += Math.pow(r, counter);
				 counter++;
			 }
			 counter = counter - 1;
		 } else if (n > p) {
			 counter = 0;
		 } else {
			 while (total < p) {
				 n = n * r;
				 total += n;
				 counter++;
			 }
		 }
		 
		 System.out.println(counter);
	}

}
