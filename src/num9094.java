import java.util.Scanner;

public class num9094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int cnt = 0;
            for (int a = 1; a <= n; a++) {
                for (int b = a + 1; b < n; b++) {
                    if (((a * a) + (b * b) + m) % (a * b) == 0)
                        cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
