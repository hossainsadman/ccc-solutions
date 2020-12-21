package ccc._19;

import java.util.*;
import java.io.*;

// COMPLETE

public class ccc19j2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int lines = Integer.parseInt(reader.readLine());
        String[] msgs = new String[lines];
        for (int i = 0; i < lines; i++) {
            String[] input = reader.readLine().split(" ");
            msgs[i] = input[1].repeat(Integer.parseInt(input[0]));
        }
        for (String msg: msgs) {
            System.out.println(msg);
        }
    }
}
