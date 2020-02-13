package ccc._20practice;

import java.util.*;
import java.io.*;

public class ccc20practicej1 {

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
	}
}
