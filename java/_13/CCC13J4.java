import java.io.*;
import java.util.*;

public class CCC13j4 {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        int c = Integer.parseInt(in.readLine());
        TreeSet<Integer> chores = new TreeSet<>();
        for (int i = 0; i < c; i++) {
            int aChore = Integer.parseInt(in.readLine());
            chores.add(aChore);
        }
        int sum = 0;
        int counter = 0;
        for (int chore: chores) {
            if (sum + chore > t) {
                break;
            }
            sum += chore;
            counter++;
        }
        System.out.println(counter);
    }
}