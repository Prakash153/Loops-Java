package loops;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String args[]) {
        System.out.println("enter the armstrong number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int m = n;
        while (n > 0) {
            int r = n % 10;
            int cube = r * r * r;
            sum += cube;
            n = n / 10;
        }
        if (m == sum) {
            System.out.println("Armstrong number ");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
