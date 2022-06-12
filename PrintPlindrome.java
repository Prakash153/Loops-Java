package loops;

public class PrintPlindrome {
    public static void main(String args[]) {
        int count = 1, num, rev;
        while (count <= 100000) {
            num = count;
            rev = 0;
            while (num > 0) {
                int r = num % 10;
                rev = rev * 10 + r;
                num /= 10;
            }
            if (rev == count) {
                System.out.println(count);
            }
            count++;
        }
    }
}
