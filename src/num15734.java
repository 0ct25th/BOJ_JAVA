import java.util.Scanner;

public class num15734 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int A = scanner.nextInt();

        int sum = L + A + R;
        int tmp = A - Math.abs(L - R);
        if (tmp >= 0)
            System.out.println(sum - tmp % 2);
        else
            System.out.println(sum - Math.abs(tmp));
    }
}
