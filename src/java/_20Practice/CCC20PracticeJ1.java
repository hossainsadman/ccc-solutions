package src.java._20Practice;

import java.util.*;

public class CCC20PracticeJ1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		for(int i = 0; i <= 5; i++){
		      for(int j = 0; j <= i; j++){
		        if(i+j==n) sum++;
		      }
		    }
		System.out.println(sum);
        in.close();
	}
}
