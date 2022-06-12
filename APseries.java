package loops;

import java.util.Scanner;

public class APseries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total number of terms ");
        int n = sc.nextInt();
        System.out.println("enter first term ");

        int a = sc.nextInt();
        System.out.println("enter common difference");
        int d = sc.nextInt();
        int term;
        for (int i = 0; i < n; i++) {
            term = a + i * d;
            System.out.print(term + ",");
        }
    }
}
