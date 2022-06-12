package loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[]) {
        System.out.println("enter the number whose table you want : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int z = i * n;
            System.out.println(i + " x " + n + " = " + z);
        }

    }
}
