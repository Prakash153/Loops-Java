package loops;

import java.util.Scanner;

// write  a program to reverse a number
public class Reverse {
    public static void main(String args[]) {
        System.out.println("enter any number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while (n > 0) {

            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;

        }
        System.out.println(rev);
    }
}
