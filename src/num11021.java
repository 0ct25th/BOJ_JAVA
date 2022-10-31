import java.util.Scanner;

public class num11021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int cnt = 1;
        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int sum = A + B;
            System.out.println("Case #" + cnt + ": " + sum);
            cnt++;
        }
    }
}
