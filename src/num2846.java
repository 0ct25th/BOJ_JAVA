import java.util.*;

public class num2846 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a = scanner.nextInt();
        int b = 0, up = 0, max = 0, now = 0;
        for (int i = 0; i < N - 1; i++) {
            b = scanner.nextInt();
            if (a < b) {
                up = b - a;
                now += up;
                if (now > max) {
                    max = now;
                }
            } else {
                up = 0;
                now = 0;
            }
            a = b;
        }
        System.out.println(max);
    }
}
