import java.util.*;import java.io.*;

// COMPLETE

public class CCC19j1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        for (int i = 3; i > 0; i--) {
            a += i*Integer.parseInt(reader.readLine());
        }
        for (int i = 3; i > 0; i--) {
            b += i*Integer.parseInt(reader.readLine());
        }
        if (a > b) {
            System.out.println("A");
        } else if (a < b) {
            System.out.println("B");
        } else {
            System.out.println("T");
        }
    }
}
