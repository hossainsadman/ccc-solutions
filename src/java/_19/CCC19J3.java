package src.java._19;

import java.io.*;
import java.util.*;

public class CCC19J3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int lines = Integer.parseInt(reader.readLine());
        String[] inputs = new String[lines];
        for (int i = 0; i < lines; i++) {
            inputs[i] = reader.readLine();
        }

        LinkedList outputs = new LinkedList<>();
        LinkedList msg;

        for (String input: inputs) {
            msg = new LinkedList<>();
            char char_ = input.charAt(0);
            int count = 1;
            for (int i = 1; i < input.length(); i++) {
                // System.out.println(char_);
                if (char_ == input.charAt(i)) {
                    count++;
                    if (i == input.length()) {
                        System.out.print(count + " " + char_ + " ");
                    }
                } else {
                    System.out.print(count + " " + char_ + " ");
                    char_ = input.charAt(i);
                    count = 1;
                }
            }
            System.out.println();
        }
    }
}