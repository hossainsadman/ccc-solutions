package src.java._12;

import java.io.*;

public class CCC12S2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        int[] a = new int[input.length()/2];
        int[] r = new int[input.length()/2];

        int i = 0;
        for (int j = 0; j <= input.length()-2; j +=2) {
            a[i] = Integer.parseInt(Character.toString(input.charAt(j)));
            i++;
        }

        i = 0;
        for (int j = 1; j <= input.length()-1; j +=2) {
            r[i] = roman(input.charAt(j));
            i++;
        }

        int sum = 0, tmp = 0;
        for (int j = 0; j < a.length; j++) {
            tmp = a[j]*r[j];
            if (j != a.length-1 && r[j+1]>r[j]) {
                tmp *= -1;
            }
            sum += tmp;
        }

        System.out.println(sum);
    }

    static int roman(char chara) {
        String c = Character.toString(chara);
        if (c.equals("M")) {
            return 1000;
        } else if (c.equals("D")) {
            return 500;
        } else if (c.equals("C")) {
            return 100;
        } else if (c.equals("L")) {
            return 50;
        } else if (c.equals("X")) {
            return 10;
        } else if (c.equals("V")) {
            return 5;
        }
        return 1;
    }
}
