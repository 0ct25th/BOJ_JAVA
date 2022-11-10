import java.util.Arrays;
import java.util.Scanner;

public class num1037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] div = new int[N];

        for (int i = 0; i < N; i++) {
            div[i] = scanner.nextInt();
        }

        Arrays.sort(div);

        if (N == 1)
            System.out.println(div[0] * div[0]);
        else
            System.out.println(div[0] * div[N - 1]);
    }
}
