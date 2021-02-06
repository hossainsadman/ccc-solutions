import java.io.*;
import java.util.*;

public class CCC13s2 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        
        int max = Integer.parseInt(r.readLine());
        int n = Integer.parseInt(r.readLine());
        // int[] cars = new int[n];
        LinkedList<Integer> cars = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            cars.add(Integer.parseInt(r.readLine()));
        }

        int sum = 0, i = 0;
        {
        // if (n == 1) {
        //     if (cars[0] > max) {
        //         last = 0;
        //     } else {
        //         last = 1;
        //     }
        // } else if (n == 2) {
        //     if (cars[0]+cars[1] > max) {
        //         last = 0;
        //     } else {
        //         last = 1;
        //     }
        // } else if (n == 3) {
        //     if (cars[0]+cars[1]+cars[2] > max) {
        //         last = 0;
        //     } else {
        //         last = 1;
        //     }
        // } else if (n == 4) {
        //     if (cars[0]+cars[1]+cars[2]+cars[3] > max) {
        //         last = 0;
        //     } else {
        //         last = 1;
        //     }
        // } else {
        //     for (int i = 0; i < n-4; i++) {
        //         sum = cars[i]+cars[i+1]+cars[i+2]+cars[i+3];
        //         if (sum > max) {
        //             break;
        //         }
        //         last = i+3+1;
        //     }   
        // }
        }

        LinkedList<Integer> current = new LinkedList<Integer>();
        for (i = 0; i < n; i++) {
            if (cars.size() == 0) {
                break;
            }

            current.add(cars.removeFirst());
            if (current.size()>4) {
                current.removeFirst();
            }

            sum = 0;
            for (int cur : current) {
                sum+= cur;
            }

            if (sum > max) {
                break;
            }
        }
        System.out.println(i);
    }
}
