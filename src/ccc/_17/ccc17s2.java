package ccc._17;

import java.util.*;
import java.io.*;

public class ccc17s2 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(r.readLine());
        String[] lvls_txt = r.readLine().split(" ");
        int[] lvls = new int[lvls_txt.length];
        for (int i = 0; i < lvls_txt.length; i++) {
            lvls[i] = Integer.parseInt(lvls_txt[i]);
        }

        int highest = lvls[0];
        for (int lvl : lvls) {
            if (lvl > highest) {
                highest = lvl;
            }
        }

        Arrays.sort(lvls);
        int mid = lvls.length/2;

        if (mid % 2 != 0) {
            int n = lvls.length/2;
            System.out.print(lvls[n]+" ");
            for (int i = 0; i <= lvls.length; i++) {
                System.out.print(lvls[n-1]+" "+lvls[n+1]+" ");
            }
        } else {
            int up = lvls.length/2, down = lvls.length/2;
            for (int i = lvls.length/2; i < lvls.length; i++) {
                System.out.print(lvls[down-1]+" "+lvls[up]+" ");
                up +=1;
                down-=1;
            }
        }
        
    }
}
