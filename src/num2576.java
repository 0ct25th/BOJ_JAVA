import java.util.Arrays;
import java.util.Scanner;

public class num2576 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int min = 100;      // 주어지는 자연수는 100보다 작음

        for (int i =0; i < 7; i++) {
            int odd = scanner.nextInt();
            if (odd % 2 != 0) {
                sum += odd;
                min = Math.min(min, odd);
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
