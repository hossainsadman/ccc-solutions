package ccc._13;

import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class ccc13j3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String year = in.readLine();
        String newyear = year;
        String[] newnums;
        boolean rerun = false;
        while (true) {
            HashSet<String> nums = new HashSet<>();
            newyear = Integer.toString((Integer.parseInt(newyear) + 1));
            newnums = newyear.split("");
            System.out.println(newyear);
            TimeUnit.MILLISECONDS.sleep(250);
            for (String newnum: newnums) {
                if (nums.contains(newnum)) {
                    System.out.println(newnum);
                    System.out.println(nums.toString());
                    rerun = true;
                    break;
                }
                nums.add(newnum);
            }
            nums.clear();
            if (rerun == true) {
                continue;
            } else {
                break;
            }
        }
        System.out.println(newyear);
        
    }
}