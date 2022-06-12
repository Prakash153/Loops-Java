package loops;

import java.util.Scanner;

public class Fibonacc {
    public static void main(String args[]) {
        int n, t1 = 0, t2 = 1, t3;
        System.out.println("enter any number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            t3 = t1 + t2;
            System.out.println(t3 + " ");
            t1 = t2;
            t2 = t3;
        }
    }
}
