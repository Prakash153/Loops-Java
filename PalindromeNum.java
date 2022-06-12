package loops;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String args[]) {
        System.out.println("enter any number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n, rev = 0;
        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        if (rev == m) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number ");
        }
    }
}
