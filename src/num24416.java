import java.util.Scanner;

public class num24416 {
    static int cnt1 = 0, cnt2 = 0;
    static int[] memo;
    public static int fib1(int n) {
        if (n == 1 || n == 2) {
            cnt1++;
            return 1;
        }
        return fib1(n - 1) + fib1(n - 2);
    }

    public static int fib2(int n) {
        memo[0] = memo[1] = 1;

        for (int i = 2; i < n; i++) {
            cnt2++;
            memo[i] = memo[i - 2] + memo[i - 1];
        }
        return memo[n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        memo = new int[n];
        fib1(n);
        fib2(n);
        System.out.println(cnt1);
        System.out.println(cnt2);
    }
}
