package loops;

import java.util.Scanner;

public class SumofN {
    public static void main(String args[]) {
        System.out.println("enter the value for N");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
