package loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        System.out.println("enter whose factorial you want :");
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fact *= i;
            ;
        }
        System.out.println("The factorial of " + n + " is " + fact);
    }
}
