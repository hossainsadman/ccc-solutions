import java.io.*;
import java.util.*;

// COMPLETE

public class CCC17s1 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(read.readLine());
        String[] a = read.readLine().split(" ");
        String[] b = read.readLine().split(" ");
        int[] aa = new int[a.length], bb = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            aa[i] = Integer.parseInt(a[i]);
            bb[i] = Integer.parseInt(b[i]);
        }

        int as = 0, bs = 0;
        int k = 0;
        for (int i = 0; i < aa.length; i++) {
            as += aa[i];
            bs += bb[i];
            if (as == bs) {
                k = i + 1;
            }
        }

        System.out.println(k);
    }
}
