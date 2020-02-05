package ccc._18;

import java.io.*;
import java.util.*;

//  INCOMPLETE

public class ccc18j4 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<ArrayList<Integer>> data = new ArrayList<>();
        int n = Integer.parseInt(in.readLine());
        for (int i = 0; i < n; i ++) {
            String[] input = in.readLine().split(" ");
            ArrayList<Integer> row = new ArrayList<>();
            for (String num: input) {
                row.add(Integer.parseInt(num));
            }
            data.add(row);
        }
        System.out.println(data.toString());
        while (true) {
            if (accurate(data, n)) {
                break;
            } else {
                data = spin(data, n);
            }
        }
        for (ArrayList<Integer> row: data) {
            for (int num: row) {
                System.out.print(num);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static boolean accurate(ArrayList<ArrayList<Integer>> data, int n) {
        for (ArrayList<Integer> row: data) {
            for (int num: row) {
                if (num == row.get(row.size() - 1)) {
                } else if (num > row.get(row.indexOf(num) + 1)) {
                    System.out.println("false");
                    return false;
                }
            }
        }
        return true;
    }

    static ArrayList<ArrayList<Integer>> spin(ArrayList<ArrayList<Integer>> data, int n) {
        ArrayList<ArrayList<Integer>> newdata = data;
        for (int i = 0; i < n - 2; i++) {
            ArrayList<Integer> newrow = new ArrayList<>();
            for (ArrayList<Integer> row: data) {
                newrow.add(i, row.get(i));
            }
            newdata.add(newrow);
        }
        return newdata;
    }
}