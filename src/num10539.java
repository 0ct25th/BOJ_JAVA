import java.util.Scanner;

public class num10539 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
            A[i] = B[i] * (i + 1) - sum;
            sum += A[i];
        }

        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
