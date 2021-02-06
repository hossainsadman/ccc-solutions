import java.io.*;
import java.util.*;

// COMPLETE

public class CCC16s2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(r.readLine());
        int n = Integer.parseInt(r.readLine());

        String[] dmoj = r.readLine().split(" ");
        String[] peg = r.readLine().split(" ");

        int[] d = new int[n], p = new int[n];

        for (int i = 0; i < n; i++) {
            d[i] = Integer.parseInt(dmoj[i]);
            p[i] = Integer.parseInt(peg[i]);
        }

        Arrays.sort(d);
        Arrays.sort(p);

        if (q == 1) {
            int min = 0;
            for (int i = n-1; i >= 0; i--) {
                min += Math.max(d[i], p[i]);
            }
            System.out.println(min);
        } else {
            int max = 0;
            for (int i = 0; i <= n-1; i++) {
                max += Math.max(d[n-1-i], p[i]);
            }
            System.out.println(max);
        }
    }
}
