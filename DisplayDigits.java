package loops;

import java.util.Scanner;

//wap to display digits of a number
public class DisplayDigits {
    public static void main(String arg[]) {
        System.out.println("enter any number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            System.out.println(r);
            r = 0;
        }
    }
}
