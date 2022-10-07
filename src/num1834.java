import java.util.Scanner;

public class num1834 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long ans = (N - 1) * (N + 1 + (N + 1) * (N - 1)) / 2;
        System.out.println(ans);
    }
}
