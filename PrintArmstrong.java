package loops;

public class PrintArmstrong {
    public static void main(String args[]) {
        int num, count = 1;
        int sum;
        while (count <= 1000) {
            num = count;
            sum = 0;
            while (num > 0) {
                int r = num % 10;
                sum = sum + (r * r * r);
                num = num / 10;
            }
            if (sum == count) {
                System.out.println(count);
            }
            count++;
        }
    }
}

