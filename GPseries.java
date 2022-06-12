package loops;

import java.util.Scanner;

public class GPseries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total number of turns : ");
        int n = sc.nextInt();
        System.out.println("enter the first term ");
        int a = sc.nextInt();
        System.out.println("enter the common ratio ");
        int r = sc.nextInt();
        int term = a;
        for (int i = 0; i < n; i++) {
            System.out.print(term + ",");
            term = term * r;
        }
    }
}
